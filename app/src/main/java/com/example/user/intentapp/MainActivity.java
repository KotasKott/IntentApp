package com.example.user.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOnlyOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOnlyOne = (Button)findViewById(R.id.btnOnlyOne);


        btnOnlyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    startActivityForResult(intent, 127);
                }

            });
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






