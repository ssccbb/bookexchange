package com.sung.common;

/**
 * Create by sung at 2018/11/13
 *
 * @Description:
 */
public class Constants {
    public static final String TAG = "com.sung.bookexchange";
    public static final String SOCKET_TAG = "WebsocketClient";

    public static final String DEFAULT_SP_NAME = "com.sung.sp";
    public static final String TEMP_SP_NAME = "com.sung.tempsp";

    public class Net {
        public static final int NET_OK = 200;
        public static final int NET_EMPTY = 201;
        public static final int NET_FAIL = 202;
        public static final int NET_EXCEPTION = 203;

        public static final String NET_BASE_DOMAIN = BuildConfig.NET_DOMAIN_TEST;
        public static final String NET_BASE_DOMAIN_TEST = BuildConfig.NET_DOMAIN;
        public static final String NET_BASE_NAME = BuildConfig.NET_DOMAIN_NAME;
    }

    public class MCache {
        public static final String LOGIN = "sp_login";
        public static final String LOGIN_INFO = "login_info";
        public static final String LOGIN_ACCOUNT = "login_account";
        public static final String LOGIN_TOKEN = "login_token";
    }

    public class MTempCache {
        public static final String TEMP_LOGIN_ACCOUNT = "temp_login_account";
    }

    public class Websocket {
        public static final String WEBSOCKET_NEW_MESSAGE = "kline";
        public static final String WEBSOCKET_URI = "http://47.52.73.70:3000";
    }

    public class Config {
        /* fresco */
        public static final int CONFIG_FRESCO_CACHE_SIZE = 30;// 兆节
        public static final String CONFIG_FRESCO_CACHE_DIR = "/cache/fresco";

        /* splash */
        public static final int CONFIG_SPLASH_SKIP_TIME = 2000;
        public static final int CONFIG_INDEX_EXIT_TIME = 2000;

        /* vertify */
        public static final int CONFIG_VERTIFY_WAIT_TIME = 60 * 1000;

        /* 国际化相关 */
        public static final String CONFIG_LANGUAGE = "com.sung.sp.language";

        /* 夜览模式相关 */
        public static final String CONFIG_NIGHT_MODE = "config.nightmode";
    }
}
