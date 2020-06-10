package com.sung.common.eventbus;

/**
 * Create by sung at 2020-05-21
 *
 * @desc:
 * @notice:
 */
public class PageEvent {
    private int type;

    public PageEvent(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
