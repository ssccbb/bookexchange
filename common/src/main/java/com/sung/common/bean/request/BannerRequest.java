package com.sung.common.bean.request;

/**
 * Create by sung at 2020-04-22
 *
 * @desc:
 * @notice:
 */
public class BannerRequest extends BaseRequest {
    public static final int TYPE_PIC_BANNER = 5;
    public static final int TYPE_TEXT_BANNER = 4;

    private String c_id;

    public BannerRequest(int cid) {
        this.c_id = String.valueOf(cid);
    }
}
