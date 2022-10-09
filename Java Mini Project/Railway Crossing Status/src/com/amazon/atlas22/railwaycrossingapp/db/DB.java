package com.amazon.atlas22.railwaycrossingapp.db;

import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.util.LinkedHashMap;

public class DB {

    private LinkedHashMap<String, User> users = new LinkedHashMap<String, User>();

    private static DB db;
    private DB(){

    }

    public static DB getInstance(){
        if(db==null){
            db = new DB();
        }
        return db;
    }



}
