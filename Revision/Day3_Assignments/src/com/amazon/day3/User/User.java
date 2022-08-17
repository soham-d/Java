package com.amazon.day3.User;

public class User {

    String uName;
    String uEmailID;
    String uPhoneNum;
    String uAddress;
    String uGender;

    public User(String uName, String uEmailID, String uPhoneNum, String uAddress, String uGender) {
        this.uName = uName;
        this.uEmailID = uEmailID;
        this.uPhoneNum = uPhoneNum;
        this.uAddress = uAddress;
        this.uGender = uGender;
    }

    public User() {
        uName = "Default";
        uEmailID = "Default";
        uPhoneNum = "Default";
        uAddress = "Default";
        uGender = "Default";
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuEmailID() {
        return uEmailID;
    }

    public void setuEmailID(String uEmailID) {
        this.uEmailID = uEmailID;
    }

    public String getuPhoneNum() {
        return uPhoneNum;
    }

    public void setuPhoneNum(String uPhoneNum) {
        this.uPhoneNum = uPhoneNum;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender;
    }
}
