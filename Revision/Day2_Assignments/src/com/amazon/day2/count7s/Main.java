package com.amazon.day2.count7s;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        int count;

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextInt();

        scanner.close();

        countSevens count7 = new countSevens();

        count = count7.sevenCounter(input);
        System.out.println("Count: "+count);


    }
}
