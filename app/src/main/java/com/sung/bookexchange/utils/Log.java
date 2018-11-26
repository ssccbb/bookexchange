package com.sung.bookexchange.utils;

import com.sung.bookexchange.BuildConfig;
import com.sung.bookexchange.common.Constants;

/**
 * Create by sung at 2018/11/13
 *
 * @Description: log工具
 */
public class Log {
    private static boolean intercept = (!BuildConfig.DEBUG);

    /**
     * logd
     *
     * @param strings 数值>1 首位tag 其余content
     */
    public static void d(String... strings) {
        if (intercept || strings.length <= 0) {
            return;
        }
        try {
            android.util.Log.d(strings.length > 1 ? strings[0] : Constants.TAG, readContent(strings));
        } catch (Exception e) {
        }
    }

    /**
     * logv
     *
     * @param strings 数值>1 首位tag 其余content
     */
    public static void v(String... strings) {
        if (intercept || strings.length <= 0) {
            return;
        }
        try {
            android.util.Log.d(strings.length > 1 ? strings[0] : Constants.TAG, readContent(strings));
        } catch (Exception e) {
        }
    }

    /**
     * loge
     *
     * @param strings 数值>1 首位tag 其余content
     */
    public static void e(String... strings) {
        if (intercept || strings.length <= 0) {
            return;
        }
        try {
            android.util.Log.e(strings.length > 1 ? strings[0] : Constants.TAG, readContent(strings));
        } catch (Exception e) {
        }
    }

    /**
     * logi
     *
     * @param strings 数值>1 首位tag 其余content
     */
    public static void i(String... strings) {
        if (intercept || strings.length <= 0) {
            return;
        }
        try {
            android.util.Log.i(strings.length > 1 ? strings[0] : Constants.TAG, readContent(strings));
        } catch (Exception e) {
        }
    }

    public static boolean getLogOpenStatus() {
        return intercept;
    }

    private static String readContent(String... strings) {
        int length = strings.length;
        String content = "";
        if (length == 1) {
            content = strings[0];
        }
        if (length == 2) {
            content = strings[1];
        }
        if (length > 2) {
            StringBuilder sb = new StringBuilder();
            for (String string : strings) {
                sb.append("\t" + string);
            }
            content = sb.toString();
        }
        return content;
    }
}
