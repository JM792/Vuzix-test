package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class AllListsActivity extends AppCompatActivity {

    private ImageView swipeUp;
    private TextView txtSwipeUp;
    private RecyclerView listRecView;
    private ListsAdaptor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_lists);


        swipeUp = findViewById(R.id.swipeUp);
        txtSwipeUp = findViewById(R.id.txtSwipeUp);

        listRecView = findViewById(R.id.listRecView);

        Animation blink = new AlphaAnimation(0.0f, 1.0f);
        blink.setDuration(1500);
        blink.setStartOffset(100);
        blink.setRepeatMode(Animation.REVERSE);
        blink.setRepeatCount(Animation.INFINITE);
        txtSwipeUp.startAnimation(blink);
        swipeUp.startAnimation(blink);


        adapter = new ListsAdaptor();
        listRecView.setAdapter(adapter);
        listRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapter.setAllLists(ListsDatabase.getInstance());

    }
}