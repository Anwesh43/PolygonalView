package com.anwesome.ui.polygonalgraph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by anweshmishra on 31/01/17.
 */
public class PolygonalGraph extends View {
    private boolean shouldAnimate = false;
    private int n = 3;
    private float deg=0;
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public PolygonalGraph(Context context,int n) {
        super(context);
        this.n = Math.max(this.n,n);
    }
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.parseColor("#b71c1c"));
        Path path = new Path();
        int r = canvas.getWidth()/2;
        canvas.save();
        canvas.translate(canvas.getWidth()/2,canvas.getHeight()/2);
        canvas.rotate(deg);
        for(int i=0;i<n;i++) {
            float x = (float)(r*Math.cos(i*Math.PI/180)),y = (float)(r*Math.sin(i*Math.PI/180));
            if(i == 0) {
                path.moveTo(x,y);
            }
            else {
                path.lineTo(x,y);
            }
            canvas.drawCircle(x,y,r/4,paint);
        }
        canvas.drawPath(path,paint);
        canvas.restore();
        if(shouldAnimate) {
            try {
                deg+=30;
                if(deg == 360) {
                    deg = 0;
                    shouldAnimate = false;
                }
                Thread.sleep(30);
                invalidate();
            } catch (Exception ex) {

            }
        }
    }
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN && !shouldAnimate) {
            shouldAnimate = true;
            postInvalidate();
        }
        return true;
    }
}
