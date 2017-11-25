package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private  Path path=new Path();
    private Paint paint = new Paint();
    private RectF mRectF=new RectF(200, 200, 400, 400);
    private RectF mRectF2=new RectF(400, 200, 600, 400);

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(mRectF, -225, 225);
        path.arcTo(mRectF2, -180, 225, false);
        path.lineTo(400, 542);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成
    }
}
