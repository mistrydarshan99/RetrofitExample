package com.example.darshan.retrofitdemo.model.response;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class ProductCatagoryRealm extends RealmObject {

    private String CategoryName;

    @SerializedName("Category_Image")
    private String CategoryImage;

    private String ID;

    private String ParentCategoryID;

    /**
     * @return The CategoryName
     */
    public String getCategoryName() {
        return CategoryName;
    }

    /**
     * @param CategoryName The CategoryName
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * @return The CategoryImage
     */
    public String getCategoryImage() {
        return CategoryImage;
    }

    /**
     * @param CategoryImage The Category_Image
     */
    public void setCategoryImage(String CategoryImage) {
        this.CategoryImage = CategoryImage;
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
     * @return The ParentCategoryID
     */
    public String getParentCategoryID() {
        return ParentCategoryID;
    }

    /**
     * @param ParentCategoryID The ParentCategoryID
     */
    public void setParentCategoryID(String ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    public ProductCatagoryRealm() {
        super();
    }
}