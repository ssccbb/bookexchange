package com.sung.common.bean.request;

/**
 * Create by sung at 2020-04-20
 *
 * @desc:
 * @notice:
 */
public class LoginRequest extends BaseRequest {
    private String user_string;
    private String password;
    private String sms_code;
    private String country_code;

    public LoginRequest(String user_string, String password) {
        this.user_string = user_string;
        this.password = password;
        this.country_code = "+86";
    }
}
