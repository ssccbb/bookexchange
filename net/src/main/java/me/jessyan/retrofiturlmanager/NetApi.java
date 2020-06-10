package me.jessyan.retrofiturlmanager;

import android.app.Application;
import android.content.Context;

/**
 * Create by sung at 2020-04-20
 *
 * @desc:
 * @notice:
 */
public class NetApi extends Application {
    private Context context;

    private static class Holder {
        public static NetApi instance = new NetApi();
    }

    public static NetApi getInstance() {
        return Holder.instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void attach(Context ctx){
        context = ctx;
    }

    public Context getContext(){
        return context;
    }
}
