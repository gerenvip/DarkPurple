package com.ocwvar.darkpurple.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by 区成伟
 * Package: com.ocwvar.darkpurple.Units
 * Data: 2016/8/7 15:08
 * Project: DarkPurple
 */
public class SquareHightImageView extends AppCompatImageView {

    public SquareHightImageView(Context context) {
        super(context);
    }

    public SquareHightImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareHightImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(heightMeasureSpec, heightMeasureSpec);
    }


}
