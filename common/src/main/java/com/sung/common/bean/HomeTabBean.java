package com.sung.common.bean;

/**
 * Create by sung at 2020-04-04
 *
 * @desc: 首页tab
 * @notice: 数据封装方便拓展
 */
public class HomeTabBean {
    private String mTabName;
    private int mTabIcon;

    public String getmTabName() {
        return mTabName;
    }

    public void setmTabName(String mTabName) {
        this.mTabName = mTabName;
    }

    public int getmTabIcon() {
        return mTabIcon;
    }

    public void setmTabIcon(int mTabIcon) {
        this.mTabIcon = mTabIcon;
    }
}
