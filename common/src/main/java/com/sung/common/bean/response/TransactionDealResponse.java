package com.sung.common.bean.response;

import com.sung.common.bean.TransactionBean;

import java.util.List;

/**
 * Create by sung at 2020-05-11
 *
 * @desc:
 * @notice:
 */
public class TransactionDealResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"ExRAte":"6.5","all_levers":"0","last_price":"0","lever_share_limit":{"min":"1","max":"50000"},"lever_transaction":{"in":[],"out":[]},"user_lever":999999,"ustd_price":"0","multiple":{"muit":[{"value":"50"},{"value":"20"},{"value":"10"}],"share":[{"value":"10"},{"value":"20"},{"value":"50"},{"value":"100"}]},"my_transaction":[]}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * ExRAte : 6.5
         * all_levers : 0
         * last_price : 0
         * lever_share_limit : {"min":"1","max":"50000"}
         * lever_transaction : {"in":[],"out":[]}
         * user_lever : 999999
         * ustd_price : 0
         * multiple : {"muit":[{"value":"50"},{"value":"20"},{"value":"10"}],"share":[{"value":"10"},{"value":"20"},{"value":"50"},{"value":"100"}]}
         * my_transaction : []
         */

        public String ExRAte;
        public String all_levers;
        public String last_price;
        public LeverShareLimitBean lever_share_limit;
        public LeverTransactionBean lever_transaction;
        public float user_lever;
        public String ustd_price;
        public MultipleBean multiple;
        public List<TransactionBean> my_transaction;

        public static class LeverShareLimitBean {
            /**
             * min : 1
             * max : 50000
             */

            public String min;
            public String max;

        }

        public static class LeverTransactionBean {
            public List<TransactionBean> in;
            public List<TransactionBean> out;
        }

        public static class MultipleBean {
            public List<MuitBean> muit;
            public List<ShareBean> share;

            public static class MuitBean {
                /**
                 * value : 50
                 */

                public String value;
            }

            public static class ShareBean {
                /**
                 * value : 10
                 */

                public String value;
            }
        }
    }
}
