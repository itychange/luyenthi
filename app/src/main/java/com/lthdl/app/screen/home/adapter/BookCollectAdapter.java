package com.lthdl.app.screen.home.adapter;

import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.ViewGroup;

import com.lthdl.app.model.BookId;
import com.lthdl.app.model.ItemBook;
import com.lthdl.app.model.ItemBookId;
import com.lthdl.app.model.ItemBookTrangChu;
import com.lthdl.app.screen.home.holder.BookCollectViewHolder;
import com.lthdl.app.screen.home.view.BookCollectItemView;

public class BookCollectAdapter extends Adapter<BookCollectViewHolder> {
    ItemBookTrangChu itemBookTrangChu =null;
    ItemBookId mBookId;
    String title;
    int pos=0;
    public BookCollectAdapter(){
 
    }
    public BookCollectAdapter(ItemBookTrangChu itemBookTrangChu){
        this.itemBookTrangChu = itemBookTrangChu;
    }
    public int getItemCount() {
        return itemBookTrangChu !=null? itemBookTrangChu.getMyBookses().size():4;
    }

    public void onBindViewHolder(BookCollectViewHolder paramBookCollectViewHolder, int paramInt) {
        pos=paramInt;
        pos++;
    }

    public BookCollectViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt) {
        Log.d("hshhshsh===>","Dtatatattata:"+itemBookTrangChu.getMyBookses().get(pos).getBookId());
        return new BookCollectViewHolder(new BookCollectItemView(paramViewGroup.getContext(),itemBookTrangChu.getMyBookses().get(pos).getName(),itemBookTrangChu.getMyBookses().get(pos).getBookId()));
    }
}