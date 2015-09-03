package com.example.darshan.retrofitdemo.model.request;

/**
 * Created by vaibhav.jani on 20-Jul-15.
 */


public class LoginRequest {

    private String DMSID;

    private String DriverCode;

    private String Password;

    public String getDMSID() {
        return DMSID;
    }

    public void setDMSID(String DMSID) {
        this.DMSID = DMSID;
    }

    public String getDriverCode() {
        return DriverCode;
    }

    public void setDriverCode(String driverCode) {
        DriverCode = driverCode;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
