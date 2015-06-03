package com.example.darshan.retrofitdemo.api;


import com.example.darshan.retrofitdemo.model.response.ActionTagModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by darshan.mistry on 5/27/2015.
 */
public interface ApiInterface {

  /*  public String BASE_URL = "http://mbta.softwebcms.com/service";

    @Headers("Content-Type: application/json")
    @POST("/login")
    void getLoginInfo(@Body LoginRequestModel loginObj, Callback<LoginResponseModel> cb);*/

    String BASE_URL = "http://www.altraapp.com/Altraappservice/Altraapp.svc/Altraapp/";

    @GET("/GetProductField")
    void getActionEqualUrl(@Query("TokenID") String tockenId, Callback<ActionTagModel> cb);


}
