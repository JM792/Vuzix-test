package com.example.vuzix_test;

import java.util.ArrayList;

public class Datenbank {
    private static ArrayList<Datenbank> database;
    private static Datenbank instance;
    private Datenbank() {
    }

    public static synchronized Datenbank getInstance() {
        if (null != instance){ // initiate database
            instance = new Datenbank();
        }
        return instance;
    }
}
