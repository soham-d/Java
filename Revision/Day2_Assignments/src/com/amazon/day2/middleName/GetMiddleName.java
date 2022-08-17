package com.amazon.day2.middleName;

public class GetMiddleName {
    String input;

    public GetMiddleName(String input) {
        this.input = input;
    }

    public GetMiddleName(){
        input = "A";
    }

    public void getMiddleName(String input){
        String[] res = input.split(", ");
        for (String str: res){
            String[] result = str.split(" ");
            if(result.length==3) {
                System.out.println(result[1]);
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}
