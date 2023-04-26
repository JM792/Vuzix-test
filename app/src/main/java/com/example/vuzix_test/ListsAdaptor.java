package com.example.vuzix_test;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListsAdaptor extends RecyclerView.Adapter<ListsAdaptor.ViewHolder>{

    private static final String TAG = "ListsAdapter";
    private ArrayList<List> allLists = new ArrayList<>();

    @NonNull
    @Override
    public ListsAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_single_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListsAdaptor.ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.itemNum.setText(String.valueOf(allLists.get(position).getItemNum()));
        holder.listName.setText(allLists.get(position).getName());
        holder.desc.setText(allLists.get(position).getDescription());


    }


    @Override
    public int getItemCount() {
        return 0;
    }


    public void setAllLists(ArrayList<List> allLists) {
        this.allLists = allLists;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView itemNum, listName, desc;
        private int id;
        private CardView parent;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        parent = itemView.findViewById(R.id.parent);

        itemNum = itemView.findViewById(R.id.itemNum);
        listName = itemView.findViewById(R.id.listName);
        desc = itemView.findViewById(R.id.desc);


        }





    }



}
