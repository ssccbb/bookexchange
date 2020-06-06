package com.sung.bookexchange.mvp.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.sung.bookexchange.R;
import com.sung.bookexchange.utils.Router;
import com.sung.bookexchange.view.HomeTabLayout;
import com.sung.common.Constants;
import com.sung.bookexchange.utils.AppManager;
import com.sung.bookexchange.mvp.interfaces.IVIndex;
import com.sung.common.bean.HomeTabBean;
import com.sung.common.bean.UserBean;
import com.sung.common.cache.MCache;
import com.sung.common.cache.MTempCache;
import com.sung.common.eventbus.DrawerActionEvenet;
import com.sung.common.utils.ClipUtils;
import com.sung.uikit.dialog.DialogManager;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnPageChange;

public class IndexActivity extends BaseActivity implements IVIndex,HomeTabLayout.OnTabSelectListener {
    private boolean ABLE_EXIT_APP = false;
    private Handler mDoubleClickHandler = new Handler();

//    private IndexPagerAdapter<HomeTabBean, BaseFragment> mAdapter;

    @BindView(R.id.dl_drawer)
    DrawerLayout mDrawer;
    @BindView(R.id.sw_status)
    Switch mNightMode;
    @BindView(R.id.tv_account)
    TextView mDrawerAccount;
    @BindView(R.id.tv_uid)
    TextView mDrawerUid;
    @BindView(R.id.vp_pager)
    ViewPager mPager;
    @BindView(R.id.htl_tabs)
    HomeTabLayout mTabLayout;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_index;
    }

    @Override
    protected void set() {
//        mAdapter = new IndexPagerAdapter<HomeTabBean, BaseFragment>(getSupportFragmentManager(), mTabLayout.getTabs()) {
//            @NonNull
//            @Override
//            public BaseFragment createFragment(int position, HomeTabBean data) {
//                HomeTabType type = data.getmTabType();
//                if (type == HomeTabType.HOME_INDEX) {
//                    return IndexFragment.getInstance();
//                } else if (type == HomeTabType.HOME_QUOTATION) {
//                    return QuotationFragment.getInstance();
//                } else if (type == HomeTabType.HOME_TRANSACTION) {
//                    return TransactionFragment.getInstance();
//                } else if (type == HomeTabType.HOME_CONTRACT) {
//                    return ContractFragment.getInstance();
//                } else if (type == HomeTabType.HOME_ASSETS) {
//                    return AssetsFragment.getInstance();
//                }
//                return AssetsFragment.getInstance();
//            }
//        };
        mPager.setOffscreenPageLimit(5);
//        mPager.setAdapter(mAdapter);
        mPager.setCurrentItem(0, true);
        //drawer navigation
        setNavigation(null);
        //tabs
        mTabLayout.addOnTabSelectListener(this);
        mTabLayout.setSelect(0, true);
    }

    private void setNavigation(UserBean user) {
        mDrawerAccount.setText(user == null ? MCache.getAccount() : user.account);
        mDrawerUid.setVisibility(user == null ? View.GONE : View.VISIBLE);
        mDrawerUid.setText(user == null ? "" : "UID:" + user.id);
        mNightMode.setChecked(MCache.isNighrModeOpen());
    }

    // ----------------   life cycle  ------------------


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    // ----------------   view implement ------------------

    @Override
    public Context getContext() {
        return this;
    }

    // ----------------   public method  ------------------

    @Override
    public void onTabSelect(int position, HomeTabBean tab) {
        mPager.setCurrentItem(position);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //如果侧滑展开了 优先收起
            if (mDrawer != null && mDrawer.isDrawerOpen(GravityCompat.START)) {
                mDrawer.closeDrawer(GravityCompat.START);
                return false;
            }
            // double click exit
            if (ABLE_EXIT_APP) {
                mDoubleClickHandler.removeCallbacksAndMessages(null);
                AppManager.getAppManager().AppExit(this);
                return true;
            }
            ABLE_EXIT_APP = true;
            mDoubleClickHandler.postDelayed(() -> ABLE_EXIT_APP = false, Constants.Config.CONFIG_INDEX_EXIT_TIME);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    @OnPageChange(R.id.vp_pager)
    public void onPageChange(int position) {
        mTabLayout.resetAllTabSelect();
        mTabLayout.setSelect(position, true);
    }

    @OnClick({R.id.ll_change_language,
            R.id.ll_about_us, R.id.ll_night_mode, R.id.ll_clear_cache,
            R.id.tv_uid, R.id.tv_loginout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_change_language:
                Router.goChangeLanguageActivity(this);
                break;
            case R.id.ll_about_us:
                Router.goAboutUsActivity(this);
                break;
            case R.id.ll_night_mode:
                //夜间模式
                boolean open = mNightMode.isChecked();
                DialogManager.openSimpleChooseTipDialog(this,
                        getResources().getString(open ? R.string.app_close_nightmode_tips : R.string.app_open_nightmode_tips),
                        customDialog -> {
                            //夜间模式
                            customDialog.dismiss();
                            MCache.setNightMode(!open);
                        }, customDialog -> {
                            customDialog.dismiss();
                        }).show();
                break;
            case R.id.ll_clear_cache:
                DialogManager.openSimpleChooseTipDialog(this,
                        getResources().getString(R.string.app_cache_tips),
                        customDialog -> {
                            //清除缓存
                            customDialog.dismiss();
                            MTempCache.clear();
                        }, customDialog -> {
                            customDialog.dismiss();
                        }).show();
                break;
            case R.id.tv_uid:
                try {
                    ClipUtils.setText(this, mDrawerUid.getText().toString().trim());
                    Toast.makeText(this, getResources().getString(R.string.app_copy), Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.tv_loginout:
                DialogManager.openLoginoutDialog(this, customDialog -> {
                    //退出登录
                    customDialog.dismiss();
                    relogin();
                }).show();
                break;
            default:
                break;
        }
        mDrawer.closeDrawer(GravityCompat.START);
    }

    // ----------------   event method  ------------------

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDrawerActionEvent(DrawerActionEvenet evenet) {
        if (mDrawer == null) {
            return;
        }
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            //close
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            //open
            mDrawer.openDrawer(GravityCompat.START);
        }
    }

    // ----------------   net method  ------------------
    public static void open(Activity context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, IndexActivity.class));
    }
}
