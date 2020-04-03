package com.sung.bookexchange.mvp.ui.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;

import com.sung.bookexchange.BookApplication;
import com.sung.bookexchange.R;
import com.sung.bookexchange.common.ToolbarConfig;
import com.sung.bookexchange.mvp.ui.fragment.BaseFragment;
import com.sung.bookexchange.utils.Log;
import com.sung.bookexchange.utils.ScreenUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;

/**
 * @author: sung
 * @date: 2018/10/15
 * @Description: activity基类
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        ToolbarConfig config = new ToolbarConfig.Builder()
//                .setDisplayBackAsUpEnable(false)
//                .setDisplayCenterTitleEnable(true)
//                .setDisplayLogoEnable(false)
//                .setDisplaySubTitleEnable(false)
//                .setDisplayTitleEnable(false)
//                .setDisplayElevationEnable(true)
//                .setColorBackground(R.color.theme_color)
//                .setTextTitle("主页")
//                .creat();
//        acceptToolbarConfig(config);
    }

    /**
     * 接入Toolbar的配置
     *
     * @notice toolbar的加入使用的是application注册lifecycle的方式
     *         此方法调用需要在onStart()之后
     * */
    protected void acceptToolbarConfig(ToolbarConfig config){
        if (this.getSupportActionBar() == null) {
            return;
        }
        try {
            ActionBar bar = getSupportActionBar();
            bar.setDisplayHomeAsUpEnabled(config.isDisplayBackAsUpEnable());
            bar.setDisplayShowTitleEnabled(config.isDisplayTitleEnable());
            bar.setDisplayUseLogoEnabled(config.isDisplayLogoEnable());
            bar.setSubtitle(config.isDisplaySubTitleEnable() ? config.getTextSubTitle() : "");
            bar.setTitle(config.getTextTitle());
            if (config.getResLogo() != -99) {
                bar.setLogo(config.getResLogo());
            }
            if (config.isDisplayCenterTitleEnable()) {
                bar.setDisplayShowTitleEnabled(false);
                bar.setSubtitle("");
                if (this.findViewById(R.id.tv_title) != null) {
                    TextView centerTitle = this.findViewById(R.id.tv_title);
                    centerTitle.setVisibility(View.VISIBLE);
                    centerTitle.setText(config.getTextTitle());
                    centerTitle.setTextSize(20);
                    if (config.getColorText() != -99) {
                        centerTitle.setTextColor(config.getColorText());
                    }
                }
            }
            if (config.getColorBackground() != -99) {
                bar.setBackgroundDrawable(getResources().getDrawable(config.getColorBackground()));
            }
            if (config.isDisplayElevationEnable()){
                bar.setElevation(config.isDisplayElevationEnable() ? ScreenUtils.dip2px(5,this) : 0f);
            }
        }catch (Exception e){
            Log.e(e.toString());
        }
    }

    @Nullable
    @SuppressWarnings("unchecked")
    protected <T extends BaseFragment> T findFragment(int id) {
        return (T) getSupportFragmentManager().findFragmentById(id);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    protected <T extends BaseFragment> T findFragment(String tag) {
        return (T) getSupportFragmentManager().findFragmentByTag(tag);
    }

    protected Context getContext() {
        return this;
    }

    /**
     * default preferences
     * */
    protected SharedPreferences getPreferences() {
        return BookApplication.getInstance().getPreferences();
    }

    protected FragmentTransaction getSupportFragmentTransaction() {
        return getSupportFragmentManager().beginTransaction();
    }

    public void onBackPress() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

}
