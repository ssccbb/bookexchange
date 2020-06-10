package com.sung.common.bean.response;

import java.util.List;

/**
 * Create by sung at 2020-05-14
 *
 * @desc:
 * @notice:
 */
public class PositionListResponse extends BaseResponse {

    /**
     * type : ok
     * message : {"all_profit_loss":1088.02972793,"hazard_rate":"24.6084%","order":{"data":[{"id":1434,"user_id":37,"deal_id":1840,"currency":"FTC","amount":1110.34997559,"price":"0.1617","total":19225.10351562,"fee":38.4502,"time":"2020-05-14 10:53:41","time_stamp":null,"price_type":0,"multiple":50,"spread":0.35775477,"open_price":0.1611,"open_time":"2020-05-14 10:53:41","overnight_fee":0.63999999,"position":118800,"position_time":"2020-05-14 10:53:41","position_price":0.16182746,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":38.4502,"type":2,"cancel_time":null,"profit_loss":15.14406204,"stop_profit":0,"stop_loss":0,"floating_pl":15.14406204,"margin":1922.51025391,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"0.7877%","share":60,"type_text":"FTC卖出做空x60","p_s":0,"lot":1980},{"id":1427,"user_id":37,"deal_id":1828,"currency":"FTC","amount":4437.00976562,"price":"0.1617","total":10256.84375,"fee":20.5137,"time":"2020-05-13 20:30:39","time_stamp":null,"price_type":1,"multiple":10,"spread":1.41185641,"open_price":0.1591,"open_time":"2020-05-13 20:30:39","overnight_fee":2.04999995,"position":59400,"position_time":"2020-05-13 20:30:39","position_price":0.17267413,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":20.5137,"type":2,"cancel_time":null,"profit_loss":651.86401367,"stop_profit":0,"stop_loss":0,"floating_pl":651.86401367,"margin":5128.421875,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"12.7108%","share":30,"type_text":"FTC卖出做空x30","p_s":0,"lot":1980},{"id":1426,"user_id":37,"deal_id":1823,"currency":"FTC","amount":1122.42004395,"price":"0.1617","total":3148.19970703,"fee":6.2964,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":20,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":0.63,"position":19800,"position_time":"2020-05-13 20:24:02","position_price":0.15899999,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":6.2964,"type":1,"cancel_time":null,"profit_loss":53.46020126,"stop_profit":0,"stop_loss":0,"floating_pl":53.46020126,"margin":787.04992676,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"6.7925%","share":10,"type_text":"FTC买入做多x10","p_s":0,"lot":1980},{"id":1425,"user_id":37,"deal_id":1822,"currency":"FTC","amount":1122.42004395,"price":"0.1617","total":22054.44921875,"fee":44.1089,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":10,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":4.40999985,"position":138600,"position_time":"2020-05-13 20:24:02","position_price":0.159123,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":44.1089,"type":1,"cancel_time":null,"profit_loss":357.1701355,"stop_profit":0,"stop_loss":0,"floating_pl":357.1701355,"margin":11027.22460938,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"3.239%","share":70,"type_text":"FTC买入做多x70","p_s":0,"lot":1980},{"id":1424,"user_id":37,"deal_id":1821,"currency":"FTC","amount":1122.42004395,"price":"0.1617","total":41611.1875,"fee":83.2224,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":50,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":0.63,"position":257400,"position_time":"2020-05-13 20:24:02","position_price":0.16165963,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":83.2224,"type":1,"cancel_time":null,"profit_loss":10.39131546,"stop_profit":0,"stop_loss":0,"floating_pl":10.39131546,"margin":4161.11914062,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"0.2497%","share":130,"type_text":"FTC买入做多x130","p_s":0,"lot":1980}]}}
     */

    public MessageBean message;

    public static class MessageBean {
        /**
         * all_profit_loss : 1088.02972793
         * hazard_rate : 24.6084%
         * order : {"data":[{"id":1434,"user_id":37,"deal_id":1840,"currency":"FTC","amount":1110.34997559,"price":"0.1617","total":19225.10351562,"fee":38.4502,"time":"2020-05-14 10:53:41","time_stamp":null,"price_type":0,"multiple":50,"spread":0.35775477,"open_price":0.1611,"open_time":"2020-05-14 10:53:41","overnight_fee":0.63999999,"position":118800,"position_time":"2020-05-14 10:53:41","position_price":0.16182746,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":38.4502,"type":2,"cancel_time":null,"profit_loss":15.14406204,"stop_profit":0,"stop_loss":0,"floating_pl":15.14406204,"margin":1922.51025391,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"0.7877%","share":60,"type_text":"FTC卖出做空x60","p_s":0,"lot":1980},{"id":1427,"user_id":37,"deal_id":1828,"currency":"FTC","amount":4437.00976562,"price":"0.1617","total":10256.84375,"fee":20.5137,"time":"2020-05-13 20:30:39","time_stamp":null,"price_type":1,"multiple":10,"spread":1.41185641,"open_price":0.1591,"open_time":"2020-05-13 20:30:39","overnight_fee":2.04999995,"position":59400,"position_time":"2020-05-13 20:30:39","position_price":0.17267413,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":20.5137,"type":2,"cancel_time":null,"profit_loss":651.86401367,"stop_profit":0,"stop_loss":0,"floating_pl":651.86401367,"margin":5128.421875,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"12.7108%","share":30,"type_text":"FTC卖出做空x30","p_s":0,"lot":1980},{"id":1426,"user_id":37,"deal_id":1823,"currency":"FTC","amount":1122.42004395,"price":"0.1617","total":3148.19970703,"fee":6.2964,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":20,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":0.63,"position":19800,"position_time":"2020-05-13 20:24:02","position_price":0.15899999,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":6.2964,"type":1,"cancel_time":null,"profit_loss":53.46020126,"stop_profit":0,"stop_loss":0,"floating_pl":53.46020126,"margin":787.04992676,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"6.7925%","share":10,"type_text":"FTC买入做多x10","p_s":0,"lot":1980},{"id":1425,"user_id":37,"deal_id":1822,"currency":"FTC","amount":1122.42004395,"price":"0.1617","total":22054.44921875,"fee":44.1089,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":10,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":4.40999985,"position":138600,"position_time":"2020-05-13 20:24:02","position_price":0.159123,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":44.1089,"type":1,"cancel_time":null,"profit_loss":357.1701355,"stop_profit":0,"stop_loss":0,"floating_pl":357.1701355,"margin":11027.22460938,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"3.239%","share":70,"type_text":"FTC买入做多x70","p_s":0,"lot":1980},{"id":1424,"user_id":37,"deal_id":1821,"currency":"FTC","amount":1122.42004395,"price":"0.1617","total":41611.1875,"fee":83.2224,"time":"2020-05-13 20:24:02","time_stamp":null,"price_type":0,"multiple":50,"spread":0.35692954,"open_price":0.15899999,"open_time":"2020-05-13 20:24:02","overnight_fee":0.63,"position":257400,"position_time":"2020-05-13 20:24:02","position_price":0.16165963,"close_out":0,"close_out_fee":0,"close_out_time":null,"close_out_price":0,"close_out_type":0,"open_fee":83.2224,"type":1,"cancel_time":null,"profit_loss":10.39131546,"stop_profit":0,"stop_loss":0,"floating_pl":10.39131546,"margin":4161.11914062,"is_blow":0,"fll":0,"test_sp":0,"new_price":"0.1617","hazard_rate":"0.2497%","share":130,"type_text":"FTC买入做多x130","p_s":0,"lot":1980}]}
         */

        public double all_profit_loss;
        public String hazard_rate;
        public OrderBean order;

        public static class OrderBean {
            public List<DataBean> data;

            public static class DataBean {
                /**
                 * id : 1434
                 * user_id : 37
                 * deal_id : 1840
                 * currency : FTC
                 * amount : 1110.34997559
                 * price : 0.1617
                 * total : 19225.10351562
                 * fee : 38.4502
                 * time : 2020-05-14 10:53:41
                 * time_stamp : null
                 * price_type : 0
                 * multiple : 50
                 * spread : 0.35775477
                 * open_price : 0.1611
                 * open_time : 2020-05-14 10:53:41
                 * overnight_fee : 0.63999999
                 * position : 118800
                 * position_time : 2020-05-14 10:53:41
                 * position_price : 0.16182746
                 * close_out : 0
                 * close_out_fee : 0
                 * close_out_time : null
                 * close_out_price : 0
                 * close_out_type : 0
                 * open_fee : 38.4502
                 * type : 2
                 * cancel_time : null
                 * profit_loss : 15.14406204
                 * stop_profit : 0
                 * stop_loss : 0
                 * floating_pl : 15.14406204
                 * margin : 1922.51025391
                 * is_blow : 0
                 * fll : 0
                 * test_sp : 0
                 * new_price : 0.1617
                 * hazard_rate : 0.7877%
                 * share : 60
                 * type_text : FTC卖出做空x60
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
                public long time_stamp;
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
                public double close_out_type;
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
                public int share;
                public String type_text;
                public int p_s;
                public double lot;

            }
        }
    }
}
