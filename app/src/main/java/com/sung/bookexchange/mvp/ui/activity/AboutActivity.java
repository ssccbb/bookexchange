package com.sung.bookexchange.mvp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import com.sung.bookexchange.R;
import com.sung.bookexchange.common.ToolbarConfig;
import com.sung.bookexchange.utils.AppManager;

import butterknife.BindView;

/**
 * Create by sung at 2020-04-23
 *
 * @desc:
 * @notice:
 */
public class AboutActivity extends BaseActivity {
    @BindView(R.id.tv_name)
    TextView mName;
    @BindView(R.id.tv_channel)
    TextView mChannerl;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_about;
    }

    @Override
    protected void set() {
        mName.setText(getResources().getString(R.string.app_name));
        mChannerl.setText(AppManager.getFlavorChannel(this));
    }

    // ----------------   life cycle  ------------------

    @Override
    protected void onResume() {
        super.onResume();
        ToolbarConfig config = new ToolbarConfig.Builder()
                .setDisplayBackAsUpEnable(false)
                .setDisplayCenterTitleEnable(true)
                .setDisplayLogoEnable(false)
                .setDisplaySubTitleEnable(false)
                .setDisplayTitleEnable(false)
                .setDisplayElevationEnable(true)
                .setColorBackground(R.color.theme_color)
                .setColorText(R.color.app_text_dark)
                .setTextTitle(getResources().getString(R.string.app_name))
                .creat();
        acceptToolbarConfig(config);
    }

    // ----------------   view implement ------------------


    // ----------------   public method  ------------------
    public static void open(Activity context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, AboutActivity.class));
    }
}
