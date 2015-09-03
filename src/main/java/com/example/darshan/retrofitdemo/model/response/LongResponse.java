package com.example.darshan.retrofitdemo.model.response;

/**
 * Created by darshan.mistry on 8/1/2015.
 */

import com.example.darshan.retrofitdemo.model.response.ObjectList;

import java.util.ArrayList;
import java.util.List;

public class LongResponse {

    
    private Integer Count;
    
    private String Message;
    
    private List<ObjectList> ObjectList = new ArrayList<ObjectList>();

    /**
     *
     * @return
     * The Count
     */
    public Integer getCount() {
        return Count;
    }

    /**
     *
     * @param Count
     * The Count
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     *
     * @return
     * The Message
     */
    public String getMessage() {
        return Message;
    }

    /**
     *
     * @param Message
     * The Message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     *
     * @return
     * The ObjectList
     */
    public List<ObjectList> getObjectList() {
        return ObjectList;
    }

    /**
     *
     * @param ObjectList
     * The ObjectList
     */
    public void setObjectList(List<ObjectList> ObjectList) {
        this.ObjectList = ObjectList;
    }

}
