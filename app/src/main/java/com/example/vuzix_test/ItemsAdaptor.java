package com.example.vuzix_test;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemsAdaptor extends RecyclerView.Adapter<ItemsAdaptor.ViewHolder> {

    private static final String TAG = "ItemsAdapter";
    private ArrayList<Item> items = new ArrayList<>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    //log indicate the method has been called
        Log.d(TAG, "onBindViewHolder: called");
        holder.itemName.setText(items.get(position).getName());
        holder.itemDesc.setText(items.get(position).getDescription());
        holder.checkBox.setChecked(false);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private TextView itemName, itemDesc;
        private CheckBox checkBox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        parent = itemView.findViewById(R.id.parent);
        itemName = itemView.findViewById(R.id.itemName);
        itemDesc = itemView.findViewById(R.id.itemDesc);
        checkBox = itemView.findViewById(R.id.checkBox);

        }





    }
}
