package com.sung.common.bean.request;

import com.sung.common.bean.response.BaseResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Create by sung at 2020-05-18
 *
 * @desc:
 * @notice:
 */
public class BindAddressRequest extends BaseResponse {
    private String data;
    private String sign;

    public BindAddressRequest(String user_id, String address, String coin_name, String contract_address, String sign) {
        this.data = parserTo(user_id, address, coin_name, contract_address);
        this.sign = sign;
    }

    private String parserTo(String user_id, String address, String coin_name, String contract_address) {
        try {
            JSONObject object = new JSONObject();
            object.put("user_id", user_id);
            object.put("address", address);
            object.put("coin_name", coin_name);
            object.put("contract_address", contract_address);
            object.put("t", System.currentTimeMillis());
            return object.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "{}";
    }
}
