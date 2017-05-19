package com.example.user.intentapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOnlyOne;
    ConstraintLayout constraintLayout;
    public static final String KEY = "KEY";

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("BACKGROUND_COLOR", Color.BLUE);

        super.onSaveInstanceState(savedInstanceState);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOnlyOne = (Button)findViewById(R.id.btnOnlyOne);
        constraintLayout = (ConstraintLayout)findViewById(R.id.layoutConstrain);


        btnOnlyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*     constraintLayout.setBackgroundColor(Color.BLUE);*/

               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               intent.setAction("android.intent.action.SEND");
               intent.putExtra(KEY, "test string");
               startActivity(intent);
                }

            });

        if (savedInstanceState != null) {
            constraintLayout.setBackgroundColor(savedInstanceState.getInt("BACKGROUND_COLOR"));
        }
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==127) {
            if (resultCode==RESULT_OK) {
                Toast.makeText(this, "Activity is OK", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onStart() {
        Log.d("Life", "OnStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("Life", "OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Life", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("Life", "onPause");
        super.onPause();
    }


}






