package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView text = new TextView(this);
        text.setText("Hello Yonas this is a live debug from my phone instead of using an emulator on android studio. This is eclipse btw");
        setContentView(text);
        //setContentView(R.layout.main);
    }
}