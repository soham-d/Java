package com.amazon.day2.promoCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inpCode;
        float price;
        float finalPrice;
        float discount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price: ");
        price = scanner.nextFloat();

        System.out.println("Enter the Promocode: ");
        inpCode = scanner.next();
        scanner.close();

        PromoCode promoCode = new PromoCode();
        discount = promoCode.promoCode(inpCode);

        finalPrice = (1-((discount)/100))*price;

        System.out.println("Final price: "+finalPrice);
    }
}