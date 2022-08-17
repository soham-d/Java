package com.amazon.day2.cab;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Cab {

    String source;
    String destination;
    String cabType;
    float duration;
    float distance;

    public Cab(String source, String destination, String cabType, float duration, float distance) {
        this.source = source;
        this.destination = destination;
        this.cabType = cabType;
        this.duration = duration;
        this.distance = distance;
    }

    public Cab(){
        source = "A";
        destination = "B";
        cabType = "mini";
        duration = 1;
        distance = 1;
    }
    public void showDetails(String source, String destination, float distance){
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Distance: "+distance);
    }

    public void fareCalculator(String source, String destination,String cabType, float duration, float distance){
        this.showDetails(source, destination, distance);
        if(cabType.compareTo("mini")==0){
            System.out.println("Cab Type selected: "+cabType);
            System.out.println("Fare: "+duration*distance*1.20);
        }
        else if(cabType.compareTo("sedan")==0){
            System.out.println("Cab Type selected: "+cabType);
            System.out.println("Fare: "+duration*distance*1.40);
        }
        else if(cabType.compareTo("luxury")==0){
            System.out.println("Cab Type selected: "+cabType);
            System.out.println("Fare: "+duration*distance*2.0);
        }
        else{
            System.out.println("Invalid Cab Type selected: ");
        }
    }

}
