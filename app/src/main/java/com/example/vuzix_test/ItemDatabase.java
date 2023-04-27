package com.example.vuzix_test;

import java.util.ArrayList;

public class ItemDatabase {
    private static ItemDatabase instance;
    private static ArrayList<Item> all;
    private static ArrayList<Item> finished;


    public ItemDatabase() {
        if(null == all){
            all = new ArrayList<>();
            initData();
            if(null == finished){
                finished = new ArrayList<>();
            }
        }

    }

    private void initData(){
        //Item(int itemId, int listId, String name, String description, boolean isFinished)

        all.add(new Item(1,1,"Hanf","it is what it is", false));
        all.add(new Item(2,1,"flour","",false));
        all.add(new Item(3,4,"K-Pax","",false));
        all.add(new Item(4,4,"the thirteenth floor","sci-fi",false));
        all.add(new Item(5,2,"chicken","orange chicken",false));



    }


    public static ItemDatabase getInstance() {
        if (null == instance){
            instance = new ItemDatabase();
        }
        return instance;
    }

    public static ArrayList<Item> getAll() {
        return all;
    }

    public static ArrayList<Item> getFinished() {
        return finished;
    }
}
