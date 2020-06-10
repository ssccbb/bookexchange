package com.sung.common.bean;

import com.sung.common.bean.response.BaseResponse;

/**
 * Create by sung at 2020-04-25
 *
 * @desc:
 * @notice:
 */
public class KLineBean extends BaseResponse {

    /**
     * id : 1587801600
     * open : 1.6360
     * close : 1.6350
     * low : 1.6290
     * high : 1.640
     * amount : 35574.5401552159
     * vol : 5815.82072350
     * count : 26
     * time : 1587801600000
     * volume : 5815.82072350
     * period : 60min
     * symbol : STC/USDT
     * type : kline
     */

    public int id;
    public double open;
    public double close;
    public double low;
    public double high;
    public double amount;
    public String vol;
    public int count;
    public long time;
    public double volume;
    public String period;
    public String symbol;
    public String type;
}
