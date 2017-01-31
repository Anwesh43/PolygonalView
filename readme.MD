#PolygonalView

##An Android Library to add polygonal shaped view in your activity

##Usage

###Creating PolygonalGraph

```
    PolygonalGraph polygonalGraph = new PolygonalGraph(context,n);
    context - application context
    n - number of sides
```
##Adding the poygonalgraph in activity with the width and height
```
    addContentView(polygonalGraph,new LayoutParams(w,h));
```

###Creating and adding PolygonalGraph with PolygonalGraphHelper
```
    PolygonalGraphHelper.addPolygonalGraph(this, new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"Test toast",Toast.LENGTH_SHORT).show();
        }
    },5);
```
