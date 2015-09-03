package com.example.darshan.retrofitdemo.api;


import com.example.darshan.retrofitdemo.model.request.LoginRequest;
import com.example.darshan.retrofitdemo.model.response.ActionTagModel;
import com.example.darshan.retrofitdemo.model.response.LongResponse;
import com.example.darshan.retrofitdemo.model.response.LongResponseRealm;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by darshan.mistry on 5/27/2015.
 */
public interface ApiInterface {

  /*  public String BASE_URL = "http://mbta.softwebcms.com/service";

    @Headers("Content-Type: application/json")
    @POST("/login")
    void getLoginInfo(@Body LoginRequestModel loginObj, Callback<LoginResponseModel> cb);*/

//    String BASE_URL = "http://www.altraapp.com/Altraappservice/Altraapp.svc/Altraapp/";

//    String BASE_URL = "http://192.168.3.106/RouteRunner/REST";
    String BASE_URL = "http://www.altraapp.com/AltraAppService/AltraApp.svc/AltraApp";

    @GET("/GetProductField")
    void getActionEqualUrl(@Query("TokenID") String tockenId, Callback<ActionTagModel> cb);

    @GET("/GetProductField")
    Observable<ActionTagModel> getDataUsigRxJava(@Query("TokenID") String tockenId);


    @Headers("Content-Type: application/json")
    @POST("/Login")
    void login(@Body LoginRequest loginRequest, Callback<ActionTagModel> cb);


  @GET("/GetDealers")
  void getLongResponse(@Query("UserToken") String tockenId, Callback<LongResponse> cb);


  @GET("/GetDealers")
  void getLongResponseRealm(@Query("UserToken") String tockenId, Callback<LongResponseRealm> cb);
}
