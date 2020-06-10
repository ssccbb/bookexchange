package com.sung.common.bean.request;

import com.sung.common.bean.response.BaseResponse;

/**
 * Create by sung at 2020-05-11
 *
 * @desc:
 * @notice:
 */
public class PageRequest extends BaseResponse {
    private int page;

    public PageRequest(int page) {
        this.page = page;
    }
}
