package com.sung.bookexchange.utils;

import android.os.Environment;

import com.sung.bookexchange.BookApplication;
import com.sung.bookexchange.BuildConfig;
import com.sung.bookexchange.common.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Create by sung at 2018/11/13
 *
 * @Description: log工具
 */
public class Log {
    /**
     * 日志开关
    * */
    private static boolean LOG_INTERCEPT = (!BuildConfig.DEBUG);
    /**
     * 记录交互
     * */
    private static boolean SAVE_USER_OPERATION = true;
    private static DateFormat dateFormat;

    /**
     * logd
     *
     * @param strings 数值>1 首位tag 其余content
     */
    public static void d(String... strings) {
        if (isIntercept() || strings.length <= 0) {
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
        if (isIntercept() || strings.length <= 0) {
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
        if (isIntercept() || strings.length <= 0) {
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
        if (isIntercept() || strings.length <= 0) {
            return;
        }
        try {
            android.util.Log.i(strings.length > 1 ? strings[0] : Constants.TAG, readContent(strings));
        } catch (Exception e) {
        }
    }

    public static boolean isIntercept() {
        return LOG_INTERCEPT;
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

    /**
     * @date: 2018/12/6_5:04 PM
     * @Description: 日志记录
     */
    public static void saveOperationIntoLocal(String content){
        if (!SAVE_USER_OPERATION) return;
        try {
            if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                return;
            }
            if (!FileUtils.isFileExists(BookApplication.getInstance().getLogPath())) {
                FileUtils.createFileByDeleteOldFile(BookApplication.getInstance().getLogPath());
            }
            content = "\r\n" + millis2String(System.currentTimeMillis()) + " : " + content + "\r\n";
            FileUtils.writeFileFromString(BookApplication.getInstance().getLogPath(), content, true);
        }catch (Exception e){
        }
    }

    private static String millis2String(long millis){
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return dateFormat.format(new Date(millis));
    }
}
