package com.sung.bookexchange.mvp.presenter;

import android.content.Context;

import com.sung.bookexchange.mvp.interfaces.IPIndex;

/**
 * Create by sung at 2019/1/19
 *
 * @Description:
 */
public class IndexPresenter implements IPIndex {
    private Context context;

    public IndexPresenter(Context context) {
        this.context = context;
    }
}
