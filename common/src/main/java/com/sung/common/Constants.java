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

        public static final String NET_BASE_DOMAIN = "http://www.ft-ccweb.co/";
        public static final String NET_BASE_DOMAIN_TEST = "https://www.ftdime.com";
        public static final String NET_BASE_NAME = "ftcoin";
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

    public class Config {
        /* fresco */
        public static final int CONFIG_FRESCO_CACHE_SIZE = 30;// 兆节
        public static final String CONFIG_FRESCO_CACHE_DIR = "/cache/fresco";

        /* splash */
        public static final int CONFIG_SPLASH_SKIP_TIME = 2000;
        public static final int CONFIG_INDEX_EXIT_TIME = 2000;

        /* 国际化相关 */
        public static final String CONFIG_LANGUAGE = "com.sung.sp.language";

        /* 夜览模式相关 */
        public static final String CONFIG_NIGHT_MODE = "com.sung.config.nightmode";
    }
}
