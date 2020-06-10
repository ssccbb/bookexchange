package com.sung.common.bean.request;

/**
 * Create by sung at 2020-05-11
 *
 * @desc:
 * @notice:
 */
public class TransactionDepthRequst extends BaseRequest {
    private String legal_name;
    private String currency_name;

    public TransactionDepthRequst(String legal_name, String currency_name) {
        this.legal_name = legal_name;
        this.currency_name = currency_name;
    }
}
