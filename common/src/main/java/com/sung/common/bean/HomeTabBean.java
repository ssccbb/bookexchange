package com.sung.common.bean;

import com.sung.common.HomeTabType;

/**
 * Create by sung at 2020-04-04
 *
 * @desc: 首页tab
 * @notice: 数据封装方便拓展
 */
public class HomeTabBean {
    private String mTabName;
    private int mTabIcon;
    private HomeTabType mTabType;

    public HomeTabBean(HomeTabType mTabType, String mTabName, int mTabIcon) {
        this.mTabType = mTabType;
        this.mTabName = mTabName;
        this.mTabIcon = mTabIcon;
    }

    public HomeTabType getmTabType() {
        return mTabType;
    }

    public void setmTabType(HomeTabType mTabType) {
        this.mTabType = mTabType;
    }

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
