package com.amazon.atlas22.creational;

class Connection{

    static Connection connection = new Connection();
    private Connection(){
        System.out.println("com.amazon.atlas22.creational.Connection created to Data base "+hashCode());
    }

    static Connection getConnection(){
        return connection;
    }

    static void welcome(){
        System.out.println("Welcome to connection class!");
    }
}

public class SingletonEager {

    public static void main(String[] args) {
//        com.amazon.atlas22.creational.Connection connection1 = new com.amazon.atlas22.creational.Connection();
//        com.amazon.atlas22.creational.Connection connection2 = new com.amazon.atlas22.creational.Connection();
//        com.amazon.atlas22.creational.Connection connection3 = new com.amazon.atlas22.creational.Connection();
//
//        System.out.println("Connection1 hashCode: "+connection1.hashCode());
//        System.out.println("Connection2 hashCode: "+connection2.hashCode());
//        System.out.println("Connection3 hashCode: "+connection3.hashCode());


//
        //Refernce variables
        Connection connection1;
        Connection connection2;
        Connection connection3;

        connection1 = Connection.getConnection();
        connection2 = Connection.getConnection();
        connection3 = Connection.getConnection();

        System.out.println("Connection1 hashCode: "+connection1.hashCode());
        System.out.println("Connection2 hashCode: "+connection2.hashCode());
        System.out.println("Connection3 hashCode: "+connection3.hashCode());

        Connection.welcome();




    }
}
