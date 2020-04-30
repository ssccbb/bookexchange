package com.sung.uikit.widget;

/**
 * Create by sung at 2020-04-08
 *
 * @desc: 加载状态枚举类
 * @notice:
 */
public enum LoadingTypeEnum {
    /**
     * 加载中
     */
    LOADING(99),
    /**
     * 加载失败
     */
    FAILED(-1),
    /**
     * 加载成功有内容
     */
    SUCCESS(0),
    /**
     * 加载成功无内容
     */
    EMPTY(1);

    private int value;

    LoadingTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static LoadingTypeEnum typeOfValue(int value) {
        LoadingTypeEnum[] var1;
        int var2 = (var1 = values()).length;

        for (int var3 = 0; var3 < var2; ++var3) {
            LoadingTypeEnum var4;
            if ((var4 = var1[var3]).getValue() == value) {
                return var4;
            }
        }

        return SUCCESS;
    }
}
