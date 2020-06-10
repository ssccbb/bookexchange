package com.sung.uikit.dialog;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.sung.common.R;
import com.sung.common.bean.MLoadingConfig;

import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;

/**
 * Create by sung at 2020-05-22
 *
 * @desc: 加载器
 * @notice:
 */
public class MLoading extends DialogFragment {
    private ProgressBar mProgress;
    private TextView mLoading;

    private @ColorRes int mDefaultProgressColor;
    private @ColorRes int mDefaultTipsColor;
    private String mDefaultTips;
    private boolean mDefaultTipsVisible;

    private MLoadingConfig mLoadingConfig;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.FadeDialogFragmentStyle);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onActivityCreated(savedInstanceState);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0x00000000));
        getDialog().getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        getDialog().getWindow().setGravity(Gravity.CENTER);
        getDialog().setCanceledOnTouchOutside(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_m_loading, null, false);

        mDefaultProgressColor = R.color.theme_color;
        mDefaultTipsColor = android.R.color.black;
        mDefaultTips = getString(R.string.app_loading_tips);
        mDefaultTipsVisible = true;

        mLoadingConfig = (MLoadingConfig) getArguments().getSerializable(MLoading.class.getSimpleName());
        mProgress = view.findViewById(R.id.pb_loading);
        mLoading = view.findViewById(R.id.tv_loading);

        if (mLoadingConfig != null) {
            mLoading.setVisibility(mLoadingConfig.isTipsVisible() ? View.VISIBLE : View.GONE);
            mLoading.setText(TextUtils.isEmpty(mLoadingConfig.getTips()) ? mDefaultTips : mLoadingConfig.getTips());
            mLoading.setTextColor(getResources().getColor(mLoadingConfig.getTipsColor() != 0 ? mLoadingConfig.getTipsColor() : mDefaultTipsColor));
        }
        return view;
    }

    public static MLoading show(Context context) {
        return show(context, new MLoadingConfig.Builder().setTipsVisible(false).creat());
    }

    public static MLoading show(Context context, String tips) {
        return show(context, new MLoadingConfig.Builder().setTipsVisible(true).setTips(tips).creat());
    }

    public static MLoading show(Context context, boolean tipsVisible) {
        return show(context, new MLoadingConfig.Builder().setTipsVisible(tipsVisible).creat());
    }

    public static MLoading show(Context context, MLoadingConfig config) {
        MLoading dialog = new MLoading();
        Bundle b = new Bundle();
        b.putSerializable(MLoading.class.getSimpleName(), config);
        dialog.setArguments(b);
        if (context != null) {
            FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.add(dialog, MLoading.class.getSimpleName());
            ft.commitAllowingStateLoss();
        }
        return dialog;
    }

    public static void hide(MLoading loading){
        loading.dismissAllowingStateLoss();
    }
}
