package br.com.dgimenes.materialcardsandtiles;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SixteenNineImageView extends ImageView {

    public SixteenNineImageView(Context context) {
        super(context);
    }

    public SixteenNineImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SixteenNineImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int height = getMeasuredWidth() / 16 * 9;
        setMeasuredDimension(getMeasuredWidth(), height);
    }
}