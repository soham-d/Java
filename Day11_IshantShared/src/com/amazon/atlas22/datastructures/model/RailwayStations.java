package com.amazon.atlas22.datastructures.model;

public class RailwayStations {

    String name;
    String city;
    String stationCode;

    public RailwayStations(String name, String city, String stationCode) {
        this.name = name;
        this.city = city;
        this.stationCode = stationCode;
    }

    @Override
    public String toString() {
        return "RailwayStations{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", stationCode='" + stationCode + '\'' +
                '}';
    }

    public int compareTo(RailwayStations railwayStation){
        return name.compareTo(railwayStation.name);

    }
}
