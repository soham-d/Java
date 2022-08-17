package com.amazon.day3.User;


public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.setuName("Emily Watson");
        user1.setuAddress(" 134, North Ave, Berkshire, England");
        user1.setuEmailID("emilyw@gamil.com");
        user1.setuGender("FEMALE");
        user1.setuPhoneNum("8909 778661");

        user2.setuName("Anthony Gonzales");
        user2.setuAddress(" 153th Street, Times Avenue, NY, USA");
        user2.setuEmailID("ganthony11@gamil.com");
        user2.setuGender("MALE");
        user2.setuPhoneNum("8790 876668");

        user3.setuName("Rajesh Kuthrapally");
        user3.setuAddress(" 909, Central Park Road, Manhattan, NY, USA");
        user3.setuEmailID("rajeshkw@gamil.com");
        user3.setuGender("MALE");
        user3.setuPhoneNum("098811 43833");

        System.out.println("User Details: ");
        System.out.println("---------------------------------------------------------");

        System.out.println("User's Name: "+user1.getuName());
        System.out.println("User's Address: "+user1.getuAddress());
        System.out.println("User's Email ID: "+user1.getuEmailID());
        System.out.println("User's Gender: "+user1.getuGender());

        System.out.println("---------------------------------------------------------");

        System.out.println("User's Name: "+user2.getuName());
        System.out.println("User's Address: "+user2.getuAddress());
        System.out.println("User's Email ID: "+user2.getuEmailID());
        System.out.println("User's Gender: "+user2.getuGender());
        System.out.println("User's Phone Number: "+user2.getuPhoneNum());

        System.out.println("---------------------------------------------------------");

        System.out.println("User's Name: "+user3.getuName());
        System.out.println("User's Address: "+user3.getuAddress());
        System.out.println("User's Email ID: "+user3.getuEmailID());
        System.out.println("User's Gender: "+user3.getuGender());
        System.out.println("User's Phone Number: "+user3.getuPhoneNum());

    }
}
