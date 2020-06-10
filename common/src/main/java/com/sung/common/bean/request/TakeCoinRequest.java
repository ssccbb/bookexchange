package com.sung.common.bean.request;

import com.sung.common.cache.MCache;

/**
 * Create by sung at 2020-05-20
 *
 * @desc:
 * @notice:
 */
public class TakeCoinRequest {
    private String address;
    private String lang;
    private String number;
    private String type;
    private String password;
    private String token;

    public TakeCoinRequest(String address, String lang, String number, String password) {
        this.address = address;
        this.lang = lang;
        this.number = number;
        this.type = "1";
        this.password = password;
        this.token = MCache.getToken();
    }
}
