package com.sung.bookexchange.mvp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.sung.bookexchange.R;
import com.sung.bookexchange.common.ToolbarConfig;
import com.sung.bookexchange.utils.AppManager;

import butterknife.BindView;
import me.xfans.lib.voicewaveview.VoiceWaveView;
import me.xfans.lib.voicewaveview.WaveMode;

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
    @BindView(R.id.voiceWaveView)
    VoiceWaveView waveView;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_about;
    }

    @Override
    protected void set() {
        mName.setText(getResources().getString(R.string.app_name));
        mChannerl.setText(AppManager.getFlavorChannel(this));

        waveView.setShowGravity(Gravity.RIGHT | Gravity.CENTER);
        waveView.setWaveMode(WaveMode.UP_DOWN);
        waveView.setLineWidth(5f);
        waveView.setLineSpace(5f);
        waveView.setDuration(500);
        waveView.setLineColor(Color.parseColor("#F56B00"));
        waveView.addHeader(4);
        waveView.addHeader(14);
        waveView.addBody(27);
        waveView.addBody(17);
        waveView.addBody(17);
        waveView.addBody(91);
        waveView.addBody(38);
        waveView.addBody(24);
        waveView.addBody(8);
        waveView.addBody(60);
        waveView.addBody(38);
        waveView.addBody(14);
        waveView.addBody(8);
        waveView.addFooter(4);
        waveView.addFooter(2);
        waveView.start();
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
