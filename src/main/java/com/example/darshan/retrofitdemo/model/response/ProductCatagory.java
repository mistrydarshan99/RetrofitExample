package com.example.darshan.retrofitdemo.model.response;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Table(name = "ProductList")
public class ProductCatagory extends Model {

    @Column(name = "CategoryName")
    private String CategoryName;

    @SerializedName("Category_Image")
    @Column(name = "CategoryImage")
    private String CategoryImage;

    @Column(name = "productId")
    private String ID;

    @Column(name = "ParentCategoryID")
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
    public Object getCategoryImage() {
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
    public Object getParentCategoryID() {
        return ParentCategoryID;
    }

    /**
     * @param ParentCategoryID The ParentCategoryID
     */
    public void setParentCategoryID(String ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    public ProductCatagory() {
        super();
    }
}