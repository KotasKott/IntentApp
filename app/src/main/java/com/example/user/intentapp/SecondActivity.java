package com.example.user.intentapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by user on 18.05.17.
 */

public class SecondActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra(MainActivity.KEY));
        textView.setTextColor(getIntent().getIntExtra(MainActivity.KEYCOLOR, 0));
    }


}