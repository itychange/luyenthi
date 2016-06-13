package com.lthdl.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by THANHHUNGPHAT on 11/06/2016.
 */
public class ItemBook {
    @SerializedName("id")
    public String id;
    @SerializedName("oderby")
    public String oderby;
    @SerializedName("name")
    public String name;

    @SerializedName("book_ids")
    @Expose
    BookId mBookId;

    public String getOderby() {
        return oderby;
    }

    public void setOderby(String oderby) {
        this.oderby = oderby;
    }

    public BookId getBookId() {
        return mBookId;
    }

    public void setBookId(BookId bookId) {
        mBookId = bookId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
