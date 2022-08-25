package com.amazon.day4.CaseStudy;

import java.util.Scanner;


public class ShoppingCartApp {

    public static void main(String[] args) {

        String productID;
        String productName;
        double productPrice;

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Add to cart");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Name: ");
        productName = scanner.nextLine();

        System.out.println("Enter Product ID");
        productID = scanner.next();

        System.out.println("Enter Product Price");
        productPrice = scanner.nextDouble();

        cart.addProduct(productID,productName,productPrice);

        System.out.println("Enter Product Name: ");
        productName = scanner.next();

        System.out.println("Enter Product ID");
        productID = scanner.next();

        System.out.println("Enter Product Price");
        productPrice = scanner.nextDouble();

        cart.addProduct(productID,productName,productPrice);

        System.out.println("Enter Product Name: ");
        productName = scanner.next();

        System.out.println("Enter Product ID");
        productID = scanner.next();

        System.out.println("Enter Product Price");
        productPrice = scanner.nextDouble();

        cart.addProduct(productID,productName,productPrice);

        cart.checkOut();



    }
}
