package com.sung.common.bean.response;

/**
 * Create by sung at 2020-05-15
 *
 * @desc:
 * @notice:
 */
public class DetailResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"ExRate":0.2,"change_balance":0,"currency":0,"currency_name":"FTC","currency_type":"","id":0,"is_legal":1,"is_lever":1,"lock_change_balance":0,"usdt_price":1}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * ExRate : 0.2
         * change_balance : 0
         * currency : 0
         * currency_name : FTC
         * currency_type :
         * id : 0
         * is_legal : 1
         * is_lever : 1
         * lock_change_balance : 0
         * usdt_price : 1
         */

        public double ExRate;
        public double change_balance;
        public int currency;
        public String currency_name;
        public String currency_type;
        public int id;
        public int is_legal;
        public int is_lever;
        public double lock_change_balance;
        public double usdt_price;
    }
}
