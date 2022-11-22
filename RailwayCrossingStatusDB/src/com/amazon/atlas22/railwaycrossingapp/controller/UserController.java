package com.amazon.atlas22.railwaycrossingapp.controller;

import com.amazon.atlas22.railwaycrossingapp.db.DB;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.sql.*;

public class UserController {

    private static UserController controller;

    private UserController(){

    }

    public static UserController getInstance(){
        if(controller == null){
            controller = new UserController();
        }
        return controller;
    }

    DB db = DB.getInstance();

    public boolean registerUser(User user) throws ClassNotFoundException {

        //user.setUserType(1);
        if(user.validate()){
            return db.set(user) && db.setDB(user);
        }else{
            System.err.println("Email and Password should be non-empty");
            return false;
        }

    }

    public boolean loginUser(User user){

        try {
            // 1. Load the Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("1. Driver Loaded...");
            String url = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=railwayApp; user=java2;password=java; integratedSecurity=false;" +
                    "encrypt=true;trustServerCertificate=true";
            // 2. Create the Connection
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("2. Connection Created..");

            String sql = "SELECT * FROM users where user_email = '"+user.getEmail()+"'";

            Statement statement = connection.createStatement();

            // executeQuery -> works with Select Statement
            ResultSet set = statement.executeQuery(sql);

            String userEmail = "";
            String userPassword = "";


            while(set.next()) {
                userEmail = set.getString("user_name");
                userPassword = set.getString("password");

                //connection.close();
            }
            connection.close();

            if (userEmail == user.getEmail() && userPassword == user.getPassword()){
                return true;
            } else{
                return false;
            }

        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
            return false;
        }


//        if(user.validate()){
//            User retrievedUser = (User) db.retrieve(user.getEmail());
//            if(retrievedUser != null && retrievedUser.getUserType()==1) {
//
//                user.setName(retrievedUser.getName());
//
//                return retrievedUser.getEmail().equalsIgnoreCase(user.getEmail())
//                        && retrievedUser.getPassword().equals(user.getPassword());
//            }
//        }
//
//        return false;
    }

    public int getUsersCount(){
        return db.getUserCount();
    }

}
