package com.example.vuzix_test;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> menuTable = new ArrayList<>();

    public MenuAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {



        holder.txtAction.setText(menuTable.get(position));

        if (menuTable.get(position).equals("All Lists")) {
            holder.menuParent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(context, AllListsActivity.class);
                context.startActivity(intent);
                }
            });
        }

//        holder.menuParent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, AllListsActivity.class);
//                context.startActivity(intent);
//        }
//
//        });

    }




   @Override
    public int getItemCount() {
        return menuTable.size();
    }


    public void setMenuTable(ArrayList<String> menuTable) {
        this.menuTable = menuTable;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView menuParent;
        private TextView txtAction;
     public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtAction = itemView.findViewById(R.id.txtAction);
            menuParent = itemView.findViewById(R.id.menuParent);

        }
    }
}
