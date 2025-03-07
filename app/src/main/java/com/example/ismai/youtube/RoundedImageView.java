package com.example.ismai.youtube;

/**
 * Created by ismai on 3/3/2025.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;


public class RoundedImageView extends AppCompatImageView {
    private float cornerRadius = 20f; // Default value

    public RoundedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RoundedImageView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RoundedImageView);
            cornerRadius = a.getDimension(R.styleable.RoundedImageView_cornerRadius, 20f);
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        BitmapDrawable drawable = (BitmapDrawable) getDrawable();
        if (drawable == null) return;

        Bitmap bitmap = drawable.getBitmap();
        Bitmap roundedBitmap = getRoundedCroppedBitmap(bitmap, getWidth(), getHeight(), cornerRadius);
        canvas.drawBitmap(roundedBitmap, 0, 0, null);
    }

    public static Bitmap getRoundedCroppedBitmap(Bitmap bitmap, int width, int height, float radius) {
        Bitmap output = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));

        RectF rectF = new RectF(0, 0, width, height);
        canvas.drawRoundRect(rectF, radius, radius, paint);

        return output;
    }

    // Setter method to change radius programmatically
    public void setCornerRadius(float radius) {
        this.cornerRadius = radius;
        invalidate(); // Redraw the view
    }
}
