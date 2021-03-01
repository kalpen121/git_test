package com.pals.gittest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.squareup.picasso.Picasso;

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
        Picasso.get().load("https://api.androidhive.info/images/sample.jpg")
                .into(img_test);
//        Glide.with(MainActivity.this)
//                .load("https://api.androidhive.info/images/sample.jpg")
//                .into(img_test);
    }
}