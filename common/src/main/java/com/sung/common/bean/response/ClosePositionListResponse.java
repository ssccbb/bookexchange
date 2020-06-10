package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-24
 *
 * @desc:
 * @notice:
 */
public class ClosePositionListResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"list":[{"id":1453,"user_id":37,"deal_id":1882,"currency":"FTC","amount":19800,"price":0.16230001,"total":3213.54003906,"fee":1.61000001,"time":"2020-05-14 23:44:02","time_stamp":null,"price_type":1,"multiple":50,"spread":6.42708015,"open_price":0.16230001,"open_time":"2020-05-14 23:44:02","overnight_fee":0,"position":0,"position_time":"2020-05-14 23:44:02","position_price":0.16230001,"close_out":19800,"close_out_fee":1.61000001,"close_out_time":"2020-05-14 23:48:41","close_out_price":0.1628,"close_out_type":0,"open_fee":6.4271,"type":4,"cancel_time":null,"profit_loss":-17.94000053,"stop_profit":0,"stop_loss":0,"floating_pl":-7.91990995,"margin":321.35400391,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC买入平空","lot_num":10},{"id":1434,"user_id":37,"deal_id":1840,"currency":"FTC","amount":1110.34997559,"price":0.1611,"total":22445.94335938,"fee":11.27000046,"time":"2020-05-14 10:53:41","time_stamp":null,"price_type":0,"multiple":50,"spread":0.35775477,"open_price":0.1611,"open_time":"2020-05-14 10:53:41","overnight_fee":0.63999999,"position":0,"position_time":"2020-05-14 10:53:41","position_price":0.16194762,"close_out":138600,"close_out_fee":11.27000046,"close_out_time":"2020-05-14 20:53:25","close_out_price":0.1626,"close_out_type":0,"open_fee":44.8919,"type":4,"cancel_time":null,"profit_loss":-146.58000183,"stop_profit":0,"stop_loss":0,"floating_pl":-76.55581665,"margin":2244.59423828,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC买入平空","lot_num":70},{"id":1427,"user_id":37,"deal_id":1828,"currency":"FTC","amount":4437.00976562,"price":0.1591,"total":10256.84375,"fee":4.82999992,"time":"2020-05-13 20:30:39","time_stamp":null,"price_type":1,"multiple":10,"spread":1.41185641,"open_price":0.1591,"open_time":"2020-05-13 20:30:39","overnight_fee":2.04999995,"position":0,"position_time":"2020-05-13 20:30:39","position_price":0.17267413,"close_out":59400,"close_out_fee":4.82999992,"close_out_time":"2020-05-14 20:53:42","close_out_price":0.16249999,"close_out_type":0,"open_fee":20.5137,"type":4,"cancel_time":null,"profit_loss":579,"stop_profit":0,"stop_loss":0,"floating_pl":604.34411621,"margin":5128.421875,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC买入平空","lot_num":30},{"id":1426,"user_id":37,"deal_id":1823,"currency":"FTC","amount":1122.42004395,"price":0.15899999,"total":3148.19970703,"fee":1.61000001,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":20,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":0.63,"position":0,"position_time":"2020-05-13 20:24:02","position_price":0.15899999,"close_out":19800,"close_out_fee":1.61000001,"close_out_time":"2020-05-14 22:40:57","close_out_price":0.1627,"close_out_type":0,"open_fee":6.2964,"type":3,"cancel_time":null,"profit_loss":65.34999847,"stop_profit":0.16,"stop_loss":0.15000001,"floating_pl":75.24027252,"margin":787.04992676,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC卖出平多","lot_num":10},{"id":1425,"user_id":37,"deal_id":1822,"currency":"FTC","amount":1122.42004395,"price":0.15899999,"total":22054.44921875,"fee":11.27000046,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":10,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":4.40999985,"position":0,"position_time":"2020-05-13 20:24:02","position_price":0.159123,"close_out":138600,"close_out_fee":11.27000046,"close_out_time":"2020-05-14 23:48:41","close_out_price":0.1626,"close_out_type":0,"open_fee":44.1089,"type":3,"cancel_time":null,"profit_loss":426.52999878,"stop_profit":0,"stop_loss":0,"floating_pl":495.77041626,"margin":11027.22460938,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC卖出平多","lot_num":70},{"id":1424,"user_id":37,"deal_id":1821,"currency":"FTC","amount":1122.42004395,"price":0.15899999,"total":51277.12890625,"fee":25.76000023,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":50,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":0.63,"position":0,"position_time":"2020-05-13 20:24:02","position_price":0.16185962,"close_out":316800,"close_out_fee":25.76000023,"close_out_time":"2020-05-14 23:48:41","close_out_price":0.1626,"close_out_type":0,"open_fee":102.5543,"type":3,"cancel_time":null,"profit_loss":106.23999786,"stop_profit":0,"stop_loss":0,"floating_pl":266.23028564,"margin":5127.71289062,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC卖出平多","lot_num":160},{"id":1423,"user_id":37,"deal_id":1820,"currency":"FTC","amount":875.2199707,"price":0.15899999,"total":3146.30737305,"fee":1.57000005,"time":"2020-05-13 20:21:18","time_stamp":null,"price_type":1,"multiple":10,"spread":0.27831995,"open_price":0.15899999,"open_time":"2020-05-13 20:21:18","overnight_fee":0,"position":0,"position_time":"2020-05-13 20:21:18","position_price":0.1589044,"close_out":19800,"close_out_fee":1.57000005,"close_out_time":"2020-05-13 20:21:59","close_out_price":0.15899999,"close_out_type":0,"open_fee":6.2926,"type":4,"cancel_time":null,"profit_loss":-9.76000023,"stop_profit":0,"stop_loss":0,"floating_pl":-1.89251602,"margin":1573.15368652,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC买入平空","lot_num":10},{"id":1422,"user_id":37,"deal_id":1819,"currency":"FTC","amount":19800,"price":0.1591,"total":3150.17993164,"fee":1.57000005,"time":"2020-05-13 20:20:32","time_stamp":null,"price_type":1,"multiple":10,"spread":6.30035973,"open_price":0.1591,"open_time":"2020-05-13 20:20:32","overnight_fee":0,"position":0,"position_time":"2020-05-13 20:20:32","position_price":0.1591,"close_out":19800,"close_out_fee":1.57000005,"close_out_time":"2020-05-13 20:21:59","close_out_price":0.15899999,"close_out_type":0,"open_fee":6.3004,"type":3,"cancel_time":null,"profit_loss":-9.85000038,"stop_profit":0,"stop_loss":0,"floating_pl":-1.98004258,"margin":1575.08996582,"is_blow":0,"fll":0,"test_sp":0,"type_text":"FTC卖出平多","lot_num":10}]}
     * message : null
     * time : null
     * event : web/getClosePositionList
     */

    public int code;
    public DataBean data;
    public String message;

    public static class DataBean {
        public List<ListBean> list;

        public static class ListBean {
            /**
             * id : 1453
             * user_id : 37
             * deal_id : 1882
             * currency : FTC
             * amount : 19800
             * price : 0.16230001
             * total : 3213.54003906
             * fee : 1.61000001
             * time : 2020-05-14 23:44:02
             * time_stamp : null
             * price_type : 1
             * multiple : 50
             * spread : 6.42708015
             * open_price : 0.16230001
             * open_time : 2020-05-14 23:44:02
             * overnight_fee : 0
             * position : 0
             * position_time : 2020-05-14 23:44:02
             * position_price : 0.16230001
             * close_out : 19800
             * close_out_fee : 1.61000001
             * close_out_time : 2020-05-14 23:48:41
             * close_out_price : 0.1628
             * close_out_type : 0
             * open_fee : 6.4271
             * type : 4
             * cancel_time : null
             * profit_loss : -17.94000053
             * stop_profit : 0
             * stop_loss : 0
             * floating_pl : -7.91990995
             * margin : 321.35400391
             * is_blow : 0
             * fll : 0
             * test_sp : 0
             * type_text : FTC买入平空
             * lot_num : 10
             */

            public int id;
            public int user_id;
            public int deal_id;
            public String currency;
            public double amount;
            public double price;
            public double total;
            public double fee;
            public String time;
            public String time_stamp;
            public int price_type;
            public int multiple;
            public double spread;
            public double open_price;
            public String open_time;
            public double overnight_fee;
            public double position;
            public String position_time;
            public double position_price;
            public double close_out;
            public double close_out_fee;
            public String close_out_time;
            public double close_out_price;
            public int close_out_type;
            public double open_fee;
            public int type;
            public String cancel_time;
            public double profit_loss;
            public double stop_profit;
            public double stop_loss;
            public double floating_pl;
            public double margin;
            public int is_blow;
            public double fll;
            public double test_sp;
            public String type_text;
            public double lot_num;
        }
    }
}
