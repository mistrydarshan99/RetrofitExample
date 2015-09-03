package com.example.darshan.retrofitdemo.model.response;

/**
 * Created by darshan.mistry on 8/1/2015.
 */

import java.util.ArrayList;
import java.util.List;

public class LongResponseRealm {

    
    private Integer Count;
    
    private String Message;
    
    private List<ObjectListRealm> ObjectList = new ArrayList<ObjectListRealm>();

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
    public List<ObjectListRealm> getObjectList() {
        return ObjectList;
    }

    /**
     *
     * @param ObjectList
     * The ObjectList
     */
    public void setObjectList(List<ObjectListRealm> ObjectList) {
        this.ObjectList = ObjectList;
    }

}
