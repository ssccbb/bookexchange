package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-18
 *
 * @desc:
 * @notice:
 */
public class CoinListResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"legal_wallet":{"balance":[{"currency_name":"BTC"},{"currency_name":"ETH"},{"currency_name":"EOS"},{"currency_name":"LTC"},{"currency_name":"BCH"},{"currency_name":"XRP"},{"currency_name":"ETC"},{"currency_name":"HT"},{"currency_name":"ADA"},{"currency_name":"OMG"},{"currency_name":"DASH"},{"currency_name":"LINK"},{"currency_name":"FTC"},{"currency_name":"USDT"}]}}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * legal_wallet : {"balance":[{"currency_name":"BTC"},{"currency_name":"ETH"},{"currency_name":"EOS"},{"currency_name":"LTC"},{"currency_name":"BCH"},{"currency_name":"XRP"},{"currency_name":"ETC"},{"currency_name":"HT"},{"currency_name":"ADA"},{"currency_name":"OMG"},{"currency_name":"DASH"},{"currency_name":"LINK"},{"currency_name":"FTC"},{"currency_name":"USDT"}]}
         */

        public LegalWalletBean legal_wallet;

        public static class LegalWalletBean {
            public List<BalanceBean> balance;

            public static class BalanceBean {
                /**
                 * currency_name : BTC
                 */

                public String currency_name;

            }
        }
    }
}
