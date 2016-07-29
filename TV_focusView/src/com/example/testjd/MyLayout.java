package com.example.testjd;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * 
 * 自定义布局
 * 
 */
public class MyLayout extends LinearLayout
{
    private BaseAcitivity baseActivity;
    private MainUpView flyBorder; // 焦点框

    public MyLayout(Context context)
    {
        super(context);
        initView(context);
    }

    public MyLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        initView(context);
    }

    public MyLayout(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        initView(context);
    }

    private void initView(Context context)
    {
        if (context instanceof BaseAcitivity)
        {
            baseActivity = (BaseAcitivity) context;
            flyBorder = baseActivity.getFlyBorder();
        }

        setFocusable(true);
        setClickable(true);
        setFocusableInTouchMode(true);
    }

    @Override
    public void onHoverChanged(boolean hovered)
    {
        if (hovered)
        {
            this.requestFocus();
        }
        super.onHoverChanged(hovered);
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction,
            Rect previouslyFocusedRect)
    {
        if (gainFocus && flyBorder != null)
        {
            flyBorder.setFocusView(this, 1f); //view获取到焦点时，将焦点框移动到此处
            this.bringToFront();
        }
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

}
