package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-04-22
 *
 * @desc:
 * @notice:
 */
public class BannerResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"list":[{"id":60,"c_id":4,"lang":"hk","title":"BTC360數字資產交易平臺商家入駐公告","thumbnail":"https://www.beauglobal.com/images/zwtp.png","cover":"https://www.beauglobal.com/images/zwtp.png","sorts":0},{"id":59,"c_id":4,"lang":"hk","title":"關於BTC360數字資產交易平臺上線公告","thumbnail":"https://www.beauglobal.com/images/zwtp.png","cover":"https://www.beauglobal.com/images/zwtp.png","sorts":0}],"count":2,"page":1,"limit":15}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * list : [{"id":60,"c_id":4,"lang":"hk","title":"BTC360數字資產交易平臺商家入駐公告","thumbnail":"https://www.beauglobal.com/images/zwtp.png","cover":"https://www.beauglobal.com/images/zwtp.png","sorts":0},{"id":59,"c_id":4,"lang":"hk","title":"關於BTC360數字資產交易平臺上線公告","thumbnail":"https://www.beauglobal.com/images/zwtp.png","cover":"https://www.beauglobal.com/images/zwtp.png","sorts":0}]
         * count : 2
         * page : 1
         * limit : 15
         */

        public int count;
        public int page;
        public int limit;
        public List<ListBean> list;

        public static class ListBean {
            /**
             * id : 60
             * c_id : 4
             * lang : hk
             * title : BTC360數字資產交易平臺商家入駐公告
             * thumbnail : https://www.beauglobal.com/images/zwtp.png
             * cover : https://www.beauglobal.com/images/zwtp.png
             * sorts : 0
             */

            public int id;
            public int c_id;
            public String lang;
            public String title;
            public String thumbnail;
            public String cover;
            public int sorts;

        }
    }
}
