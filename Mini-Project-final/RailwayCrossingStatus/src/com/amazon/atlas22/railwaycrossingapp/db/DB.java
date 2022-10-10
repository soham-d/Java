package com.amazon.atlas22.railwaycrossingapp.db;

import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class DB implements DAO{

    LinkedHashMap<String, User> users = new LinkedHashMap<String, User>();
    LinkedHashMap<String, RailwayCrossing> crossings = new LinkedHashMap<String, RailwayCrossing>();
    private static DB db;

    private DB(){
        populateAdminUsers(); // To create admin users

    }

    public static DB getInstance(){
        if(db == null){
            db = new DB();
        }
        return db;
    }

    void populateAdminUsers(){
        User user1 = new User("George", "George@gov.in", "george@123",2);
        User user2 = new User("Hary", "Harry@gov.in", "harry@123",2);

        set(user1);
        set(user2);

    }

    public boolean set(Object object){
        // This function performs both insert and update operation on user record.
        if(object instanceof User){
            User user = (User) object;
            users.put(user.getEmail(), user);
            return true;
        }else{
            RailwayCrossing crossing = (RailwayCrossing) object;
            crossings.put(crossing.getPersonInCharge().getEmail(), crossing);
            return true;
        }

    }
    public boolean delete(Object object){
        if(object instanceof User){
            User user = (User) object;
            users.remove(user.getEmail());
            return true;
        }else{
            RailwayCrossing crossing = (RailwayCrossing) object;
            crossings.remove(crossing.getPersonInCharge().getEmail());
            return true;
        }

    }

    public Map<String, ?> retrieve(Object object) {
        if(object instanceof User){
            return users;
        }else{
            return crossings;
        }
    }

    @Override
    public Object retrieve(String key) {
        if(users.containsKey(key)){
            return users.get(key);
        }else if(crossings.containsKey(key)){
            return crossings.get(key);
        }else{
            return null;
        }
    }

    public int getUserCount(){
        return users.size();
    }

    public int getCrossingsCount(){
        return crossings.size();
    }

    public void exportData(){

        try{
            File file = new File(".\\users-data\\");
            if(!file.exists()){
                file.mkdir();
                System.out.println("Directory created by the name of: "+file.getName());
            }
            for(String key: users.keySet()){
                File userFile = new File(".\\users-data\\", key+".txt");
                FileOutputStream stream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
                objectOutputStream.writeObject(users.get(key));
                System.out.println("User "+key+" Exported...");

            }

            System.out.println("Export Finished Successfully...");

        } catch (Exception e){
            e.printStackTrace();

        }

    }

    public void importData(){

        try{

            File file = new File(".\\users-data\\");
            String[] files = file.list();

            for(String fileName: files){
                File userFile = new File(".\\users-data\\", fileName);
                FileInputStream stream = new FileInputStream(userFile);
                ObjectInputStream objectInputStream = new ObjectInputStream(stream);

                User user = (User) objectInputStream.readObject();

                users.put(user.getEmail(), user);
            }

            System.out.println("Import Finished Successfully...");

        } catch (Exception e){
            e.printStackTrace();

        }

    }
}
