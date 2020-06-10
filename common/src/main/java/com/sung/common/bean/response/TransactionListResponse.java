package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-11
 *
 * @desc:
 * @notice:
 */
public class TransactionListResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"list":[{"id":1328,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":1,"time":"2020-05-17 02:27:57","type":"in","in_fee":0.00358},{"id":1327,"currency_name":"STC","legal_name":"USDT","price":1.70000005,"number":12,"time":"2020-05-17 02:16:13","type":"out","out_fee":0},{"id":1326,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":12,"time":"2020-05-17 02:16:10","type":"in","in_fee":0.04296},{"id":1325,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":1,"time":"2020-05-17 02:06:13","type":"in","in_fee":0.00358},{"id":1324,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":11,"time":"2020-05-17 02:05:00","type":"in","in_fee":0.03938}],"count":5,"page":1,"limit":10}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * list : [{"id":1328,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":1,"time":"2020-05-17 02:27:57","type":"in","in_fee":0.00358},{"id":1327,"currency_name":"STC","legal_name":"USDT","price":1.70000005,"number":12,"time":"2020-05-17 02:16:13","type":"out","out_fee":0},{"id":1326,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":12,"time":"2020-05-17 02:16:10","type":"in","in_fee":0.04296},{"id":1325,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":1,"time":"2020-05-17 02:06:13","type":"in","in_fee":0.00358},{"id":1324,"currency_name":"STC","legal_name":"USDT","price":1.78999996,"number":11,"time":"2020-05-17 02:05:00","type":"in","in_fee":0.03938}]
         * count : 5
         * page : 1
         * limit : 10
         */

        public int count;
        public int page;
        public int limit;
        public List<ListBean> list;

        public static class ListBean {
            /**
             * id : 1328
             * currency_name : STC
             * legal_name : USDT
             * price : 1.78999996
             * number : 1
             * time : 2020-05-17 02:27:57
             * type : in
             * in_fee : 0.00358
             * out_fee : 0
             */

            public int id;
            public String currency_name;
            public String legal_name;
            public double price;
            public double number;
            public String time;
            public String create_time;
            public String type;
            public double in_fee;
            public double out_fee;
            public int list_type = 0;

        }
    }
}
