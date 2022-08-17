package com.amazon.day3.Dish;

public class Dish {
    String name;
    int ratings;
    int price;
    int quantity;

    public Dish(String name, int ratings, int price, int quantity) {
        this.name = name;
        this.ratings = ratings;
        this.price = price;
        this.quantity = quantity;
    }

    public Dish(){
        quantity = 0;
        name = "Pizza";
        ratings = 1;
        price = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increment(){
        this.quantity += 1;
    }
    public void decrement(){
        this.quantity -= 1;

    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", ratings=" + ratings +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
