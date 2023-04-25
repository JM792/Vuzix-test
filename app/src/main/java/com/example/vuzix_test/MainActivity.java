package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtSwipeUp;
    private ImageView swipeUp;
    private RecyclerView listRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Animation blink = new AlphaAnimation(0.0f, 1.0f);
        blink.setDuration(1500);
        blink.setStartOffset(100);
        blink.setRepeatMode(Animation.REVERSE);
        blink.setRepeatCount(Animation.INFINITE);




        txtSwipeUp = findViewById(R.id.txtSwipeUp);
        swipeUp = findViewById(R.id.swipeUp);

        txtSwipeUp.startAnimation(blink);
        swipeUp.startAnimation(blink);




    }




}