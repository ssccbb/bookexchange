package com.sung.common.manager;

/**
 * Create by sung at 2020-04-03
 *
 * @desc: 国际化manager
 * @notice: 处理动态语言切换相关
 */
public class MultiLanguageManager {
    /* 多语言手动切换状态 */
    private boolean mOpenMultiLan = false;

    private static class Holder {
        private static MultiLanguageManager holder = new MultiLanguageManager();
    }

    public static MultiLanguageManager getInstance() {
        return Holder.holder;
    }

    public boolean isOpenMultiLanguage() {
        return mOpenMultiLan;
    }
}
