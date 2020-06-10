package com.sung.common.bean;

/**
 * Create by sung at 2020-05-13
 *
 * @desc:
 * @notice:
 */
public class OrderBean {
    public String mCoinName;
    public String mTypeName;
    public String mhands;
    public String mMutiple;
    public String mSafeValue;
    public String mServiceValue;

    public OrderBean(String mCoinName, String mTypeName, String mhands, String mMutiple, String mSafeValue, String mServiceValue) {
        this.mCoinName = mCoinName;
        this.mTypeName = mTypeName;
        this.mhands = mhands;
        this.mMutiple = mMutiple;
        this.mSafeValue = mSafeValue;
        this.mServiceValue = mServiceValue;
    }
}
