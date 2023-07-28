package com.example.vuzix_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.CheckBox;

public class SingleItemActivity extends AppCompatActivity {

    private CardView parent;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        parent = findViewById(R.id.parent);
        checkBox = findViewById(R.id.checkBox);

        //TODO: do the box check inside the adapter or inside activity
//        parent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                parent.setChecked(!parent.isChecked());
//            }
//        });




    }
}