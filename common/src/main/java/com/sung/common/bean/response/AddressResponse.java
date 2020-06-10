package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-18
 *
 * @desc:
 * @notice:
 */
public class AddressResponse extends BaseResponse {

    /**
     * code : 0
     * data : [{"id":16,"user_id":37,"currency":"BTC","address":"头盖骨","balance":0,"lock_balance":0,"chain_balance":0,"add_time":"2020-05-29 14:30:41","is_delete":0,"money":0,"type":1,"message":""}]
     * message : null
     * time : null
     * event : web/getAddressList
     */

    public int code;
    public String message;
    public List<DataBean> data;

    public static class DataBean {
        /**
         * id : 16
         * user_id : 37
         * currency : BTC
         * address : 头盖骨
         * balance : 0
         * lock_balance : 0
         * chain_balance : 0
         * add_time : 2020-05-29 14:30:41
         * is_delete : 0
         * money : 0
         * type : 1
         * message :
         */

        public int id;
        public int user_id;
        public String currency;
        public String address;
        public double balance;
        public double lock_balance;
        public double chain_balance;
        public String add_time;
        public int is_delete;
        public double money;
        public int type;
        public String message;

    }
}
