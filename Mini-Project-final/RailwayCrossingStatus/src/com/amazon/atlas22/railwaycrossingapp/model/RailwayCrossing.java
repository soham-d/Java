package com.amazon.atlas22.railwaycrossingapp.model;

import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class RailwayCrossing {

    String name;
    String address;
    int status; // 1 for Open, 2 for Closed.
    User personInCharge;
    LinkedHashMap<String, String> schedules;

    public RailwayCrossing(){
        //Default Constructor
        name = "";
        address= "";
        status = 1;
        schedules = new LinkedHashMap<String, String>();
    }

    public RailwayCrossing(String name, String address, int status, User personInCharge, LinkedHashMap<String, String> schedules) {
        this.name = name;
        this.address = address;
        this.status = status;
        this.personInCharge = personInCharge;
        this.schedules = schedules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(User personInCharge) {
        this.personInCharge = personInCharge;
    }

    public LinkedHashMap<String, String> getSchedules() {
        return schedules;
    }

    public void setSchedules(LinkedHashMap<String, String> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {

        String crossingStatus = (status ==1)?"OPEN":"CLOSE";
        String railwayCrossingText = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
                                     "Crossing Name: "+name+"\n"+                                     "Crossing Name: "+name+"\n"+
                                     "Crossing Address: "+address+"\n"+
                                     "Crossing Status: "+crossingStatus+"\n"+
                                     "Crossing Person In-Charge: "+personInCharge.getName()+"\n"+
                                     "Crossing Schedules: "+schedules.toString()+"\n"+
                                     "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        return railwayCrossingText;
    }
}
