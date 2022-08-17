package com.amazon.model;

public class User {
    String name;
    protected String phone;
    protected String email;
    protected String address;


    User(){
        name = "user1";
        phone = "9809099911";
        email = "user@example.com";
        address = "example Address";
    }

    public User(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
