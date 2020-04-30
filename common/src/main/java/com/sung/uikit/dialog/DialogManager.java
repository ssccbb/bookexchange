package com.sung.uikit.dialog;

import android.content.Context;

import com.sung.common.R;

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
    public static CustomDialog openSimpleTipDialog(Context context, String tips, IPositiveClickListener listener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(tips)
                .positive(context.getResources().getString(R.string.dialog_know))
                .addPositiveListener(listener)
                .negitiveGone()
                .creat();
    }

    /**
     * 展示简单文案供选择的提示弹窗
     *
     * @param context
     * @param tips        文案
     * @param posListener
     * @param negListener
     * @return dialog
     * @author sung at 2020-04-04
     * @notice 监听
     */
    public static CustomDialog openSimpleChooseTipDialog(Context context, String tips, IPositiveClickListener posListener, INegitiveClickListener negListener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(tips)
                .negitive(context.getResources().getString(R.string.dialog_cancel))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .addPositiveListener(posListener)
                .addNegitiveListener(negListener)
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
    public static CustomDialog openLoginoutDialog(Context context, IPositiveClickListener<CustomDialog> loginoutListener) {
        return new DialogBuilder(context)
                .titleGone()
                .desc(context.getResources().getString(R.string.dialog_loginout_tips))
                .positive(context.getResources().getString(R.string.dialog_ok))
                .negitive(context.getResources().getString(R.string.dialog_wrong))
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
