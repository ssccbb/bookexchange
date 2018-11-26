package com.sung.bookexchange.common;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Create by sung at 2018/11/13
 *
 * @Description:
 */
public class BaseApplication extends Application {
    protected Context context;
    protected SharedPreferences mPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            context = getApplicationContext();
        }catch (Exception e){
        }
    }

    /**
     * @return context
     * */
    public Context getContext(){
        return context;
    }

    /**
     * @return packagename
     * */
    public String getAppPackageName(){
        return getPackageName();
    }

    /**
     * @return sp
     * */
    public SharedPreferences getPreferences(){
        if (mPreferences == null){
            mPreferences = getSharedPreferences(getAppPackageName(),MODE_PRIVATE);
        }
        return mPreferences;
    }
}
