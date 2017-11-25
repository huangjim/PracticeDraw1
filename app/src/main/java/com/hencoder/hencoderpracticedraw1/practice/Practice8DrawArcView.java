package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private RectF mRectF2;
    private Paint mPaint;
    private RectF mRectF1;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mRectF1 = new RectF(100, 100, 400, 300);
        mRectF2 = new RectF(100, 150, 400, 300);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLACK);
        canvas.drawArc(mRectF1,-120,110,true,mPaint);
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.drawArc(mRectF1,20,140,false,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        canvas.drawArc(mRectF1,180,50,false,mPaint);
    }
}
