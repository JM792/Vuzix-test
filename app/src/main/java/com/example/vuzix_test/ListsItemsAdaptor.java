package com.example.vuzix_test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListsItemsAdaptor extends RecyclerView.Adapter<ListsItemsAdaptor.ViewHolder>{



    @NonNull
    @Override
    public ListsItemsAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate()
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListsItemsAdaptor.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView itemNum, listName;
        private int id;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        itemNum = itemView.findViewById(R.id.itemNum);
        listName = itemView.findViewById(R.id.listName);



        }





    }



}