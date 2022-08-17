package com.amazon.day3.Dish;

public class Main {
    public static void main(String[] args) {

        Dish pizza = new Dish();

        pizza.setName("Pizza");
        pizza.setPrice(350);
        pizza.setQuantity(2);
        pizza.setRatings(4);

        System.out.println(pizza.toString());

        pizza.increment();

        System.out.println(pizza.toString());

        pizza.decrement();
        System.out.println(pizza.toString());


    }
}
