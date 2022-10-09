package com.amazon.atlas22.creational;

class CinemaHall{
    static private CinemaHall cinemaHall;

    private CinemaHall(){
        System.out.println("Cinemahall Object constructed. Hashcode: "+hashCode());
    }

    public static CinemaHall getHall(){
        if(cinemaHall == null){
            cinemaHall = new CinemaHall();
        }
        return cinemaHall;
    }
}

public class SingletonLazyMultiThreading {
}
