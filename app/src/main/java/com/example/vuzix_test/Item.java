package com.example.vuzix_test;

import java.util.Date;

public class Item {

    private int itemId;



    private int ListId;
    private String name;
    private String description;

    private boolean isFinished;

    public Item(int itemId, int listId, String name, String description) {
        this.itemId = itemId;
        ListId = listId;
        this.name = name;
        this.description = description;
        isFinished = false;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", ListId=" + ListId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
