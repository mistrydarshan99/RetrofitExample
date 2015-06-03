package com.example.darshan.retrofitdemo.restUtils;

import com.example.darshan.retrofitdemo.api.ApiInterface;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

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
        client.setConnectTimeout(1, TimeUnit.MINUTES);
        client.setReadTimeout(1, TimeUnit.MINUTES);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ApiInterface.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client))
                .build();

        REST_CLIENT = restAdapter.create(ApiInterface.class);
    }

}
