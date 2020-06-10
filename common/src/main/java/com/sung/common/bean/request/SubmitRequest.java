package com.sung.common.bean.request;

/**
 * Create by sung at 2020-05-13
 *
 * @desc:
 * @notice:
 */
public class SubmitRequest extends BaseRequest {
    public static final int BUY = 1;
    public static final int SOLD = 2;
    public static final int MARKET_PRICE = 1;
    public static final int FIXED_PRICE = 0;

    private String share;
    private String multiple;
    private String legal_id;
    private String currency_id;
    /**
     * 买入：1
     * 卖出：2
     */
    private String type;
    /**
     * 市价：1
     * 限价：0
     */
    private String status;
    /**
     * 市价：
     * 限价：实际
     */
    private String target_price;
    private String legal_name;
    private String currency_name;

    public SubmitRequest(String share, String multiple, String legal_id, String currency_id, String type, String status, String target_price, String legal_name, String currency_name) {
        this.share = share;
        this.multiple = multiple;
        this.legal_id = legal_id;
        this.currency_id = currency_id;
        this.type = type;
        this.status = status;
        this.target_price = target_price;
        this.legal_name = legal_name;
        this.currency_name = currency_name;
    }
}
