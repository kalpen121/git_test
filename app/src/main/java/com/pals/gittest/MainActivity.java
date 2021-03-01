package com.pals.gittest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private AppCompatImageView img_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        img_test = findViewById(R.id.img_test);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Glide.with(MainActivity.this)
                .load("https://api.androidhive.info/images/sample.jpg")
                .into(img_test);
    }
}