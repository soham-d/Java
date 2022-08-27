package com.amazon.atlas22.day5.a3_FrequencyUsingHashing;


import java.util.Arrays;
import java.util.Locale;

public class CharFreqUsingHashing {

    int[] arr = new int[26];

    int hash(String str){

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] ch = str.toCharArray();

        str = str.toLowerCase(Locale.ROOT);

        //System.out.println(Arrays.toString(arr));

        for(int i=0; i<ch.length; i++){
            int idx = ((int) ch[i] - 97);
            arr[idx] += 1;
        }

        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {
        CharFreqUsingHashing chaa = new CharFreqUsingHashing();
        chaa.hash("ababcd");
    }
}
