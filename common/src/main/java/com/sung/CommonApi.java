package com.sung;

import android.app.Application;
import android.content.Context;

import com.sung.common.utils.SPUtils;

/**
 * Create by sung at 2020-04-20
 *
 * @desc:
 * @notice:
 */
public class CommonApi extends Application {

    public static class Holder {
        public static CommonApi instance = new CommonApi();
    }

    public static CommonApi getInstance() {
        return Holder.instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void attach(Context context){
        SPUtils.init(context);
    }
}
