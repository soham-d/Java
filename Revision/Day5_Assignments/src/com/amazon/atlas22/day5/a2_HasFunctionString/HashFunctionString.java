package com.amazon.atlas22.day5.a2_HasFunctionString;

public class HashFunctionString {

    int capacity = 2069;

    int hash(String str){

        int ascii = 0;

        char[] ch = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            ascii += ((int) ch[i])*(i+1);
        }

        System.out.println("Ascii: "+ascii);

//        for(char c: ch){
//            ascii += (int) c;
//        }
        return ascii % capacity;

    }


    public static void main(String[] args) {

        HashFunctionString hash1 = new HashFunctionString();
        System.out.println("Hash value of 'abcdef' is: "+hash1.hash("abcdef"));
    }


}
