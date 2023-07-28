package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class AllItemsActivity extends AppCompatActivity {
    public static final String LIST_ID = "listId";
    private RecyclerView itemRecView;
    private ItemsAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_items);
        itemRecView = findViewById(R.id.itemRecView);
        adaptor = new ItemsAdaptor();
        itemRecView.setAdapter(adaptor);

        itemRecView.setLayoutManager(new GridLayoutManager(this, 2));
        Intent intent = getIntent();
        if (null != intent){
            int ListId = intent.getIntExtra(LIST_ID, -1); //(name of variable, default value)
        }


    }
}