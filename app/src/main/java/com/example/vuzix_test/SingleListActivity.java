package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class SingleListActivity extends AppCompatActivity {

    private TextView listName, itemNum, percentage, desc;
    private LinearProgressIndicator barCompleted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_list);

        listName = findViewById(R.id.listName);
        itemNum = findViewById(R.id.itemNum);
        percentage = findViewById(R.id.percentage);
        desc = findViewById(R.id.desc);
        barCompleted = findViewById(R.id.barCompleted);



    }
}