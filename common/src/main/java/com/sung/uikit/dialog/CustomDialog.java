package com.sung.uikit.dialog;

import android.content.Context;

/**
 * Create by sung at 2020-04-03
 *
 * @desc: 通用自定义弹窗
 * @notice: 展示元素通过builder创建
 */
public class CustomDialog extends BaseDialog {
    public CustomDialog(Context context) {
        super(context);
    }

    public CustomDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    protected CustomDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
