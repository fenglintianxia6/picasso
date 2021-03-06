package com.example.picasso;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.squareup.picasso.Picasso;

public class SampleGridViewActivity extends PicassoSampleActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sample_gridview_activity);
    Picasso.with(this).setLoggingEnabled(true);
    System.out.println("onCreate");
    Log.e("TAG", "onCreate: ");
    GridView gv = (GridView) findViewById(R.id.grid_view);
    gv.setAdapter(new SampleGridViewAdapter(this));
    gv.setOnScrollListener(new SampleScrollListener(this));
  }
}
