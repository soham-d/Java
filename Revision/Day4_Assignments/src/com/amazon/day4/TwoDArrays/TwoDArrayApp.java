package com.amazon.day4.TwoDArrays;

import java.rmi.registry.LocateRegistry;
import java.util.Arrays;

public class TwoDArrayApp {


    public static  void print2DArray(String[][] arr){
        for(String[] innerArray: arr){
            for(String val: innerArray){
                System.out.print(val+"\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[][] covidData = new String[5][3];

        covidData[0][0] = "State";
        covidData[0][1] = "Active Cases";
        covidData[0][2] = "Total Cured";

        covidData[1][0] = "Maharashtra";
        covidData[1][1] = "11,690";
        covidData[1][2] = "7,918,535";

        covidData[2][0] = "Telangana";
        covidData[2][1] = "2,820";
        covidData[2][2] = "823,884";

        covidData[3][0] = "Punjab";
        covidData[3][1] = "15,545";
        covidData[3][2] = "747,101";

        covidData[4][0] = "MP";
        covidData[4][1] = "699";
        covidData[4][2] = "1,041,095";

        print2DArray(covidData);


    }
}
