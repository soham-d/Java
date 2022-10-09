package com.amazon.atlas22.creational;

class DB{

    static DB db;
    private DB(){
        System.out.println("DB Object constructed");
    }

    static DB getInstance(){

        if(db!=null)
            return db;
        else{
            db = new DB();
        }
        return db;
    }

    static void welcome(){
        System.out.println("Welcome to MySQL DB");
    }

}

public class SingletonLazy {

    public static void main(String[] args) {
        DB.welcome();

        DB db1 = DB.getInstance();
        System.out.println("db1 hashcode is: "+db1.hashCode());
    }
}
