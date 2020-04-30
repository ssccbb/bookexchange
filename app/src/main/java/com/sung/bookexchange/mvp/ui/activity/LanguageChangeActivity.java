package com.sung.bookexchange.mvp.ui.activity;

import android.view.View;

import com.sung.bookexchange.R;
import com.sung.bookexchange.common.ToolbarConfig;
import com.sung.uikit.dialog.DialogManager;

import butterknife.OnClick;

public class LanguageChangeActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_language_changed;
    }

    @Override
    protected void set() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        ToolbarConfig config = new ToolbarConfig.Builder()
                .setDisplayBackAsUpEnable(true)
                .setDisplayCenterTitleEnable(true)
                .setDisplayLogoEnable(false)
                .setDisplaySubTitleEnable(false)
                .setDisplayTitleEnable(false)
                .setDisplayElevationEnable(true)
                .setColorBackground(R.color.theme_color)
                .setTextTitle(getResources().getString(R.string.app_activity_language))
                .creat();
        acceptToolbarConfig(config);
    }

    @OnClick({R.id.tv_en, R.id.tv_cn, R.id.tv_hk, R.id.tv_jp, R.id.tv_ko})
    public void onClick(View v) {
        try {
            DialogManager.openSimpleChooseTipDialog(LanguageChangeActivity.this,
                    getResources().getString(R.string.sys_change_lang_tips),
                    baseDialog -> {
                        switch (v.getId()) {
                            case R.id.tv_en:
                                changeEnglish();
                                break;
                            case R.id.tv_cn:
                                changeChinese();
                                break;
                            case R.id.tv_hk:
                                changeRChinese();
                                break;
                            case R.id.tv_jp:
                                changeJapanese();
                                break;
                            case R.id.tv_ko:
                                changeKorean();
                                break;
                        }
                    }, baseDialog -> {
                        baseDialog.dismiss();
                    }).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
