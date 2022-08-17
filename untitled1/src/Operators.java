public class Operators {
    public static void  main(String[] args){
        // 1. Arithmetic Operators
        // +, -, *, /, %

        double amount = 1200.55;
        double tax = 0.18;

        double total = amount + (tax*amount);

        System.out.println("Total amoount: \u20b9"+total);

        // 2. Assignment Operators
        // = , +=, -=, *=, /=, %=

        int eWallet = 500; // = opearator puts the data 500 into the container
        eWallet = eWallet + 200;
        eWallet += 200;

        System.out.println("eWallet "+ eWallet);

        //Conditional Operators
        // >, <, >=, <=, ==, !=

        int cabFare = 300;

        System.out.println("Can I book the cab? "+(eWallet>= cabFare));

        //Logical Op
        // &&, ||, !


        //Bitwise Operators
        //&, |, ^

        int num1 = 10; // 0000 1010
        int num2 = 8;  // 0000 1000

        int result1 = num1 & num2; // 0000 1000 -> 8
        int result2 = num1 | num2; // 0000 1010 -> 10
        int result3 = num1 ^ num2; // 0000 0010 -> 2  ///XOR

        System.out.println("Result1 "+result1);
        System.out.println("Result2 "+result2);
        System.out.println("Result3 "+result3);

        //6. Shift Operators
        // >>, <<, >>>
        // >>> this works only on positive nums, others work on both +and- nums

        int x = 8; // 0000 1000
        int y = 3;

        int z = x >> y;

        System.out.println("Z is : "+z);
        // Rt shift : x div by 2 power y
        // here 8/8 = 1

        x = -11; // 0000 1000
        y = 3;

        z = x >> y;

        System.out.println("Z is : "+z);

        x = -13; // 0000 1000
        y = 3;

        z = x >> y;

        System.out.println("Z is : "+z);

        // Ternary Operator
        eWallet -= 200;

        String message = (eWallet >= cabFare) ? "Cab is Booked" : "Please recharge your wallet";
        System.out.println("Message: "+message);

        // Increment Decrement Prefix - Postfix
        // ++, --

    }
}
