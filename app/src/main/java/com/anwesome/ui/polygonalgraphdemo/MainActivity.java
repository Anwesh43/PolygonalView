package com.anwesome.ui.polygonalgraphdemo;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.anwesome.ui.polygonalgraph.PolygonalGraph;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        PolygonalGraph polygonalGraph = new PolygonalGraph(this,4);
        addContentView(polygonalGraph,new ViewGroup.LayoutParams(300,300));
    }
}
