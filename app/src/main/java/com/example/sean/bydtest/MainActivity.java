package com.example.sean.bydtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* appName = (TextView) findViewById(R.id.appName);
        String name = getIntent().getStringExtra("appName");
        appName.setText(name);  //更改显示界面为app名字*/
    }
}
