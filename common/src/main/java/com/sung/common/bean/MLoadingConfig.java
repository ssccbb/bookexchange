package com.sung.common.bean;

import java.io.Serializable;

import androidx.annotation.ColorRes;

/**
 * Create by sung at 2020-05-22
 *
 * @desc:
 * @notice:
 */
public class MLoadingConfig implements Serializable {
    private boolean tips_visible;
    private int tips_color;
    private int progress_color;
    private String tips;

    public boolean isTipsVisible() {
        return tips_visible;
    }

    public int getTipsColor() {
        return tips_color;
    }

    public int getProgressColor() {
        return progress_color;
    }

    public String getTips() {
        return tips;
    }

    public static class Builder {
        private MLoadingConfig config = new MLoadingConfig();

        public Builder setTips(String tips) {
            config.tips= tips;
            return this;
        }

        public Builder setTipsColor(@ColorRes int color) {
            config.tips_color = color;
            return this;
        }

        public Builder setTipsVisible(boolean visible) {
            config.tips_visible = visible;
            return this;
        }

        public Builder setProgressColor(@ColorRes int color) {
            config.tips_color = color;
            return this;
        }

        public MLoadingConfig creat() {
            return config;
        }
    }
}
