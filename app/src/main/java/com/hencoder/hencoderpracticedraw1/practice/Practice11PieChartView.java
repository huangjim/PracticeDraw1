package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private  RectF mRectF2;
    public Paint mPaint;
    public RectF mRectF;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mRectF = new RectF(100,100,400,400);
        mRectF2 = new RectF(90,90,390,390);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setAntiAlias(true);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(mRectF,-50,47,true,mPaint);
        mPaint.setColor(Color.parseColor("#800080"));
        canvas.drawArc(mRectF,0,7,true,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(mRectF,10,7,true,mPaint);
        mPaint.setColor(Color.parseColor("#008000"));
        canvas.drawArc(mRectF,20,47,true,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(mRectF,70,105,true,mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawArc(mRectF2,180,125,true,mPaint);
    }
}
