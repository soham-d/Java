package com.amazon.atlas22.railwaycrossingapp;

import com.amazon.atlas22.railwaycrossingapp.controller.RailwayCrossingController;
import com.amazon.atlas22.railwaycrossingapp.controller.UserController;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.util.Map;
import java.util.Scanner;

public class PublicApp {

    UserController controller;
    RailwayCrossingController railController;
    Scanner scanner;

    PublicApp(){
        controller = UserController.getInstance();
        railController = RailwayCrossingController.getInstance();
        scanner = new Scanner(System.in);
        startPublicApp();
    }

    void register(){
        User user = new User();

        scanner.nextLine(); //Empty Nextline for scanner issue.

        System.out.println("Enter Name: ");
        user.setName(scanner.nextLine());

        System.out.println("Enter Email ID: ");
        user.setEmail(scanner.nextLine());

        System.out.println("Enter Password: ");
        user.setPassword(scanner.nextLine());

        user.setUserType(1);

        if(controller.registerUser(user)){
            System.out.println(user.getName()+", You are now registered successfully... ");
            System.out.println("Navigating to the railway crossing application");

            //Navigate to home
            home();


        }else{
            System.err.println("Something went wrong, Please try again");
        }

    }
    void login(){

        User user = new User();
        scanner.nextLine(); //Empty Nextline for scanner issue.


        System.out.println("Enter Email ID: ");
        user.setEmail(scanner.nextLine());

        System.out.println("Enter Password: ");
        user.setPassword(scanner.nextLine());

        //user.setUserType(1);

        if(controller.loginUser(user)){
            System.out.println(user.getName()+", You are now logged in successfully... ");
            System.out.println("Navigating to the railway crossing application");

            //Navigating to Home
            home();


        }else{
            System.err.println("Something went wrong, Please try again");
        }

    }

    void listCrossings(){
        Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) railController.fetchCrossings();
        for(String key : crossings.keySet()){
            System.out.println(crossings.get(key));
            System.out.println("--------------------------");
        }

    }

    void home(){

        while(true) {
            System.out.println("=========================================");
            System.out.println("Welcome to the Railway Crossing Home");
            System.out.println("1. List Railway Crossings");
            System.out.println("2. Search Railway Crossings");
            System.out.println("3. Sort Railway Crossings by Schedule");
            System.out.println("4. Close application");
            System.out.println("=========================================");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // List railway crossings logic
                    listCrossings();
                    break;

                case 2:
                    // Search railway crossings logic
                    break;
                case 3:
                    // sort railway crossings logic
                    break;
                case 4:
                    // Close application
                    System.out.println("Thank you for using Railway Crossings App...");
                    System.out.println("Closing the program now...");
                    break;

                default:
                    System.err.println("Invalid Choice");
            }

            if(choice==4){
                break;
            }
        }
    }
    void startPublicApp() {

        System.out.println("=========================================");
        System.out.println("Welcome User");
        System.out.println("We have "+controller.getUsersCount()+" Users in the DataBase");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("=========================================");


        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                register();
                break;

            case 2:
                login();
                break;

            default:
                System.err.println("Invalid Choice");
        }

        //scanner.close();

    }
}
