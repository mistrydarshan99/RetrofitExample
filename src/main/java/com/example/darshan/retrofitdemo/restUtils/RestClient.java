package com.example.darshan.retrofitdemo.restUtils;

import com.example.darshan.retrofitdemo.api.ApiInterface;
import com.example.darshan.retrofitdemo.model.response.ObjectListRealm;
import com.example.darshan.retrofitdemo.serilizer.ItemSerlizer;
import com.example.darshan.retrofitdemo.serilizer.ProductSerlize;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import io.realm.RealmObject;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
* Created by darshan.mistry on 5/27/2015.
*/
public class RestClient {

    private static ApiInterface REST_CLIENT;

    static {
        setupRestClient();
    }

    private RestClient() {}

    public static ApiInterface get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(2, TimeUnit.MINUTES);
        client.setReadTimeout(5, TimeUnit.MINUTES);
        client.setFollowRedirects(true);

        Gson gson = null;
        try {
            gson = new GsonBuilder()
                    .setExclusionStrategies(new ExclusionStrategy() {
                        @Override
                        public boolean shouldSkipField(FieldAttributes f) {
                            return f.getDeclaringClass().equals(RealmObject.class);
                        }

                        @Override
                        public boolean shouldSkipClass(Class<?> clazz) {
                            return false;
                        }
                    })
                    .registerTypeAdapter(Class.forName("io.realm.ObjectListRealmRealmProxy"), new ItemSerlizer())
                    .registerTypeAdapter(Class.forName("io.realm.ProductCatagoryRealmRealmProxy"), new ProductSerlize())
                    .create();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new GsonConverter(gson))
                .setEndpoint(ApiInterface.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client))
                .build();

        REST_CLIENT = restAdapter.create(ApiInterface.class);
    }

}
