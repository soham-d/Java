package com.amazon.atlas22.creational;

import java.util.LinkedHashMap;

class Customer{
    String name;
    String phone;
    String email;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class MySQLDB {

    private  static  MySQLDB dbInstance = new MySQLDB();
    private LinkedHashMap<String, Customer> customerMap;

    private  MySQLDB(){
        customerMap = new LinkedHashMap<String, Customer>();

        Customer c1 = new Customer("John","784874", "john1@ex.com");
        Customer c2 = new Customer("John2","784874", "john2@ex.com");
        Customer c3 = new Customer("John3","784874", "john3@ex.com");
        Customer c4 = new Customer("John4","784874", "john4@ex.com");
        Customer c5 = new Customer("John5","784874", "john5@ex.com");

        customerMap.put(c1.email, c1);
        customerMap.put(c2.email, c2);
        customerMap.put(c3.email, c3);
        customerMap.put(c4.email, c4);
        customerMap.put(c5.email, c5);

    }


    //When the class is loaded - executes automatically



}
