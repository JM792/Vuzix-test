package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    private CardView menuParent;
    private TextView txtAction;


//    private ArrayList<String> menuTable = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//    menuTable.add("All Lists");
//    menuTable.add("Up Coming");
//    menuTable.add("Finished");


    menuParent = findViewById(R.id.menuParent);
    txtAction = findViewById(R.id.txtAction);


    }
}