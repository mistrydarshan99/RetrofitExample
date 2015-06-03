package com.example.darshan.retrofitdemo.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.darshan.retrofitdemo.R;
import com.example.darshan.retrofitdemo.model.request.LoginRequestModel;
import com.example.darshan.retrofitdemo.model.response.ActionTagModel;
import com.example.darshan.retrofitdemo.model.response.LoginResponseModel;
import com.example.darshan.retrofitdemo.restUtils.RestClient;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends BaseActivity {

    private Button btnCallApi;
    public static final String TAG = "Retrofit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallApi = (Button) findViewById(R.id.btnCallApi);
        btnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionUrlData();
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
