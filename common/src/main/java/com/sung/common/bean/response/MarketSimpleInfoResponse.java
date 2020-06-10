package com.sung.common.bean.response;

/**
 * Create by sung at 2020-04-28
 *
 * @desc:
 * @notice:
 */
public class MarketSimpleInfoResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"low":0.155,"high":0.1587,"amount":6.6962635380354E7,"now_price":0.15708,"change":-1.01}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * low : 0.155
         * high : 0.1587
         * amount : 6.6962635380354E7
         * now_price : 0.15708
         * change : -1.01
         */

        public double low;
        public double high;
        public double amount;
        public double now_price;
        public double change;

    }
}
