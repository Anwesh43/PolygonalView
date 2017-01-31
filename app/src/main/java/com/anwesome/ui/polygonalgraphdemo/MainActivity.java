package com.anwesome.ui.polygonalgraphdemo;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.anwesome.ui.polygonalgraph.PolygonalGraph;
import com.anwesome.ui.polygonalgraph.PolygonalGraphHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        PolygonalGraphHelper.addPolygonalGraph(this, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Test toast",Toast.LENGTH_SHORT).show();
            }
        },5);
        PolygonalGraphHelper.addPolygonalGraph(this, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Test toast",Toast.LENGTH_SHORT).show();
            }
        }, 6, 300, 500);
    }
}
