package com.sung.common.bean.response;

/**
 * Create by sung at 2020-05-29
 *
 * @desc:
 * @notice:
 */
public class NewAddressResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"usdt":{"binance":"0x4694a36641325553f19bf5f00f5b4cfbfd4a7fc2","huobi":"0x0eaa4a23ad5edba088973d0ff46fe84ba7e960cf"},"btc":{"binance":"1HvvLJgL335naFMGYc2ajiusgRA9VFw3ki","huobi":"1Juc1ARvb3WL9TfmuTcPHJU4vkJgTz5ZeD"}}
     * message : null
     * time : null
     * event : web/getUsdtAddr
     */

    public int code;
    public DataBean data;
    public String message;

    public static class DataBean {
        /**
         * usdt : {"binance":"0x4694a36641325553f19bf5f00f5b4cfbfd4a7fc2","huobi":"0x0eaa4a23ad5edba088973d0ff46fe84ba7e960cf"}
         * btc : {"binance":"1HvvLJgL335naFMGYc2ajiusgRA9VFw3ki","huobi":"1Juc1ARvb3WL9TfmuTcPHJU4vkJgTz5ZeD"}
         */

        public UsdtBean usdt;
        public BtcBean btc;

        public static class UsdtBean {
            /**
             * binance : 0x4694a36641325553f19bf5f00f5b4cfbfd4a7fc2
             * huobi : 0x0eaa4a23ad5edba088973d0ff46fe84ba7e960cf
             */

            public String binance;
            public String huobi;

        }

        public static class BtcBean {
            /**
             * binance : 1HvvLJgL335naFMGYc2ajiusgRA9VFw3ki
             * huobi : 1Juc1ARvb3WL9TfmuTcPHJU4vkJgTz5ZeD
             */

            public String binance;
            public String huobi;

        }
    }
}
