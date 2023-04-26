package com.example.vuzix_test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {


    private ArrayList<String> menuTable = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        menuTable.add("All Lists");
        menuTable.add("Up Coming");
        menuTable.add("Finished");


        holder.txtAction.setText(menuTable.get(position));
    }

    @Override
    public int getItemCount() {
        return menuTable.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtAction;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtAction = itemView.findViewById(R.id.txtAction);



        }
    }
}
