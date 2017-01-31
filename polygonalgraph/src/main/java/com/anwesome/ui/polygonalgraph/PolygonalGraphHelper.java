package com.anwesome.ui.polygonalgraph;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.ViewGroup;

/**
 * Created by anweshmishra on 31/01/17.
 */
public class PolygonalGraphHelper {
    public static void addPolygonalGraph(Activity activity,int n) {
        DisplayManager displayManager = (DisplayManager) activity.getSystemService(Context.DISPLAY_SERVICE);
        Display display = displayManager.getDisplay(0);
        int w = 300,h = 300;
        if(display!=null) {
            Point size = new Point();
            w = size.x/4;
            h = size.x/4;
        }
        PolygonalGraph polygonalGraph = new PolygonalGraph(activity,n);
        activity.addContentView(polygonalGraph,new ViewGroup.LayoutParams(w,h));
    }
 }
