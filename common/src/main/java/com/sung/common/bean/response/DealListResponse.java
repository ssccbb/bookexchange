package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-22
 *
 * @desc:
 * @notice:
 */
public class DealListResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"list":[{"id":1865,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":2,"amount":19800,"remain":19800,"price":1,"total":19800,"fee":39.59999847,"time":"2020-05-14 18:13:51","timestamp":"1589385600","status":0,"multiple":50,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"},{"id":1842,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":2,"amount":19800,"remain":0,"price":0.16150001,"total":3197.69995117,"fee":6.39540005,"time":"2020-05-14 11:58:51","timestamp":"1589385600","status":0,"multiple":50,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"},{"id":1827,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":1,"amount":39600,"remain":0,"price":0.1592,"total":6304.31982422,"fee":12.60863972,"time":"2020-05-13 20:28:55","timestamp":"1589299200","status":0,"multiple":10,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"},{"id":1824,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":2,"amount":19800,"remain":0,"price":0.16,"total":3168,"fee":6.33599997,"time":"2020-05-13 20:24:01","timestamp":"1589299200","status":0,"multiple":10,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"},{"id":1823,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":1,"amount":19800,"remain":0,"price":0.15899999,"total":3148.19995117,"fee":6.29640007,"time":"2020-05-13 20:23:34","timestamp":"1589299200","status":0,"multiple":20,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"},{"id":1822,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":1,"amount":19800,"remain":0,"price":0.15899999,"total":3148.19995117,"fee":6.29640007,"time":"2020-05-13 20:23:14","timestamp":"1589299200","status":0,"multiple":10,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"},{"id":1821,"user_id":37,"wallet_id":null,"currency":"FTC","deal_type":2,"price_type":0,"mark":1,"amount":19800,"remain":0,"price":0.15899999,"total":3148.19995117,"fee":6.29640007,"time":"2020-05-13 20:22:54","timestamp":"1589299200","status":0,"multiple":50,"cancel_time":null,"name":null,"phone":"sung723@outlook.com"}]}
     * message : null
     * time : null
     * event : web/getDealList
     */

    public int code;
    public DataBean data;
    public String message;

    public static class DataBean {
        public List<ListBean> list;

        public static class ListBean {
            /**
             * id : 1865
             * user_id : 37
             * wallet_id : null
             * currency : FTC
             * deal_type : 2
             * price_type : 0
             * mark : 2
             * amount : 19800
             * remain : 19800
             * price : 1
             * total : 19800
             * fee : 39.59999847
             * time : 2020-05-14 18:13:51
             * timestamp : 1589385600
             * status : 0
             * multiple : 50
             * cancel_time : null
             * name : null
             * phone : sung723@outlook.com
             */

            public int id;
            public int user_id;
            public int wallet_id;
            public String currency;
            public int deal_type;
            public int price_type;
            public int mark;
            public double amount;
            public double remain;
            public double price;
            public double total;
            public double fee;
            public String time;
            public String timestamp;
            public int status;
            public int multiple;
            public String cancel_time;
            public String name;
            public String phone;

        }
    }
}
