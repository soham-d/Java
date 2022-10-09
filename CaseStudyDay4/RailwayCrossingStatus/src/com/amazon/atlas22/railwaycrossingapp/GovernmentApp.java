package com.amazon.atlas22.railwaycrossingapp;

import com.amazon.atlas22.railwaycrossingapp.controller.RailwayCrossingController;
import com.amazon.atlas22.railwaycrossingapp.controller.UserController;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class GovernmentApp {

    RailwayCrossingController controller;
    Scanner scanner;

    GovernmentApp(){
        controller = RailwayCrossingController.getInstance();
        scanner = new Scanner(System.in);
        startGovernmentApp();
    }

    void listCrossings(){
        Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) controller.fetchCrossings();
        for(String key : crossings.keySet()){
            System.out.println(crossings.get(key));
            System.out.println("--------------------------");
        }

    }

    void addCrossing(){

        scanner.nextLine(); // Empty next line for scanner issue

        System.out.println("Enter Details for Person In Charge: ");

        User user = new User();
        System.out.println("Enter Name: ");
        user.setName(scanner.nextLine());

        System.out.println("Enter Email ID: ");
        user.setEmail(scanner.nextLine());

        System.out.println("Enter Password: ");
        user.setPassword(scanner.nextLine());

        user.setUserType(3);

        System.out.println("Enter Railway Crossing Details: ");

        RailwayCrossing crossing = new RailwayCrossing();
        System.out.println("Enter Crossing Name: ");
        crossing.setName(scanner.nextLine());

        System.out.println("Enter Crossing Address: ");
        crossing.setAddress(scanner.nextLine());

        System.out.println("Enter Crossing Schedule: ");
        String scheduleKey = scanner.nextLine();
        String scheduleValue = scanner.nextLine();

        crossing.getSchedules().put(scheduleKey, scheduleValue);
        crossing.setPersonInCharge(user);

        if(controller.addOrUpdateCrossing(crossing)){
            System.out.println(crossing.getName()+" has been added successfully...");

        }else{
            System.err.println("Something went wrong, Please try again...");

        }
    }



    void login(){

        User user = new User();
        //scanner.nextLine(); //Empty Nextline for scanner issue.

        System.out.println("Enter Email ID: ");
        user.setEmail(scanner.nextLine());

        System.out.println("Enter Password: ");
        user.setPassword(scanner.nextLine());

        //user.setUserType(1);

        if(controller.loginUser(user)){
            System.out.println(user.getName()+", You are now logged in successfully... ");
            System.out.println("Navigating to the government Admin railway crossing application");

            //Navigating to Home
            home();


        }else{
            System.err.println("Something went worng, Please try again");
        }

    }

    void home(){

        while(true) {
            System.out.println("=========================================");
            System.out.println("Welcome to the Railway Crossing Home");
            System.out.println("We have "+controller.getCrossingsCount()+" Crossings in the DataBase");
            System.out.println("1. List Railway Crossings");
            System.out.println("2. Search Railway Crossings");
            System.out.println("3. Add Railway Crossing");
            System.out.println("4. Delete railway crossing");
            System.out.println("5. Export Data to Files");
            System.out.println("6. Import Data from Files");
            System.out.println("7. Close the Admin Government Application");
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
                    // add railway crossing function
                    addCrossing();
                    break;
                case 4:
                    // delete railway crossing function
                    break;
                case 5:
                    // Export Data to files
                    controller.exportData();
                    break;
                case 6:
                    // Import Data from files
                    break;
                case 7:
                    // Close application
                    System.out.println("Thank you for using Railway Crossings App for Admins and Govt officials...");
                    //System.out.println("Closing the program now...");
                    break;

                default:
                    System.err.println("Invalid Choice");
            }

            if(choice==7){
                break;
            }
        }
    }
    void startGovernmentApp() {

        System.out.println("=========================================");
        System.out.println("Welcome User");
        System.out.println("Proceed to login");
        System.out.println("=========================================");

        login();

    }

}
