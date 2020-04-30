package com.sung.bookexchange.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.sung.bookexchange.mvp.ui.activity.AboutActivity;
import com.sung.bookexchange.mvp.ui.activity.IndexActivity;
import com.sung.bookexchange.mvp.ui.activity.LanguageChangeActivity;

/**
 * Create by sung at 2020-04-06
 *
 * @desc: 页面跳转处理
 * @notice: 统一入口
 */
public class Router {

    public static void goIndexActivity(Activity context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, IndexActivity.class));
    }

    /**
     * 语言切换
     */
    public static void goChangeLanguageActivity(Context context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, LanguageChangeActivity.class));
    }

    /**
     * 关于我们
     */
    public static void goAboutUsActivity(Context context){
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, AboutActivity.class));
    }
}
