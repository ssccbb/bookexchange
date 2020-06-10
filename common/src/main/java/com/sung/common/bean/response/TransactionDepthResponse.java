package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-11
 *
 * @desc:
 * @notice:
 */
public class TransactionDepthResponse extends BaseResponse {

    public MessageBean message;

    public static class MessageBean {
        /**
         * asks : [[1.78,1824.6948],[1.77,250],[1.76,1638.3898],[1.75,1996.0173],[1.74,8681.3376]]
         * bids : [[1.72,1779.7947],[1.71,780.9476],[1.7,689.9008],[1.69,1746.1378],[1.68,145.8513]]
         * currency_id : 1
         * currency_name : STC
         * legal_id : 1
         * legal_name : USDT
         * symbol : STC/USDT
         * type : market_depth
         * last_price : 1.724
         */

        public String currency_id;
        public String currency_name;
        public String legal_id;
        public String legal_name;
        public String symbol;
        public String type;
        public double last_price;
        public List<List<Double>> asks;
        public List<List<Double>> bids;
    }
}
