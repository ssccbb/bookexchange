package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-09
 *
 * @desc:
 * @notice:
 */
public class WalletResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"list":[{"transfer":true,"currency":"USDT","address":"0x0eaa4a23ad5edba088973d0ff46fe84ba7e960cf","positions":999999,"positions_lock":"0.00000000","zh":999999}],"totalMoney":999999,"moneyUnit":"USDT"}
     * message : null
     * time : null
     * event : web/getAsset
     */

    public DataBean data;

    public static class DataBean {
        /**
         * list : [{"transfer":true,"currency":"USDT","address":"0x0eaa4a23ad5edba088973d0ff46fe84ba7e960cf","positions":999999,"positions_lock":"0.00000000","zh":999999}]
         * totalMoney : 999999
         * moneyUnit : USDT
         */

        public float totalMoney;
        public String moneyUnit;
        public List<ListBean> list;

        public static class ListBean {
            /**
             * transfer : true
             * currency : USDT
             * address : 0x0eaa4a23ad5edba088973d0ff46fe84ba7e960cf
             * positions : 999999
             * positions_lock : 0.00000000
             * zh : 999999
             */

            public boolean transfer;
            public String currency;
            public String address;
            public double positions;
            public double positions_lock;
            public double zh;
            public boolean numVisible = true;
        }
    }
}
