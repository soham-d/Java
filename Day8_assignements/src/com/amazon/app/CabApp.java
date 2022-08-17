/*
Create an interface Cab with abstract method bookCab(String source, String
destination, int distance). Now, create child classes MiniCab, SedanCab, Luxury Cab
and implement them with interface Cab to implement the abstract method and
showcase the concept of run time polymorphism using interfaces.
*/

package com.amazon.app;

import java.time.chrono.IsoChronology;
import java.util.SortedMap;

interface Cab{
    void bookCab(String source, String destination, int distance);
}

class miniCab implements  Cab{

    @Override
    public void bookCab(String source, String destination, int distance) {
        System.out.println("Booking a MiniCab");
        System.out.println("Details:");
        System.out.println("Source "+source);
        System.out.println("Destination "+destination);
        System.out.println("Distance "+distance);
    }
}

class sedanCab implements Cab{


    @Override
    public void bookCab(String source, String destination, int distance) {
        System.out.println("Booking a Sedan");
        System.out.println("Details:");
        System.out.println("Source "+source);
        System.out.println("Destination "+destination);
        System.out.println("Distance "+distance);
    }
}

class luxuryCab implements Cab{


    @Override
    public void bookCab(String source, String destination, int distance) {
        System.out.println("Booking a luxury Cab");
        System.out.println("Details:");
        System.out.println("Source "+source);
        System.out.println("Destination "+destination);
        System.out.println("Distance "+distance);
    }
}

public class CabApp {
    public static void main(String[] args) {
        Cab cab = new miniCab();
        cab.bookCab("ABC Square","PQR Square",8);
    }
}
