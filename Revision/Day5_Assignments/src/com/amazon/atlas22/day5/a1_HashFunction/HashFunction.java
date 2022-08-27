package com.amazon.atlas22.day5.a1_HashFunction;


public class HashFunction {

    Integer capacity;
    Integer size;

    public HashFunction(Integer capacity, Integer size) {
        this.capacity = capacity;
        this.size = size;
    }

    int hash(Integer key){

        int hashCode = key % capacity;
        return hashCode;

    }

    public static void main(String[] args) {

        HashFunction hashfunc = new HashFunction(10,25);

        System.out.println("Hash value of 19 is: "+hashfunc.hash(19));




    }
}
