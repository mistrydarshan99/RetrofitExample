package com.example.darshan.retrofitdemo.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseModel {

    @Expose
    private Integer id;
    @SerializedName("inspector_code")
    @Expose
    private String inspectorCode;
    @SerializedName("inspector_username")
    @Expose
    private String inspectorUsername;
    @SerializedName("inspector_name")
    @Expose
    private String inspectorName;
    @SerializedName("inspector_city")
    @Expose
    private String inspectorCity;
    @SerializedName("inspector_state")
    @Expose
    private String inspectorState;
    @SerializedName("inspector_country")
    @Expose
    private String inspectorCountry;
    @SerializedName("inspector_zip")
    @Expose
    private String inspectorZip;
    @SerializedName("inspector_phone")
    @Expose
    private String inspectorPhone;
    @SerializedName("inspector_email")
    @Expose
    private String inspectorEmail;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("device_type")
    @Expose
    private String deviceType;
    @Expose
    private Integer chktoken;

    private String status;
    private String message;

    public String getMessage() {
        return message;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The inspectorCode
     */
    public String getInspectorCode() {
        return inspectorCode;
    }

    /**
     *
     * @param inspectorCode
     * The inspector_code
     */
    public void setInspectorCode(String inspectorCode) {
        this.inspectorCode = inspectorCode;
    }

    /**
     *
     * @return
     * The inspectorUsername
     */
    public String getInspectorUsername() {
        return inspectorUsername;
    }

    /**
     *
     * @param inspectorUsername
     * The inspector_username
     */
    public void setInspectorUsername(String inspectorUsername) {
        this.inspectorUsername = inspectorUsername;
    }

    /**
     *
     * @return
     * The inspectorName
     */
    public String getInspectorName() {
        return inspectorName;
    }

    /**
     *
     * @param inspectorName
     * The inspector_name
     */
    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    /**
     *
     * @return
     * The inspectorCity
     */
    public String getInspectorCity() {
        return inspectorCity;
    }

    /**
     *
     * @param inspectorCity
     * The inspector_city
     */
    public void setInspectorCity(String inspectorCity) {
        this.inspectorCity = inspectorCity;
    }

    /**
     *
     * @return
     * The inspectorState
     */
    public String getInspectorState() {
        return inspectorState;
    }

    /**
     *
     * @param inspectorState
     * The inspector_state
     */
    public void setInspectorState(String inspectorState) {
        this.inspectorState = inspectorState;
    }

    /**
     *
     * @return
     * The inspectorCountry
     */
    public String getInspectorCountry() {
        return inspectorCountry;
    }

    /**
     *
     * @param inspectorCountry
     * The inspector_country
     */
    public void setInspectorCountry(String inspectorCountry) {
        this.inspectorCountry = inspectorCountry;
    }

    /**
     *
     * @return
     * The inspectorZip
     */
    public String getInspectorZip() {
        return inspectorZip;
    }

    /**
     *
     * @param inspectorZip
     * The inspector_zip
     */
    public void setInspectorZip(String inspectorZip) {
        this.inspectorZip = inspectorZip;
    }

    /**
     *
     * @return
     * The inspectorPhone
     */
    public String getInspectorPhone() {
        return inspectorPhone;
    }

    /**
     *
     * @param inspectorPhone
     * The inspector_phone
     */
    public void setInspectorPhone(String inspectorPhone) {
        this.inspectorPhone = inspectorPhone;
    }

    /**
     *
     * @return
     * The inspectorEmail
     */
    public String getInspectorEmail() {
        return inspectorEmail;
    }

    /**
     *
     * @param inspectorEmail
     * The inspector_email
     */
    public void setInspectorEmail(String inspectorEmail) {
        this.inspectorEmail = inspectorEmail;
    }

    /**
     *
     * @return
     * The accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     *
     * @param accessToken
     * The access_token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     *
     * @return
     * The deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     *
     * @param deviceType
     * The device_type
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     *
     * @return
     * The chktoken
     */
    public Integer getChktoken() {
        return chktoken;
    }

    /**
     *
     * @param chktoken
     * The chktoken
     */
    public void setChktoken(Integer chktoken) {
        this.chktoken = chktoken;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
