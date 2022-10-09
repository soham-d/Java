package com.amazon.atlas22.railwaycrossingapp;

import java.util.Scanner;

public class RailwayCrossingApp {
    public static void main(String[] args) {

        while(true) {
            System.out.println("=========================================");
            System.out.println("Welcome to the Railway Crossing App");
            System.out.println("1. End User App");
            System.out.println("2. Government App");
            System.out.println("3. Close App");

            System.out.println("=========================================");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PublicApp publicApp = new PublicApp();
                    break;

                case 2:
                    GovernmentApp governmentApp = new GovernmentApp();
                    break;

                case 3:
                    System.out.println("Thank you for using the Railway Crossing App...");
                    break;

                default:
                    System.err.println("Invalid Choice");

            }
            if(choice==3){
                break;
            }

        }
    }
}
