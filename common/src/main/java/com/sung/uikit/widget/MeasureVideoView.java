package com.sung.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Create by sung at 2020-04-12
 *
 * @desc: 适配宽高的videoview
 * @notice:
 */
public class MeasureVideoView extends VideoView {
    public MeasureVideoView(Context context) {
        super(context);
    }

    public MeasureVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MeasureVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }
}
