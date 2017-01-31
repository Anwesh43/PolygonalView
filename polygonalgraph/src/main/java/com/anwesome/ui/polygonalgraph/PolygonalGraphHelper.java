package com.anwesome.ui.polygonalgraph;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anweshmishra on 31/01/17.
 */
public class PolygonalGraphHelper {
    public static void addPolygonalGraph(Activity activity, View.OnClickListener onClickListener,int n) {
        DisplayManager displayManager = (DisplayManager) activity.getSystemService(Context.DISPLAY_SERVICE);
        Display display = displayManager.getDisplay(0);
        int w = 300,h = 300,r=h/3;
        if(display!=null) {
            Point size = new Point();
            display.getRealSize(size);
            w = size.x;
            h = size.y;
            r = h/3;
            if(w>h) {
                r = w/3;
            }
        }
        PolygonalGraph polygonalGraph = new PolygonalGraph(activity,n);
        polygonalGraph.setOnClickListener(onClickListener);
        activity.addContentView(polygonalGraph,new ViewGroup.LayoutParams(r,r));
    }
    public static void addPolygonalGraph(Activity activity, View.OnClickListener onClickListener,int n, int x, int y) {
        DisplayManager displayManager = (DisplayManager) activity.getSystemService(Context.DISPLAY_SERVICE);
        Display display = displayManager.getDisplay(0);
        int w = 300,h = 300,r=h/3;
        if(display!=null) {
            Point size = new Point();
            display.getRealSize(size);
            w = size.x;
            h = size.y;
            r = h/3;
            if(w>h) {
                r = w/3;
            }
        }
        PolygonalGraph polygonalGraph = new PolygonalGraph(activity,n);
        polygonalGraph.setOnClickListener(onClickListener);
        polygonalGraph.setX(x);
        polygonalGraph.setY(y);
        activity.addContentView(polygonalGraph,new ViewGroup.LayoutParams(r,r));
    }
 }
