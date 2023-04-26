package com.example.vuzix_test;

import java.util.ArrayList;

public class ListsDatabase {
    private static ArrayList<ListsDatabase> database;
    private static ListsDatabase instance;
    private static ArrayList<List> finished;
    private static ArrayList<List>  upComing;
    private static ArrayList<List> all;

    private ListsDatabase() {
        if (null != all){
            all = new ArrayList<>();
            initData();
        }
        if (null != finished){
            finished = new ArrayList<>();
        }
        if (null != upComing){
            upComing = new ArrayList<>();
        }



    }
    private void initData(){
    //List(String name, String description, int itemNum, int listId, boolean isFinished)

        all.add(new List("magic cookies recipe O(∩_∩)O", "send you to the high way, don't call police, it's legal anyway", 5,1, false));
        all.add(new List("dinner shopping list", "I'm sorry that I'm not vegan", 7,2,false));
        all.add(new List("python data analysis homework","it's toooo much and I just wanna sleep", 4,3, false));
        all.add(new List("movie nights", "my friends' wish list, not mine",6,4,false));

    }




    public static synchronized ListsDatabase getInstance() {
        if (null != instance){ // initiate database
            instance = new ListsDatabase();
        }
        return instance;
    }

    public static ArrayList<ListsDatabase> getDatabase() {
        return database;
    }

    public static ArrayList<List> getFinished() {
        return finished;
    }

    public static ArrayList<List> getUpComing() {
        return upComing;
    }

    public static ArrayList<List> getAll() {
        return all;
    }
}



