package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class ItemActivity extends AppCompatActivity {

    private MaterialCardView parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        parent = findViewById(R.id.parent);
        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.setChecked(!parent.isChecked());
            }
        });

//TODO: change checkBox color, now it's green and ugly

    }
}