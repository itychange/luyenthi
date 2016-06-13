package com.lthdl.app.screen.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.lthdl.app.R;
import com.lthdl.app.model.BookId;
import com.lthdl.app.model.IMyBooks;
import com.lthdl.app.model.ItemBook;
import com.lthdl.app.model.ItemBookId;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BookCollectItemView extends FrameLayout {
    public static final int MAX_BOOK_VISIBLE = 3;

    @Bind(R.id.imvExpandChapter)
    ImageView imvExpandChapter;

    @Bind(R.id.lyBookGroupInVisiable)
    LinearLayout lyBookGroupInVisiable;

    @Bind(R.id.lyBookGroupInVisiableBound)
    ExpandableRelativeLayout lyBookGroupInVisiableBound;

    @Bind(R.id.lyBookGroupVisiable)
    LinearLayout lyBookGroupVisiable;

    @Bind(R.id.lyExpand)
    LinearLayout lyExpand;

    @Bind(R.id.text1)
    TextView text1;

    String title;
    BookId mItemBookId;
    public BookCollectItemView(Context paramContext,String title,BookId mItemBookId) {
        super(paramContext);
        this.title=title;
        this.mItemBookId=mItemBookId;
        init();
    }

    public BookCollectItemView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        init();
    }

    public BookCollectItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        init();
    }

    private void init() {
        View view=LayoutInflater.from(getContext()).inflate(R.layout.home_view_book_collect_item, this, true);
        text1= (TextView) view.findViewById(R.id.text1);
        text1.setText(title);
        ButterKnife.bind(this);

        setData();
        this.lyBookGroupInVisiableBound.setExpanded(false);
        this.lyExpand.setVisibility(GONE);

    }

    @OnClick(R.id.lyExpand)
    public void onExpandClick(View paramView) {
        this.lyBookGroupInVisiableBound.toggle();
        if (this.lyBookGroupInVisiableBound.isExpanded()) {
            this.imvExpandChapter.setImageResource(R.drawable.icon_arrowdown);
            return;
        }
        this.imvExpandChapter.setImageResource(R.drawable.icon_arrow_up);
    }
//    String url, String title, String author, String rating, String cost
    public void setData() {
        ArrayList<IMyBooks> arr=mItemBookId.getMyBookses();
        for (int i = 0; i < mItemBookId.getMyBookses().size(); i++) {
            BookItemView localBookItemView = new BookItemView(getContext(),arr,mItemBookId.getMyBookses().get(i).getConver(),mItemBookId.getMyBookses().get(i).getName()
            ,mItemBookId.getMyBookses().get(i).getAuthor(),mItemBookId.getMyBookses().get(i).getRate(),mItemBookId.getMyBookses().get(i).getRole());
            //if (i < MAX_BOOK_VISIBLE) {
                this.lyBookGroupVisiable.addView(localBookItemView);
            /*} else {
                this.lyBookGroupInVisiable.addView(localBookItemView);
            }*/
        }
    }
}