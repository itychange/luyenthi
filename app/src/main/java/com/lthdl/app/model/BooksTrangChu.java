package com.lthdl.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by THANHHUNGPHAT on 12/06/2016.
 */
public class BooksTrangChu {
    @SerializedName("cat_ids")
    ItemBookTrangChu itemBookTrangChu;
    public ItemBookTrangChu getItemBooks() {
        return itemBookTrangChu;
    }

    public void setItemBooks(ItemBookTrangChu itemBookTrangChu) {
        this.itemBookTrangChu = itemBookTrangChu;
    }



}
