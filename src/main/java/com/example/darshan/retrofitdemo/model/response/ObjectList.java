package com.example.darshan.retrofitdemo.model.response;

import java.util.ArrayList;
import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Table(name = "TestMain")
public class ObjectList extends Model{

    @SerializedName("__type")
    @Column(name = "Type")
    private String Type;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Address2")
    private String Address2;

    @Column(name = "City")
    private String City;


    @Column(name = "Country")
    private String Country;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Fax")
    private String Fax;

    @Column(name = "IdTest")
    private String ID;

    @Column(name = "Latitude")
    private String Latitude;

    @Column(name = "Longitude")
    private String Longitude;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "PostalCode")
    private String PostalCode;

    private List<ProductCatagory> ProductCatagories = new ArrayList<ProductCatagory>();

    @Column(name = "State")
    private String State;

    public ObjectList() {
        super();
    }

    public static List<ObjectList> getItem(){
        return new Select().from(ObjectList.class).execute();
    }

    /**
     * @return The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type The __type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return The Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address The Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return The Address2
     */
    public String getAddress2() {
        return Address2;
    }

    /**
     * @param Address2 The Address2
     */
    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    /**
     * @return The City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City The City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return The Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country The Country
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return The Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email The Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return The Fax
     */
    public String getFax() {
        return Fax;
    }

    /**
     * @param Fax The Fax
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    /**
     * @return The ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID The ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return The Latitude
     */
    public String getLatitude() {
        return Latitude;
    }

    /**
     * @param Latitude The Latitude
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * @return The Longitude
     */
    public String getLongitude() {
        return Longitude;
    }

    /**
     * @param Longitude The Longitude
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * @return The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return The Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone The Phone
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return The PostalCode
     */
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode The PostalCode
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * @return The ProductCatagories
     */
    public List<ProductCatagory> getProductCatagories() {
        return ProductCatagories;
    }

    /**
     * @param ProductCatagories The ProductCatagories
     */
    public void setProductCatagories(List<ProductCatagory> ProductCatagories) {
        this.ProductCatagories = ProductCatagories;
    }

    /**
     * @return The State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State The State
     */
    public void setState(String State) {
        this.State = State;
    }

}