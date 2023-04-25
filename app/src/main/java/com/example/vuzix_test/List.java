package com.example.vuzix_test;

import java.util.Date;

public class List {

    private String name;
    private String description;
    private Date deadline;

    private int itemNum;
    private int listId;
    private boolean isFinished;

    public List(String name, String description, int itemNum, int listId, boolean isFinished) {
        this.name = name;
        this.description = description;
        this.itemNum = itemNum;
        this.listId = listId;
        this.isFinished = isFinished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
