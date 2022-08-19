//2. Create an Array of Integers and sort the same using bubble sort
// technique.

package com.amazon.day4.BubbleSort;

import java.util.Arrays;


public class BubbleSort {

    public static int[] BubbleSrt(int[] arr){

        int i, j, temp =0;
        for(i =0;i<arr.length-1;i++){
            for(j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }
    public static void main(String[] args) {


        int[] arr1 = new int[10];

        arr1[0] = 1;
        arr1[1] = 8;
        arr1[2] = 7;
        arr1[3] = 9;
        arr1[4] = 45;
        arr1[5] = 33;
        arr1[6] = 5;
        arr1[7] = 6;
        arr1[8] = 135;
        arr1[9] = 44;

        System.out.println("Original array is "+ Arrays.toString(arr1));

        //int[] arr2 = BubbleSort.BubbleSrt(arr1);

        System.out.println("Sorted Array: "+Arrays.toString(BubbleSort.BubbleSrt(arr1)));

    }
}
