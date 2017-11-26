package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Path mPath=new Path();
    private Paint mPaint=new Paint();
    public RectF mRect2 = new RectF(70, 360, 120, 400);
    public RectF mRect3 = new RectF(140, 300, 190, 400);
    public RectF mRect4 = new RectF(210, 330, 260, 400);
    public RectF mRect5 = new RectF(280, 390, 330, 400);
    public RectF mRect6 = new RectF(350, 250, 400, 400);
    public RectF mRect7 = new RectF(420, 200, 470, 400);
    public RectF mRect8 = new RectF(490, 150, 540, 400);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        canvas.drawLine(50,50,50,400,mPaint);
        canvas.drawLine(50,400,600,400,mPaint);
        mPaint.setColor(Color.GREEN);
//        canvas.drawRect(mRect1,mPaint);
        canvas.drawRect(mRect2,mPaint);
        canvas.drawRect(mRect3,mPaint);
        canvas.drawRect(mRect4,mPaint);
        canvas.drawRect(mRect5,mPaint);
        canvas.drawRect(mRect6,mPaint);
        canvas.drawRect(mRect7,mPaint);
        canvas.drawRect(mRect8,mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawText("Froyo",75,415,mPaint);
        canvas.drawText("GB",150,415,mPaint);
        canvas.drawText("ICS",215,415,mPaint);
        canvas.drawText("JB",290,415,mPaint);
        canvas.drawText("KitKat",365,415,mPaint);
        canvas.drawText("L",440,415,mPaint);
        canvas.drawText("M",510,415,mPaint);
        canvas.drawLine(95,360,165,300,mPaint);
        canvas.drawLine(165,300,235,330,mPaint);
        canvas.drawLine(235,330,305,390,mPaint);
        canvas.drawLine(305,390,375,250,mPaint);
        canvas.drawLine(375,250,445,200,mPaint);
        canvas.drawLine(445,200,515,150,mPaint);
    }
}
