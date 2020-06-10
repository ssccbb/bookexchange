package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-24
 *
 * @desc:
 * @notice:
 */
public class OrderPositionListResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"all_profit_loss":1.27269602,"list":[{"id":1622,"user_id":37,"deal_id":2067,"currency":"FTC","amount":12725.66015625,"price":"0.1590","total":3148.90722656,"fee":6.2979,"time":"2020-05-24 19:50:44","time_stamp":null,"price_type":1,"multiple":50,"spread":4.04675961,"open_price":0.15899999,"open_time":"2020-05-24 19:50:44","overnight_fee":0,"position":19800,"position_time":"2020-05-24 19:50:44","position_price":0.15903573,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":6.2979,"type":1,"cancel_time":null,"profit_loss":1.27269602,"stop_profit":0,"stop_loss":0,"floating_pl":1.27269602,"margin":314.89071655,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1590","hazard_rate":"0.4042%","type_text":"FTC买入做多x10","p_s":0,"lot":1980}]}
     * message : null
     * time : null
     * event : web/getPositionList
     */

    public int code;
    public DataBean data;
    public String message;

    public static class DataBean {
        /**
         * all_profit_loss : 1.27269602
         * list : [{"id":1622,"user_id":37,"deal_id":2067,"currency":"FTC","amount":12725.66015625,"price":"0.1590","total":3148.90722656,"fee":6.2979,"time":"2020-05-24 19:50:44","time_stamp":null,"price_type":1,"multiple":50,"spread":4.04675961,"open_price":0.15899999,"open_time":"2020-05-24 19:50:44","overnight_fee":0,"position":19800,"position_time":"2020-05-24 19:50:44","position_price":0.15903573,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":6.2979,"type":1,"cancel_time":null,"profit_loss":1.27269602,"stop_profit":0,"stop_loss":0,"floating_pl":1.27269602,"margin":314.89071655,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1590","hazard_rate":"0.4042%","type_text":"FTC买入做多x10","p_s":0,"lot":1980}]
         */

        public double all_profit_loss;
        public List<ListBean> list;

        public static class ListBean {
            /**
             * id : 1622
             * user_id : 37
             * deal_id : 2067
             * currency : FTC
             * amount : 12725.66015625
             * price : 0.1590
             * total : 3148.90722656
             * fee : 6.2979
             * time : 2020-05-24 19:50:44
             * time_stamp : null
             * price_type : 1
             * multiple : 50
             * spread : 4.04675961
             * open_price : 0.15899999
             * open_time : 2020-05-24 19:50:44
             * overnight_fee : 0
             * position : 19800
             * position_time : 2020-05-24 19:50:44
             * position_price : 0.15903573
             * close_out : 0
             * close_out_fee : 0
             * close_out_time : null
             * close_out_price : 0
             * close_out_type : 0
             * open_fee : 6.2979
             * type : 1
             * cancel_time : null
             * profit_loss : 1.27269602
             * stop_profit : 0
             * stop_loss : 0
             * floating_pl : 1.27269602
             * margin : 314.89071655
             * is_blow : 0
             * fll : 0
             * test_sp : 0
             * new_price : 0.1590
             * hazard_rate : 0.4042%
             * type_text : FTC买入做多x10
             * p_s : 0
             * lot : 1980
             */

            public int id;
            public int user_id;
            public int deal_id;
            public String currency;
            public double amount;
            public String price;
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
            public String new_price;
            public String hazard_rate;
            public String type_text;
            public int p_s;
            public double lot;

        }
    }
}
