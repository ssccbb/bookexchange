package com.sung.common.bean;

import java.util.List;

/**
 * Create by sung at 2020-04-20
 *
 * @desc:
 * @notice:
 */
public class MessageBean {
    /**
     * id : 1
     * name : USDT
     * get_address :
     * sort : -2
     * logo :
     * is_display : 1
     * min_number : 200.00000000
     * max_number : 1000.00000000
     * rate : 0.05
     * is_lever : 1
     * is_legal : 1
     * is_match : 1
     * show_legal : 1
     * type : usdt
     * decimal_scale : 8
     * chain_fee : 0.00006000
     * black_limt : 0
     * total_account :
     * allow_game_exchange : 1
     * create_time : 2020-04-54 20:49:54
     * quotation : [{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":1980,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"FTC","market_from_name":"huobi","change":-0.52,"volume":9.9449173052247E7,"now_price":0.15103},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":500,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"STC","market_from_name":"huobi","change":3.41,"volume":715522.7087578,"now_price":1.548},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":2000,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"ETC","market_from_name":"huobi","change":0.08,"volume":1466030.4654795,"now_price":5.4527},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"0","exchange_rate":"0.2","sort":"-1000","lever_share_num":null,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"LINK","market_from_name":"huobi","change":1.39,"volume":3740062.5440242,"now_price":3.636},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":50,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"ETH","market_from_name":"huobi","change":-0.29,"volume":1288841.054915,"now_price":178.3},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"0","exchange_rate":"0.2","sort":"-1000","lever_share_num":null,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"HT","market_from_name":"huobi","change":-0.5,"volume":6218594.4112011,"now_price":3.8275},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"0","exchange_rate":"0.2","sort":"-1000","lever_share_num":null,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"OMG","market_from_name":"huobi","change":-3.27,"volume":662705.85801038,"now_price":0.5618},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":1,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"BTC","market_from_name":"huobi","change":-1.02,"volume":30432.571361842,"now_price":7024.69},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":222,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"EOS","market_from_name":"huobi","change":2.31,"volume":2.0055901450377E7,"now_price":2.6469},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"0","exchange_rate":"0.2","sort":"-1000","lever_share_num":null,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"DASH","market_from_name":"huobi","change":-0.89,"volume":193911.78998593,"now_price":79.07},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":30,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"BCH","market_from_name":"huobi","change":-1.3,"volume":173619.21978503,"now_price":228.73},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"0","exchange_rate":"0.2","sort":"-1000","lever_share_num":null,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"ADA","market_from_name":"huobi","change":-0.7,"volume":4.5817341131163E7,"now_price":0.035279},{"id":"1","legal_id":"1","currency_id":"1","is_display":"1","market_from":"2","open_transaction":"1","open_lever":"1","exchange_rate":"0.2","sort":"-1000","lever_share_num":100,"spread":"0.1","overnight":"0.1","lever_trade_fee":0.2,"lever_min_share":"1","lever_max_share":"50000","create_time":"2020-04-54 20:49:54","legal_name":"USDT","currency_name":"LTC","market_from_name":"huobi","change":-1.21,"volume":362134.8394549,"now_price":41.78}]
     */

    public String id;
    public String name;
    public String get_address;
    public String sort;
    public String logo;
    public String is_display;
    public String min_number;
    public String max_number;
    public String rate;
    public String is_lever;
    public String is_legal;
    public String is_match;
    public String show_legal;
    public String type;
    public String decimal_scale;
    public String chain_fee;
    public String black_limt;
    public String total_account;
    public String allow_game_exchange;
    public String create_time;
    public List<QuotationBean> quotation;
}
