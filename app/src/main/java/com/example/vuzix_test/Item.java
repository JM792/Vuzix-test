package com.example.vuzix_test;

import java.util.Date;

public class Item {

    private int itemId;
    private String name;
    private String description;
    private Date deadline;
    private boolean isFinished;

    public Item(int itemId, String name, String description, boolean isFinished) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.isFinished = isFinished;
    }


    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
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
