package com.sung.bookexchange.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sung.bookexchange.R;
import com.sung.bookexchange.utils.ScreenUtils;

/**
 * Create by sung at 2018/12/4
 *
 * @Description: 标签（待拓展点击/选中/随机颜色）
 */
public class TagView extends FrameLayout implements View.OnClickListener {
    private Context context;
    private TextView tag;

    private static final int DEAFAULT_MARGIN = 5;

    public TagView(Context context) {
        super(context);
        init();
    }

    private void init(){
        context = this.getContext();
        tag = (TextView) LayoutInflater.from(context)
                .inflate(R.layout.view_source_tag, null, false);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        params.setMargins(DEAFAULT_MARGIN,
                DEAFAULT_MARGIN,
                DEAFAULT_MARGIN,
                DEAFAULT_MARGIN);
        this.removeAllViews();
        this.addView(tag,params);
        this.setOnClickListener(this);
    }

    public void setContent(String content){
        if (content.isEmpty()) return;
        tag.setText(content);
    }

    public void setTextSize(int textSize){
        if (textSize <= 0) return;
        tag.setTextSize(ScreenUtils.sp2px(textSize,context));
    }

    public void setTextColor(int res){
        try{
            tag.setTextColor(context.getResources().getColor(res));
        }catch (Exception e){
        }
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, tag.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
