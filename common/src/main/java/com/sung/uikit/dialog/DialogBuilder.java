package com.sung.uikit.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Create by sung at 2020-04-03
 *
 * @desc: 弹窗builder
 * @notice:
 */
public class DialogBuilder {
    private Context mContext;

    private View mRoot;
    private String mTitle;
    private String mDesc;
    private String mPositive;
    private String mNegitive;

    private boolean mHasTitle = true;
    private boolean mHasDesc = true;
    private boolean mHasPositive = true;
    private boolean mHasNegitive = true;

    private IPositiveClickListener mPositiveListener;
    private INegitiveClickListener mNegitiveListener;

    public DialogBuilder(Context context) {
        this.mContext = context;
    }

    /**
     * 标题
     */
    public DialogBuilder title(String title) {
        this.mTitle = title;
        return this;
    }

    public DialogBuilder titleGone() {
        this.mHasTitle = false;
        return this;
    }

    /**
     * 内容
     */
    public DialogBuilder desc(String desc) {
        this.mDesc = desc;
        return this;
    }

    public DialogBuilder descGone() {
        this.mHasDesc = false;
        return this;
    }

    /**
     * 确定文案
     */
    public DialogBuilder positive(String positive) {
        this.mPositive = positive;
        return this;
    }

    public DialogBuilder positiveGone() {
        this.mHasPositive = false;
        return this;
    }

    /**
     * 取消文案
     */
    public DialogBuilder negitive(String negitive) {
        this.mNegitive = negitive;
        return this;
    }

    public DialogBuilder negitiveGone() {
        this.mHasNegitive = false;
        return this;
    }

    /**
     * 确定按钮监听
     */
    public DialogBuilder addPositiveListener(IPositiveClickListener listener) {
        this.mPositiveListener = listener;
        return this;
    }

    /**
     * 取消按钮监听
     */
    public DialogBuilder addNegitiveListener(INegitiveClickListener listener) {
        this.mNegitiveListener = listener;
        return this;
    }

    public CustomDialog creat() {
        CustomDialog dialog = new CustomDialog(mContext);
        return dialog;
    }
}
