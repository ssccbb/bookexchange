package com.sung.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

import com.sung.common.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Create by sung at 2018/11/14
 *
 * @Description: 加载圈（需要给定宽高）
 */
public class Loading extends View {
    /**
     * 默认颜色
     */
    private int default_color = Color.parseColor("#a1ccd3");
    /**
     * 纯净模式
     */
    private boolean pure = false;
    /**
     * 是否进度递增
     */
    private boolean increase = true;
    /**
     * 弧度动画进行中
     */
    private boolean going = false;
    /**
     * 提示文字
     */
    private String attr_text = "";
    private String hint = "";
    /**
     * 文字大小
     */
    private int text_size = 15;
    /**
     * 文字颜色
     */
    private int color_text = default_color;
    /**
     * 环颜色
     */
    private int color_stroke = default_color;
    /**
     * 内园颜色
     */
    private int color_solid = default_color;
    /**
     * 内园进度
     */
    private int progress = 0;
    /**
     * 内园宽度
     */
    private int width = 0;
    /**
     * 环厚度
     */
    private int stroke_width = 15;
    /**
     * 环画笔
     */
    private Paint hoop_paint;
    /**
     * 内园画笔（画弧）
     */
    private Paint circle_paint;
    /**
     * 文字画笔
     */
    private Paint text_paint;
    /**
     * 定时器
     */
    private Timer animation = new Timer();
    private Handler mUiHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            invalidate();
        }
    };

    public Loading(Context context) {
        super(context);
    }

    public Loading(Context context, AttributeSet attrs) {
        super(context, attrs);
        // attrs
        try {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Loading);
            attr_text = typedArray.getString(R.styleable.Loading_loading_text);
            text_size = typedArray.getInt(R.styleable.Loading_loading_text_size, R.dimen.text_small);
            color_text = typedArray.getColor(R.styleable.Loading_loading_text_color, default_color);
            color_stroke = typedArray.getColor(R.styleable.Loading_loading_stroke_color, default_color);
            color_solid = typedArray.getColor(R.styleable.Loading_loading_solid_color, default_color);
            typedArray.recycle();
        } catch (Exception e) {
        }
        hint = "" + attr_text;
        init();
    }

    Rect text_rect;

    private void init() {
        // 环画笔
        hoop_paint = new Paint();
        hoop_paint.setAntiAlias(true);
        hoop_paint.setColor(color_stroke);
        hoop_paint.setStyle(Paint.Style.STROKE);
        hoop_paint.setStrokeWidth(stroke_width);
        // 圆画笔
        circle_paint = new Paint();
        circle_paint.setAntiAlias(true);
        circle_paint.setColor(color_solid);
        circle_paint.setStyle(Paint.Style.FILL);
        // 文字画笔
        text_paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        text_paint.setColor(color_text);
        text_paint.setTextSize(text_size);
        text_rect = new Rect();
        text_paint.getTextBounds(hint, 0, hint.length(), text_rect);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (hoop_paint == null || circle_paint == null || text_paint == null) {
            init();
        }
        if (getHeight() <= getWidth()) {
            pure = true;
        }
        if (width <= 0) {
            width = Math.min(getHeight(), getWidth());
        }
        // 环(传入的半径 = 环内园半径 + 环宽度)
        canvas.drawCircle(width / 2, width / 2,
                width / 2 - stroke_width, hoop_paint);
        // 内园(画实心弧)
        RectF rectf_head = new RectF(2 * stroke_width, 2 * stroke_width,
                width - (2 * stroke_width), width - (2 * stroke_width));
        // 角度从-90开始（12点位置3点为0）
        canvas.drawArc(rectf_head, -90, getAngle(), true, circle_paint);
        // 文字
        if (!pure && !hint.isEmpty()) {
            float y = width + text_rect.height();
            float x = getWidth() / 2 - text_rect.width() / 2 - /*有三点的存在加点文字偏移量*/8;
            canvas.drawText(hint, x, y, text_paint);
        }
    }

    private void draw() {
        if (increase) {
            progress++;
            if (progress >= 100) {
                // 阙值保险
                progress = 100;
                increase = false;
            }
        } else {
            progress--;
            if (progress <= 0) {
                // 阙值保险
                progress = 0;
                increase = true;
            }
        }
        // 三点动态的提示文字
        if (0 <= progress && progress <= 33) {
            hint = attr_text + ".";
        }
        if (33 < progress && progress <= 66) {
            hint = attr_text + "..";
        }
        if (66 < progress && progress <= 100) {
            hint = attr_text + "...";
        }
        // 重绘
        mUiHandler.sendEmptyMessage(0);
    }

    /**
     * view的显示/隐藏状态变更时调用
     *
     * @description 为防止不主动调用show()/dismiss(),需要根据状态取消/打开timer定时器
     */
    @Override
    protected void onVisibilityChanged(View changedView, int visibility) {
        if (animation == null) return;
        if (visibility == VISIBLE) {
            animation = new Timer();
            animation.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    draw();
                }
            }, 0, 10);
        } else {
            animation.cancel();
        }
    }

    /**
     * 获取弧度
     */
    private int getAngle() {
        float angle = (float) progress / (float) 100 * (float) 360;
        if (increase) {
            // 递增模式下返回正值
            return (int) angle;
        } else {
            // 递减模式下返回负值
            return 0 - (int) angle;
        }
    }

    /**
     * 展示
     */
    public void show() {
        this.setVisibility(VISIBLE);
        if (animation != null && !going) {
            animation.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    draw();
                }
            }, 0, 10);
            going = true;
        }
    }

    /**
     * 隐藏
     */
    public void dismiss() {
        this.setVisibility(GONE);
        if (animation != null && going) {
            animation.cancel();
            going = false;
        }
    }
}
