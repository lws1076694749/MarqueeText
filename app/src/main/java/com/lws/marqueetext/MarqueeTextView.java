package com.lws.marqueetext;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Wenshan.Lu on 2016/6/15.
 */
public class MarqueeTextView extends TextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //始终获得焦点
    @Override
    public boolean isFocused() {
        return true;
    }
}
