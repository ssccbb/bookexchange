package com.sung.common.bean.request;

import com.sung.common.cache.MCache;

/**
 * Create by sung at 2020-05-19
 *
 * @desc:
 * @notice:
 */
public class ChargeRequest {
    private String type;
    private String lang;
    private String number;
    private String currency;
    private String token;
    private String address;
    private String certificate;
    private String certificate_url;
    private String ptype = "0";

    public ChargeRequest(String lang, String number, String currency, String address, String certificate, String certificate_url) {
        this.type = "1";
        this.lang = lang;
        this.address = address;
        this.number = number;
        this.currency = currency;
        this.token = MCache.getToken();
        this.certificate = certificate;
        this.certificate_url = certificate_url;
    }

    public ChargeRequest(String address, String number, String certificate, String certificate_url, String lang) {
        this.type = "2";
        this.lang = lang;
        this.address = address;
        this.currency = "USDT";
        this.token = MCache.getToken();
        this.number = number;
        this.certificate = certificate;
        this.certificate_url = certificate_url;
        this.ptype = "1";
    }
}
