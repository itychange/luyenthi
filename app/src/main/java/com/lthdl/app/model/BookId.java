package com.lthdl.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Windows on 6/13/2016.
 */
public class BookId {
    @SerializedName("items")
    @Expose
    private ArrayList<IMyBooks> myBookses = new ArrayList<IMyBooks>();

    public ArrayList<IMyBooks> getMyBookses() {
        return myBookses;
    }

    public void setMyBookses(ArrayList<IMyBooks> myBookses) {
        this.myBookses = myBookses;
    }
}
