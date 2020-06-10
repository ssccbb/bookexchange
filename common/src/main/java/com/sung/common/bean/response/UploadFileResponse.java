package com.sung.common.bean.response;

/**
 * Create by sung at 2020-05-21
 *
 * @desc:
 * @notice:
 */
public class UploadFileResponse extends BaseResponse {

    /**
     * code : 0
     * data : {"url":"http://www.ftdime.com/uploads/5ec694c186870.png","path":"/uploads/5ec694c186870.png"}
     * message : null
     * time : null
     * event : web/uploadImg
     */

    public int code;
    public DataBean data;

    public static class DataBean {
        /**
         * url : http://www.ftdime.com/uploads/5ec694c186870.png
         * path : /uploads/5ec694c186870.png
         */

        public String url;
        public String path;
    }
}
