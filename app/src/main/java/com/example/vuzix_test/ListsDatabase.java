package com.example.vuzix_test;

import java.util.ArrayList;

public class ListsDatabase {

    private static ListsDatabase instance;
    private static ArrayList<List> finished;
    private static ArrayList<List>  upComing;
    private static ArrayList<List> all;

    //constructor needs to be private to ensure instance can only be created inside the class
    private ListsDatabase() {
        if (null == all){
            all = new ArrayList<>();
            initData();
        }
        if (null == finished){
            finished = new ArrayList<>();
        }
        if (null == upComing){
            upComing = new ArrayList<>();
        }



    }
    private void initData(){
    //List(String name, String description, int itemNum, int listId, boolean isFinished)

        all.add(new List("magic cookies recipe O(∩_∩)O", "legal happiness", 5,1, false));
        all.add(new List("dinner shopping list", "I'm sorry that I'm not vegan", 7,2,false));
        all.add(new List("python data analysis homework","it's toooo much and I just wanna sleep. Managed to finish them all somehow", 4,3, false));
        all.add(new List("movie nights", "my friends' wish list, not mine",6,4,false));
        System.out.println("size of the list: " + all.size());
    }



// getter for the instance
    public static synchronized ListsDatabase getInstance() {
        if (null != instance){ // initiate database
            instance = new ListsDatabase();
        }
        return instance;
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



