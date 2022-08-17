package com.amazon.day4.arrayops;// 1. Create an Array of Integers and find the maximum, minimum and
//    average number.

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        Integer[] arr1 = new Integer[5];

        arr1[0] = 22;
        arr1[1] = 45;
        arr1[2] = 10;
        arr1[3] = 134;
        arr1[4] = 98;

        System.out.println("Array 1 is "+Arrays.toString(arr1));
        Integer max;
        Integer min;
        Integer sum;
        Integer len;
        float avg;

        System.out.println("Length of Array: "+Array.getLength(arr1));
         max = arr1[0];
         min = arr1[0];
         sum = 0;
         len = Array.getLength(arr1);

         for(Integer num: arr1){
             if(num>max){
                 max = num;
             }
             if(num<min){
                 min = num;
             }
             sum += num;
         }
         avg = (float) sum/(float) len;

        System.out.println("Max of array: "+max);
        System.out.println("Min of array: "+min);
        System.out.println("Average of array: "+avg);


    }
}