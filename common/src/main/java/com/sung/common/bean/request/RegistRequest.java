package com.sung.common.bean.request;

/**
 * Create by sung at 2020-04-20
 *
 * @desc:
 * @notice:
 */
public class RegistRequest {
    private String user_string;
    private String account;
    private String password;
    private String password_again;
    private String email_code;
    private String code;
    private String invitation_code;
    private String lang;

    public RegistRequest(String user_string, String password, String password_again, String email_code, String invitation_code, String lang) {
        this.user_string = user_string;
        this.password = password;
        this.password_again = password_again;
        this.email_code = email_code;
        this.invitation_code = invitation_code;
        this.lang = lang;
    }

    public RegistRequest(String account, String code, String lang, String password, String password_again) {
        this.account = account;
        this.password = password;
        this.password_again = password_again;
        this.code = code;
        this.lang = lang;
    }
}
