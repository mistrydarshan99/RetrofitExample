package com.example.darshan.retrofitdemo.serilizer;

import com.example.darshan.retrofitdemo.model.response.ProductCatagoryRealm;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * Created by darshan.mistry on 9/1/2015.
 */
public class ProductSerlize implements JsonSerializer<ProductCatagoryRealm> {
    @Override
    public JsonElement serialize(ProductCatagoryRealm src, Type typeOfSrc, JsonSerializationContext context) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("CategoryName", src.getCategoryName());
        jsonObject.addProperty("Category_Image", src.getCategoryImage());
        jsonObject.addProperty("ID", src.getID());
        jsonObject.addProperty("ParentCategoryID", src.getParentCategoryID());
        return jsonObject;
    }
}
