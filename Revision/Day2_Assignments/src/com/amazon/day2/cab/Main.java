package com.amazon.day2.cab;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String source;
        String destination;
        String cabType;
        float duration;
        float distance;

        System.out.println("Welcome to cab booking app");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Source: ");
        source = scanner.next();
        //System.out.println();

        System.out.print("Enter Destination: ");
        destination = scanner.next();
        //System.out.println();

        System.out.print("Enter Cab Type: ");
        cabType = scanner.next();
        //System.out.println();

        System.out.print("Enter Duration: ");
        duration = scanner.nextFloat();
        //System.out.println();

        System.out.print("Enter Distance: ");
        distance = scanner.nextFloat();
        //System.out.println();

        scanner.close();

        Cab cab  = new Cab();
        cab.fareCalculator(source, destination, cabType,duration,distance);


    }
}
