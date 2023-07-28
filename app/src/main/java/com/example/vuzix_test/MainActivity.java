package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView menuRecView;
    private MenuAdapter adapter;
    private ArrayList<String> menuTable = new ArrayList<>();


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuTable.add("All Lists");
        menuTable.add("Up Coming");
        menuTable.add("Finished");


        menuRecView = findViewById(R.id.menuRecView);

//        ListsDatabase database = new ListsDatabase(this);
//        database.getInstance();



    adapter = new MenuAdapter(this);
    menuRecView.setAdapter(adapter);
    menuRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    adapter.setMenuTable(menuTable);



    }




}