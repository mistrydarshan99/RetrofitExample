package com.example.darshan.retrofitdemo.model.response;

import java.util.List;

/**
 * Created by darshan.mistry on 6/3/2015.
 */
public class ActionTagModel {
    /**
     * Count : 1
     * Message : Success
     * _Count : 1
     * ObjectList : []
     * _Message : Success
     */
    private int Count;
    private String Message;
    private int _Count;
    private List<String> ObjectList;
    private String _Message;

    public void setCount(int Count) {
        this.Count = Count;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public void set_Count(int _Count) {
        this._Count = _Count;
    }

    public void setObjectList(List<String> ObjectList) {
        this.ObjectList = ObjectList;
    }

    public void set_Message(String _Message) {
        this._Message = _Message;
    }

    public int getCount() {
        return Count;
    }

    public String getMessage() {
        return Message;
    }

    public int get_Count() {
        return _Count;
    }

    public List<String> getObjectList() {
        return ObjectList;
    }

    public String get_Message() {
        return _Message;
    }
}
