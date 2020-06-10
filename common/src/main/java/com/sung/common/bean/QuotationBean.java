package com.sung.common.bean;

import com.sung.common.utils.StringUtils;

/**
 * Create by sung at 2020-04-12
 *
 * @desc:
 * @notice:
 */
public class QuotationBean {
    /**
     * id : 1
     * legal_id : 1
     * currency_id : 1
     * is_display : 1
     * market_from : 2
     * open_transaction : 1
     * open_lever : 1
     * exchange_rate : 0.2
     * sort : -1000
     * lever_share_num : 1980
     * spread : 0.1
     * overnight : 0.1
     * lever_trade_fee : 0.2
     * lever_min_share : 1
     * lever_max_share : 50000
     * create_time : 2020-04-54 20:49:54
     * legal_name : USDT
     * currency_name : FTC
     * market_from_name : huobi
     * change : -0.52
     * volume : 9.9449173052247E7
     * now_price : 0.15103
     */

    public String id;
    public String legal_id;
    public String currency_id;
    public String is_display;
    public String market_from;
    public String open_transaction;
    public String open_lever;
    public String exchange_rate;
    public String sort;
    public String lever_share_num;
    public String spread;
    public String overnight;
    public double lever_trade_fee;
    public String lever_min_share;
    public String lever_max_share;
    public String create_time;
    public String legal_name;
    public String currency_name;
    public String market_from_name;
    public double change;
    public double volume;
    public double now_price;

    public String getName() {
        return currency_name;
    }

    public String getType() {
        return legal_name;
    }

    public String getVolume() {
        return StringUtils.formatNumber(volume);
    }

    public String getValue() {
        return StringUtils.formatNumber(now_price);
    }

    public String getPercent() {
        return change + "%";
    }
}
