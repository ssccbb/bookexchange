package com.sung.common.bean.request;

import com.sung.common.cache.MCache;

/**
 * Create by sung at 2020-05-18
 *
 * @desc:
 * @notice:
 */
public class AssetTransferRequest {
    private String type;
    private String lang;
    private String number;
    private String fid;
    private String tid;
    private String currency;
    private String token;

    public AssetTransferRequest(String type, String lang, String number, String fid, String tid, String currency) {
        this.type = type;
        this.lang = lang;
        this.number = number;
        this.fid = fid;
        this.tid = tid;
        this.currency = currency;
        this.token = MCache.getToken();
    }
}
