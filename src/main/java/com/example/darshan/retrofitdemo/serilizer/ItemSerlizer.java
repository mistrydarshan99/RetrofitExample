package com.example.darshan.retrofitdemo.serilizer;

import com.example.darshan.retrofitdemo.model.response.ObjectListRealm;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * Created by darshan.mistry on 9/1/2015.
 */
public class ItemSerlizer implements JsonSerializer<ObjectListRealm> {
    @Override
    public JsonElement serialize(ObjectListRealm src, Type typeOfSrc, JsonSerializationContext context) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("Type", src.getType());
        jsonObject.addProperty("Address", src.getAddress());
        jsonObject.addProperty("Fax", src.getFax());
        jsonObject.addProperty("Email", src.getEmail());
        jsonObject.addProperty("Country", src.getCountry());
        jsonObject.addProperty("City", src.getCity());
        jsonObject.addProperty("Address2", src.getAddress2());
        jsonObject.addProperty("Phone", src.getPhone());
        jsonObject.addProperty("Name", src.getName());
        jsonObject.addProperty("Longitude", src.getLongitude());
        jsonObject.addProperty("Latitude", src.getLatitude());
        jsonObject.addProperty("ID", src.getID());
        jsonObject.addProperty("PostalCode", src.getPostalCode());
        jsonObject.add("ProductCatagories", context.serialize(src.getProductCatagories()));
        return jsonObject;
    }
}
