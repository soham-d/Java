package com.amazon.atlas22.railwaycrossingapp.controller;

import com.amazon.atlas22.railwaycrossingapp.db.DB;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.util.Map;

public class RailwayCrossingController {

    private static RailwayCrossingController controller;

    private RailwayCrossingController(){

    }

    public static RailwayCrossingController getInstance(){
        if(controller == null){
            controller = new RailwayCrossingController();
        }
        return controller;
    }

    //public int TOTAL_CROSSINGS = 0;

    private DB db = DB.getInstance();

    public boolean loginUser(User user){
        if(user.validate()){
            User retrievedUser = (User) db.retrieve(user.getEmail());
            if(retrievedUser != null && retrievedUser.getUserType()==2) //Additional check for user type
            {
                boolean result = retrievedUser.getEmail().equalsIgnoreCase(user.getEmail())
                        && retrievedUser.getPassword().equals(user.getPassword());
                user.setName(retrievedUser.getName());
                return result;

            }
        }

        return false;
    }

    public boolean addOrUpdateCrossing(RailwayCrossing crossing) throws ClassNotFoundException {
        return db.set(crossing)&&db.setDB(crossing);
    }

    public boolean deleteCrossing(RailwayCrossing crossing) throws ClassNotFoundException {
        return db.delete(crossing) && db.deleteDB(crossing);
    }

    public Map<String, ?> fetchCrossings(){
        return db.retrieve(new RailwayCrossing());
    }

    public int getCrossingsCount(){
        return db.getCrossingsCount();
    }

    public void exportData(){
        db.exportFromDB();
    }

    public void importData(){
        db.importData();
    }

}
