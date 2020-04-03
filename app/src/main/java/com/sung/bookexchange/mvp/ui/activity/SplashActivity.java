package com.sung.bookexchange.mvp.ui.activity;

import android.Manifest;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.os.Bundle;
import android.widget.TextView;

import com.sung.bookexchange.R;
import com.sung.common.Constants;
import com.sung.bookexchange.utils.PermissionsHelper;

import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.OnClick;

public class SplashActivity extends BaseActivity {
    private Handler mUIHandler = new Handler();
    private Runnable mSkipRunnable = () -> goTo();
    private Runnable mUpdateTextRunnable = () -> invalidate();
    private int arg;

    private PermissionsHelper mPermissionsHelper;
    private Stack<String> mPermissions;

    @BindView(R.id.tv_skip)
    TextView mSkip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mUIHandler.postDelayed(mSkipRunnable, Constants.CONFIG_SPLASH_SKIP_TIME);
        checkPermission();
        skipTimerStart();
    }

    private void checkPermission() {
        if (mPermissions == null) {
            mPermissions = new Stack<>();
        }
        mPermissions.push(Manifest.permission.READ_EXTERNAL_STORAGE);
        mPermissions.push(Manifest.permission.INTERNET);

        mPermissionsHelper = new PermissionsHelper(this);
        boolean done = mPermissionsHelper.checkPermissions(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.INTERNET);
        if (!done) {
            mUIHandler.removeCallbacksAndMessages(null);
            mPermissionsHelper.permissionsCheck(mPermissions.peek(), 100);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100) {
            if (!mPermissions.isEmpty()) {
                mPermissions.pop();
            }
            if (!mPermissions.isEmpty()) {
                mPermissionsHelper.permissionsCheck(mPermissions.peek(), 100);
            } else {
                mUIHandler.postDelayed(mSkipRunnable, Constants.CONFIG_SPLASH_SKIP_TIME);
                skipTimerStart();
            }
        }
    }

    @OnClick(R.id.tv_skip)
    public void intercept() {
        mUIHandler.removeCallbacksAndMessages(null);
        goTo();
    }

    private void skipTimerStart() {
        arg = Constants.CONFIG_SPLASH_SKIP_TIME / 1000;
        Timer skip = new Timer();
        skip.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    mUIHandler.post(mUpdateTextRunnable);
                    if (arg <= 0) {
                        skip.cancel();
                    }
                } catch (Exception e) {
                }
            }
        }, 0, 1000);
    }

    private void invalidate() {
        mSkip.setText("跳过(" + (arg <= 0 ? 0 : arg--) + ")");
    }

    private void goTo() {
        IndexActivity.open(this);
        this.finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUIHandler != null) {
            mUIHandler.removeCallbacksAndMessages(null);
            mUIHandler = null;
        }
    }
}
