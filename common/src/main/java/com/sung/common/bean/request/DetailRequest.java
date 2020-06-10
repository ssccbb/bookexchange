package com.sung.common.bean.request;

/**
 * Create by sung at 2020-05-15
 *
 * @desc:
 * @notice:
 */
public class DetailRequest {
    private String currency;
    private String type;

    public DetailRequest(String currency, String type) {
        this.currency = currency;
        this.type = type;
    }
}
