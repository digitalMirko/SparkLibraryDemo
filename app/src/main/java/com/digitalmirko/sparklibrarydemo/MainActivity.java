package com.digitalmirko.sparklibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import io.github.tonnyl.spark.Spark;

public class MainActivity extends AppCompatActivity {

    Spark mSpark;
    RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        mSpark = new Spark.Builder()
            .setView(mainLayout)
            .setDuration(4000)
            .setAnimList(Spark.ANIM_GREEN_PURPLE)
            .build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mSpark.startAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mSpark.stopAnimation();
    }
}
