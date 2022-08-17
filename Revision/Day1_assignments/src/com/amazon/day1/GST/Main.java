package com.amazon.day1.GST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float price;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price");
        price = scanner.nextInt();
        scanner.close();

        System.out.println("GST on the price: \u20b9 "+(price*0.18));
        System.out.println("Final amount to be paid: \u20b9"+(price*1.18));
    }
}