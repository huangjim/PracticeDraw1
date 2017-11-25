package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice2DrawCircleView extends View {


    public Paint mPaint;

    public Practice2DrawCircleView(Context context) {
        super(context);
        mPaint = new Paint();
        LogUtil("first");
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        LogUtil("second");
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        LogUtil("third");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLACK);
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawCircle(100, 100, 100, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(350, 100, 100, mPaint);
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(100, 350, 100, mPaint);
        mPaint.setStrokeWidth(20);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(350, 350, 100, mPaint);
    }
    private void LogUtil(String tag){
        Log.i("Practice2DrawCircleView", "LogUtil: "+tag);
    }
}
