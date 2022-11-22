package com.amazon.atlas22.railwaycrossingapp;

import com.amazon.atlas22.railwaycrossingapp.controller.RailwayCrossingController;
import com.amazon.atlas22.railwaycrossingapp.db.DB;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class GovernmentApp {

    RailwayCrossingController controller;
    Scanner scanner;

    DB db = DB.getInstance();

    GovernmentApp() throws ClassNotFoundException, SQLException {
        controller = RailwayCrossingController.getInstance();
        scanner = new Scanner(System.in);
        startGovernmentApp();
    }

    void listCrossings(){

        //List crossings from Data Structure
//        Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) controller.fetchCrossings();
//        for(String key : crossings.keySet()){
//            System.out.println(crossings.get(key));
//            System.out.println("--------------------------");
//        }

        //List crossings from DataBase
        db.retrieveCrossingsFromDB();


    }

    void searchCrossings(){

        scanner.nextLine(); // Empty Nextline for scanner issue
        System.out.println("Enter the name of crossing...");
        String searchKeyCrossing = scanner.nextLine();
        db.searchCrossingInDB(searchKeyCrossing);
    }

    void addCrossing() throws ClassNotFoundException {

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

    void deleteCrossing() throws ClassNotFoundException, SQLException {

        scanner.nextLine(); // Empty Nextline for scanner issue

        System.out.println("Enter the name of crossing to be deleted...");

        String deleteKeyCrossing = scanner.nextLine();

        db.deleteCrossingDB(deleteKeyCrossing);

//
//
//        //Delete crossing from HashMap
//        Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) controller.fetchCrossings();
//        for(String key : crossings.keySet()){
//            if(crossings.get(key).equals(deleteKeyCrossing)) {
//                crossings.remove(crossings.get(key).getName());
//            }
//        }
//
//        //Delete crossing from DataBase
//        if(db.deleteDB(crossings.get(deleteKeyCrossing))){
//            System.out.println("Crossing deleted successfully from the Database");
//        }
//        //System.out.println("Crossing "+deleteKeyCrossing+" deleted successfully...");
    }



    void login() throws ClassNotFoundException, SQLException {

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
            System.err.println("Something went wrong, Please try again");
        }

    }

    void home() throws ClassNotFoundException, SQLException {

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
                    searchCrossings();
                    break;
                case 3:
                    // add railway crossing function
                    addCrossing();
                    break;
                case 4:
                    // delete railway crossing function
                    deleteCrossing();
                    break;
                case 5:
                    // Export Data to files
                    //controller.exportData();
                    db.exportFromDB();
                    break;
                case 6:
                    // Import Data from files
                    db.importFromCSV();
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
    void startGovernmentApp() throws ClassNotFoundException, SQLException {

        System.out.println("=========================================");
        System.out.println("Welcome User");
        System.out.println("Proceed to login");
        System.out.println("=========================================");

        login();

    }

}
