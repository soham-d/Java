package com.amazon.day2.count7s;

public class countSevens{
    Integer input;
    Integer counter = 0;
    float rem;

    public Integer sevenCounter(Integer input){
        if(input==0) {

            return 0;
        }

        int digit = input % 10;
        if (digit == 7){
            return 1+sevenCounter((input/10));
        }
        return sevenCounter(input/10);
    }

}
