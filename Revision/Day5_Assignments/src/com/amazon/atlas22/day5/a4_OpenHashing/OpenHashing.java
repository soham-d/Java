package com.amazon.atlas22.day5.a4_OpenHashing;

import java.util.Arrays;
import java.util.Scanner;

class HashTable{
    int size;
    int[] arr = new int[size];

    public HashTable(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    int hash(int key){
        return  key % size;
    }

    void insert(int key){

        int idx = hash(key);

        if (arr[idx] != 0){
            //arr[idx+1] = key;
            for(int i=idx+1; i < arr.length;i++ ){
                if(arr[i]==0){
                    arr[i] = key;
                    break;
                }
            }
        }else{
            arr[idx] = key;
        }

        System.out.println("Array after adding "+key+" is: "+ Arrays.toString(arr));
    }
}

public class OpenHashing {

    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        sc.close();

        HashTable h1 = new HashTable(size);
        h1.insert(50);
        h1.insert(700);
        h1.insert(85);

    }
}
