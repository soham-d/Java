package com.amazon.atlas22.railwaycrossingapp.model;

public class User {

    String name;
    String email;
    String password;
    int userType; //0 = public user, 1= Admin user, 2= Crossing In-charge;

    public User(String name, String email, String password, int userType) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public User(){
    //Default Constructor
        this.name = "Default";
        this.email = "default@default.com";
        this.password = "password";
        this.userType=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
