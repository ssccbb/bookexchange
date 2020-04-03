package com.sung.bookexchange.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.sung.bookexchange.R;

/**
 * Create by sung at 2018/12/7
 *
 * @Description:
 */
public class SearchView extends RelativeLayout {

    public SearchView(Context context) {
        super(context);
        init();
    }

    public SearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        View view = LayoutInflater.from(this.getContext())
                .inflate(R.layout.layout_search, null, false);
        this.addView(view);
    }
}
