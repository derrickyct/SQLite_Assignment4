package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv;
    private DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv = findViewById(R.id.user_detail_list);

        String buffer = getIntent().getStringExtra("user_detail");

        tv.setText(buffer);
        tv.setMovementMethod(new ScrollingMovementMethod());

    }
}
