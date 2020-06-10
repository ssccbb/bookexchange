package com.sung.common.bean.request;

/**
 * Create by sung at 2020-05-14
 *
 * @desc:
 * @notice:
 */
public class PositionListRequest {
    private String page;
    private String limit;
    private String legal_id;
    private String currency_id;
    private String legal_name;
    private String currency_name;

    public PositionListRequest(String legal_id, String currency_id, String legal_name, String currency_name) {
        this.page = "1";
        this.limit = "100";
        this.legal_id = legal_id;
        this.currency_id = currency_id;
        this.legal_name = legal_name;
        this.currency_name = currency_name;
    }
}
