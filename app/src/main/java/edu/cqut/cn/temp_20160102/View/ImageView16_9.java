package edu.cqut.cn.temp_20160102.View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by dun on 2015/11/1.
 */
public class ImageView16_9 extends ImageView{
    public ImageView16_9(Context context) {
        super(context);
    }

    public ImageView16_9(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageView16_9(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = Math.round((width * 9)/16);
        setMeasuredDimension(width,height);
    }

}
