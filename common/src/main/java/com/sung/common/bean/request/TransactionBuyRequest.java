package com.sung.common.bean.request;

/**
 * Create by sung at 2020-05-15
 *
 * @desc:
 * @notice:
 */
public class TransactionBuyRequest {
    private String price;
    private String num;
    private String legal_id;
    private String currency_id;
    private String legal_name;
    private String currency_name;
    //市价1限价0
    private String price_type;

    public TransactionBuyRequest(String price, String num, String legal_id, String currency_id, String legal_name, String currency_name, String price_type) {
        this.price = price;
        this.num = num;
        this.legal_id = legal_id;
        this.currency_id = currency_id;
        this.legal_name = legal_name;
        this.currency_name = currency_name;
        this.price_type = price_type;
    }
}
