package com.amazon.day2.middleName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        System.out.println("---------------------------------------------------");
        System.out.println("Enter the string to split");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        scanner.close();

        GetMiddleName get1 = new GetMiddleName();
        get1.getMiddleName(input);


//        while(true){
//            System.out.println("Enter the name of player");
//            input = scanner.nextLine();
//
//            if (input.compareTo("exit")==0){
//                break;
//            }
//            else{
//                String[] result = input.split(" ");
//                System.out.println("Middle Name: "+result[1]);
//            }
//
//        }
    }
}
