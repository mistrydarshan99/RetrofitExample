package com.example.darshan.retrofitdemo.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

/**
 * Created by darshan.mistry on 5/27/2015.
 */
public class BaseActivity extends Activity {

    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void showDialog(String message){
        dialog = new ProgressDialog(BaseActivity.this);
        if (message.length() > 0){
            dialog.setMessage(message);
        } else {
            dialog.setMessage("Please Wait...");
        }
        dialog.setCancelable(false);
        dialog.show();
    }

    public void hideDialog(){
        if (dialog.isShowing()){
            dialog.dismiss();
        }
    }
}
