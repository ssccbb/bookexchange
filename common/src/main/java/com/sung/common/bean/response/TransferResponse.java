package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-18
 *
 * @desc:
 * @notice:
 */
public class TransferResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"list":{"USDT":[{"type":1,"balance":363002.15625},{"type":2,"balance":998963.6875}]},"currency":[{"name":"USDT","count":2}],"types":[{"id":1,"value":"币币账户"},{"id":2,"value":"合约账户"}]}
     * message : null
     * time : null
     * event : web/geTransfer
     */

    public int code;
    public DataBean data;
    public String message;

    public static class DataBean {
        /**
         * list : {"USDT":[{"type":1,"balance":363002.15625},{"type":2,"balance":998963.6875}]}
         * currency : [{"name":"USDT","count":2}]
         * types : [{"id":1,"value":"币币账户"},{"id":2,"value":"合约账户"}]
         */

        public ListBean list;
        public List<CurrencyBean> currency;
        public List<TypesBean> types;

        public static class ListBean {
            public List<USDTBean> USDT;

            public static class USDTBean {
                /**
                 * type : 1
                 * balance : 363002.15625
                 */

                public int type;
                public double balance;

            }
        }

        public static class CurrencyBean {
            /**
             * name : USDT
             * count : 2
             */

            public String name;
            public int count;
        }

        public static class TypesBean {
            /**
             * id : 1
             * value : 币币账户
             */

            public int id;
            public String value;

        }
    }
}
