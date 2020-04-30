package com.sung.uikit.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.sung.common.R;

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
        final CustomDialog dialog = new CustomDialog(mContext, R.style.CommonDialogStyle);
        mRoot = LayoutInflater.from(mContext).inflate(R.layout.layout_cutom_dialog, null);
        TextView title = mRoot.findViewById(R.id.tv_title);
        TextView content = mRoot.findViewById(R.id.tv_content);
        TextView negitive = mRoot.findViewById(R.id.tv_neg);
        TextView positive = mRoot.findViewById(R.id.tv_pos);

        title.setVisibility(mHasTitle ? View.VISIBLE : View.GONE);
        content.setVisibility(mHasDesc ? View.VISIBLE : View.GONE);
        negitive.setVisibility(mHasNegitive ? View.VISIBLE : View.GONE);
        positive.setVisibility(mHasPositive ? View.VISIBLE : View.GONE);

        if (!TextUtils.isEmpty(mTitle)) {
            title.setText(mTitle);
        }
        if (!TextUtils.isEmpty(mDesc)) {
            content.setText(mDesc);
        }
        if (!TextUtils.isEmpty(mPositive)) {
            positive.setText(mPositive);
        }
        if (!TextUtils.isEmpty(mNegitive)) {
            negitive.setText(mNegitive);
        }

        if (mPositiveListener != null) {
            positive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPositiveListener.onPositive(dialog);
                }
            });
        }
        if (mNegitiveListener != null) {
            negitive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mNegitiveListener.onNegitive(dialog);
                }
            });
        }

        dialog.addContentView(mRoot, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window dialogWindow = dialog.getWindow();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        DisplayMetrics d = mContext.getResources().getDisplayMetrics();
        lp.width = (int) (d.widthPixels * 0.70);
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes(lp);
        dialogWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
        dialog.setContentView(mRoot);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        return dialog;
    }
}
