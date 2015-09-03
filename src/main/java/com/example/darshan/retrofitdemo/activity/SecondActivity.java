package com.example.darshan.retrofitdemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.activeandroid.ActiveAndroid;
import com.example.darshan.retrofitdemo.R;
import com.example.darshan.retrofitdemo.model.request.LoginRequest;
import com.example.darshan.retrofitdemo.model.response.ActionTagModel;
import com.example.darshan.retrofitdemo.model.response.LongResponse;
import com.example.darshan.retrofitdemo.model.response.LongResponseRealm;
import com.example.darshan.retrofitdemo.model.response.ObjectList;
import com.example.darshan.retrofitdemo.model.response.ObjectListRealm;
import com.example.darshan.retrofitdemo.model.response.ProductCatagory;
import com.example.darshan.retrofitdemo.restUtils.RestClient;
import com.nanotasks.BackgroundWork;
import com.nanotasks.Completion;
import com.nanotasks.Tasks;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Observable;
import rx.Observer;
import rx.functions.Func1;


public class SecondActivity extends BaseActivity {

    private Button btnCallApi;
    public static final String TAG = "Retrofit";

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain a Realm instance
        realm = Realm.getInstance(SecondActivity.this);

        RealmQuery<ObjectListRealm> query = realm.where(ObjectListRealm.class);

        // Add query conditions:
        query.equalTo("City", "WARRIOR");

        // Execute the query:
        RealmResults<ObjectListRealm> result1 = query.findAll();

        Log.e("Darshan", "----------------query fire------------>"+result1.size());
        Log.e("Darshan", "----------------query fire---Active android--------->"+ObjectList.getItem().size());

        btnCallApi = (Button) findViewById(R.id.btnCallApi);
        btnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
                String strDate = sdf.format(c.getTime());
                Log.e("Darshan", "-----------WS Start------------>" + strDate);

//                actionUrlData();

                /*Type 2 using rxJava*/
//                rxJavaApiCall();

                /*connectionCall();*/

                /*[ Long response data ]*/
                getLonagResponseData();

//                getLonagResponseDataRealm();

            }
        });
    }

    private void actionUrlData(){
        showDialog("");
        RestClient.get().getActionEqualUrl("5b56ab71ad8c42cda169a7ce19032a38", new Callback<ActionTagModel>() {
            @Override
            public void success(ActionTagModel actionUrlResponse, Response response) {
                hideDialog();
                Log.e(TAG, "-------Login response done-------" + actionUrlResponse.getMessage());
            }

            @Override
            public void failure(RetrofitError error) {
                hideDialog();
                if (error.getKind() == RetrofitError.Kind.CONVERSION) {
                    Toast.makeText(SecondActivity.this, "Conversion Error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.HTTP) {
                    Toast.makeText(SecondActivity.this, "Http connection error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.NETWORK) {
                    Toast.makeText(SecondActivity.this, "Connection Timeout. Please verify your internet connection.", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.UNEXPECTED) {
                    Toast.makeText(SecondActivity.this, "Somthing went to wrong", Toast.LENGTH_SHORT).show();
                }
                Log.e(TAG, "-------Login error aavi bhai-------" + error.getMessage());
            }
        });
    }


    private void getLonagResponseData(){
        showDialog("");
        RestClient.get().getLongResponse("123456", new Callback<LongResponse>() {
            @Override
            public void success(LongResponse actionUrlResponse, Response response) {
                hideDialog();
                Log.e(TAG, "-------Login response done-------");
                callNanoTask(actionUrlResponse);
            }

            @Override
            public void failure(RetrofitError error) {
                hideDialog();
                if (error.getKind() == RetrofitError.Kind.CONVERSION) {
                    Toast.makeText(SecondActivity.this, "Conversion Error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.HTTP) {
                    Toast.makeText(SecondActivity.this, "Http connection error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.NETWORK) {
                    Toast.makeText(SecondActivity.this, "Connection Timeout. Please verify your internet connection.", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.UNEXPECTED) {
                    Toast.makeText(SecondActivity.this, "Somthing went to wrong", Toast.LENGTH_SHORT).show();
                }
                Log.e(TAG, "-------Login error aavi bhai-------" + error.getMessage());
            }
        });
    }

    private void getLonagResponseDataRealm(){
        showDialog("");
        RestClient.get().getLongResponseRealm("123456", new Callback<LongResponseRealm>() {
            @Override
            public void success(LongResponseRealm actionUrlResponse, Response response) {
                hideDialog();
                Log.e(TAG, "-------Login response done-------");

                List<ObjectListRealm> listItems = actionUrlResponse.getObjectList();



                // Copy elements from Retrofit to Realm to persist them.
                realm.beginTransaction();
                List<ObjectListRealm> realmRepos = realm.copyToRealmOrUpdate(listItems);
                realm.commitTransaction();

                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
                String strDate = sdf.format(c.getTime());
                Log.e("Darshan", "-----------WS End------------>" + strDate);
            }

            @Override
            public void failure(RetrofitError error) {
                hideDialog();
                if (error.getKind() == RetrofitError.Kind.CONVERSION) {
                    Toast.makeText(SecondActivity.this, "Conversion Error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.HTTP) {
                    Toast.makeText(SecondActivity.this, "Http connection error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.NETWORK) {
                    Toast.makeText(SecondActivity.this, "Connection Timeout. Please verify your internet connection.", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.UNEXPECTED) {
                    Toast.makeText(SecondActivity.this, "Somthing went to wrong", Toast.LENGTH_SHORT).show();
                }
                Log.e(TAG, "-------Login error aavi bhai-------" + error.getMessage());
            }
        });
    }

    private void callNanoTask(final LongResponse actionUrlResponse){
        Tasks.executeInBackground(this, new BackgroundWork<String>() {

            @Override
            public String doInBackground() throws Exception {
                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
                String strDate = sdf.format(c.getTime());
                Log.e("Darshan", "------------Start------------>"+strDate);
                if (actionUrlResponse != null){
                    ActiveAndroid.beginTransaction();
                    List<ObjectList> listItem = actionUrlResponse.getObjectList();
                    for (ObjectList obj : listItem){
                        obj.save();
                        List<ProductCatagory> listProduct = obj.getProductCatagories();
                        for (ProductCatagory objProduct : listProduct){
                            objProduct.save();
                        }
                    }
                    ActiveAndroid.setTransactionSuccessful();
                    ActiveAndroid.endTransaction();
                }
                return null;
            }
        }, new Completion<String>() {
            @Override
            public void onSuccess(Context context, String s) {
               hideDialog();
                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
                String strDate = sdf.format(c.getTime());
                Log.e("Darshan", "--------------end---------->" + strDate);

            }

            @Override
            public void onError(Context context, Exception e) {
                hideDialog();
                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
                String strDate = sdf.format(c.getTime());
                Log.e("Darshan", "---------end--------------->" + strDate);
            }
        });
    }

    private void connectionCall(){
        showDialog("");
        LoginRequest loginRequest = new LoginRequest();

        loginRequest.setDMSID("1");
        loginRequest.setDriverCode("A");
        loginRequest.setPassword("111");


        RestClient.get().login(loginRequest, new Callback<ActionTagModel>() {
            @Override
            public void success(ActionTagModel actionUrlResponse, Response response) {
                hideDialog();
                Log.e(TAG, "-------Login response done-------" + actionUrlResponse.getMessage());
            }

            @Override
            public void failure(RetrofitError error) {
                hideDialog();
                if (error.getKind() == RetrofitError.Kind.CONVERSION) {
                    Toast.makeText(SecondActivity.this, "Conversion Error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.HTTP) {
                    Toast.makeText(SecondActivity.this, "Http connection error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.NETWORK) {
                    Toast.makeText(SecondActivity.this, "Connection Timeout. Please verify your internet connection.", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.UNEXPECTED) {
                    Toast.makeText(SecondActivity.this, "Somthing went to wrong", Toast.LENGTH_SHORT).show();
                }
                Log.e(TAG, "-------Login error aavi bhai-------" + error.getMessage());
            }
        });
    }

    private void rxJavaApiCall(){
       RestClient.get().getDataUsigRxJava("")
               .flatMap(new Func1<ActionTagModel, Observable<?>>() {
                   @Override
                   public Observable<?> call(ActionTagModel actionTagModel) {
                       return null;
                   }
               });
    }

    private Observer<ActionTagModel> obserVerApi(){
        return new Observer<ActionTagModel>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ActionTagModel actionTagModel) {
                Log.e(TAG, "-------Login response done-------" + actionTagModel.getMessage());
            }
        };
    }

    private Observable<ActionTagModel> fetchData(String id){

        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.e("Demo","======================Main Thread");
        } else {
            Log.e("Demo","======================Not Main Thread");
        }
      return RestClient.get().getDataUsigRxJava(id);
    }

  /*  private void loginApiCall() {
        showDialog("");

        LoginRequestModel loginRequestObj = new LoginRequestModel();
        loginRequestObj.setDevice_type("ANDROID");
        loginRequestObj.setPassword("test123");
        loginRequestObj.setUsername("macmiller");

        RestClient.get().getLoginInfo(loginRequestObj, new Callback<LoginResponseModel>() {
            @Override
            public void success(LoginResponseModel loginModel, Response response) {
                hideDialog();
                Log.e(TAG, "-------Login response done-------" + loginModel.getStatus());
            }

            @Override
            public void failure(RetrofitError error) {
                hideDialog();
                if (error.getKind() == RetrofitError.Kind.CONVERSION) {
                    Toast.makeText(MainActivity.this, "Conversion Error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.HTTP) {
                    Toast.makeText(MainActivity.this, "Http connection error", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.NETWORK) {
                    Toast.makeText(MainActivity.this, "Connection Timeout. Please verify your internet connection.", Toast.LENGTH_SHORT).show();
                } else if (error.getKind() == RetrofitError.Kind.UNEXPECTED) {
                    Toast.makeText(MainActivity.this, "Somthing went to wrong", Toast.LENGTH_SHORT).show();
                }
                Log.e(TAG, "-------Login error aavi bhai-------" + error.getMessage());
            }
        });


    }*/

}
