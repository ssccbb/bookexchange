package com.sung.common.bean.request;

/**
 * Create by sung at 2020-05-14
 *
 * @desc:
 * @notice:
 */
public class SetStopRequest {
    private String id;
    private String target_profit_price;
    private String stop_loss_price;

    public SetStopRequest(String id, String target_profit_price, String stop_loss_price) {
        this.id = id;
        this.target_profit_price = target_profit_price;
        this.stop_loss_price = stop_loss_price;
    }
}
