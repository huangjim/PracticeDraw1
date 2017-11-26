package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.bean.PieChatBean;

import java.util.ArrayList;
import java.util.List;

public class Practice11PieChartView extends View {

    private float startAngle = 0;
    private List<PieChatBean> mPieChatBeans = new ArrayList<>();
    public Float[] mIntegerList;
    private float total;
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    private void init() {
        mPaint.setAntiAlias(true);

        mPieChatBeans.add(new PieChatBean(16.0f, Color.parseColor("#800080"), "Gingerbread"));
        mPieChatBeans.add(new PieChatBean(3.0f, Color.GRAY, "Ice Cream Sandwich"));
        mPieChatBeans.add(new PieChatBean(34.0f, Color.YELLOW, "Marshmallow"));
        mPieChatBeans.add(new PieChatBean(29.0f, Color.RED, "Lollipop"));
        mPieChatBeans.add(new PieChatBean(2.0f, Color.parseColor("#008000"), "Jelly Bean"));
        mPieChatBeans.add(new PieChatBean(16.0f, Color.BLUE, "KitKat"));

        mIntegerList = new Float[mPieChatBeans.size()];
        //find largest persent
        for (int i = 0; i < mPieChatBeans.size(); i++) {
            mIntegerList[i] = mPieChatBeans.get(i).getPersent();
            total = mPieChatBeans.get(i).getPersent() + total;
        }
        for (int i = 0; i < mIntegerList.length; i++) {
            float temp;
            if (i <= mIntegerList.length - 2) {
                if (mIntegerList[i] > mIntegerList[i + 1]) {
                    temp = mIntegerList[i];
                    mIntegerList[i] = mIntegerList[i + 1];
                    mIntegerList[i + 1] = temp;
                }
            }
        }

    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        float radius = canvas.getHeight() * 0.35f;
        int halfWidth = canvas.getWidth() / 2;
        int halfHeight = canvas.getHeight() / 2;
        RectF mRectF = new RectF(halfWidth - radius, halfHeight - radius, halfWidth + radius, halfHeight + radius);
        Log.i("ysan", "半径 = " + radius);
        Log.i("ysan", "圆心x = " + halfWidth + ",   圆心y = " + halfHeight);
        float linearStartX;
        float linearStartY;
        float lineEndX;
        float lineEndY;
        for (int i = 0; i < mPieChatBeans.size(); i++) {
            PieChatBean pieChatBean = mPieChatBeans.get(i);
            float sweepAngle = 360 * (pieChatBean.getPersent() / total);
            float halfAngle = sweepAngle * 0.5f + startAngle;
            //已知角度，求圆边上的坐标
            linearStartX = radius * (float) Math.cos(halfAngle / 180 * Math.PI) + halfWidth;
            linearStartY = radius * (float) Math.sin(halfAngle / 180 * Math.PI) + halfHeight;
            //
            lineEndX = (radius + 50) * (float) Math.cos(halfAngle / 180 * Math.PI) + halfWidth;
            lineEndY = (radius + 50) * (float) Math.sin(halfAngle / 180 * Math.PI) + halfHeight;

            Log.i("ysan", "startX = " + linearStartX + "startY = " + linearStartY);
            if (pieChatBean.getPersent() == mIntegerList[mIntegerList.length - 1]) {
                canvas.save();
                canvas.translate((linearStartX - halfWidth) * 0.1f, (linearStartY - halfHeight) * 0.1f);
            }
            mPaint.setColor(pieChatBean.getColorRes());
            canvas.drawArc(mRectF, startAngle, sweepAngle - 2, true, mPaint);
            mPaint.setColor(Color.WHITE);
            canvas.drawLine(linearStartX, linearStartY, lineEndX, lineEndY, mPaint);

            if (halfAngle > 90 && halfAngle < 270) {
                canvas.drawLine(lineEndX, lineEndY, lineEndX - 50, lineEndY, mPaint);
                canvas.drawText(pieChatBean.getName(), lineEndX - 60, lineEndY, mPaint);
                mPaint.setTextAlign(Paint.Align.RIGHT);
            } else {
                canvas.drawLine(lineEndX, lineEndY, lineEndX + 50, lineEndY, mPaint);
                canvas.drawText(pieChatBean.getName(), lineEndX + 60, lineEndY, mPaint);
                mPaint.setTextAlign(Paint.Align.LEFT);
            }


            if (pieChatBean.getPersent() == mIntegerList[mIntegerList.length - 1]) {
                canvas.restore();
            }
            startAngle = sweepAngle + startAngle;
        }

    }

}
