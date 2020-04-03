package com.sung.uikit.dialog;

import android.content.Context;

/**
 * Create by sung at 2020-04-03
 *
 * @desc: 弹窗管理类
 * @notice: 统一弹窗入口
 */
public class DialogManager {

    /**
     * 展示简单文案提示弹窗
     *
     * @param context
     * @param tips     文案
     * @param listener
     * @return dialog
     * @author sung at 2020-04-04
     * @notice 无点击监听
     */
    public CustomDialog openSimpleTipDialog(Context context, String tips, IPositiveClickListener listener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(tips)
                .positive("知道了")
                .negitiveGone()
                .creat();
    }

    /**
     * 退出应用弹窗
     *
     * @param context
     * @param loginoutListener 退出监听
     * @return dialog
     * @author sung at 2020-04-04
     * @notice
     */
    public CustomDialog openLoginoutDialog(Context context, IPositiveClickListener<CustomDialog> loginoutListener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc("确认注销并退出吗？")
                .positive("退出")
                .negitive("点错了")
                .addPositiveListener(loginoutListener)
                .addNegitiveListener(new INegitiveClickListener<CustomDialog>() {
                    @Override
                    public void onNegitive(CustomDialog customDialog) {
                        customDialog.dismiss();
                    }
                })
                .creat();
    }
}
