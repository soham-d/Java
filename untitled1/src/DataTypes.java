public class DataTypes {
    public static void main(String[] args){

        byte age = 10;
        System.out.println("Age is "+age);

        age = 20;
        System.out.println("Age is "+age);

        age =(byte) 257;
        System.out.println("Age is "+age); //Down casting


        short amount = 300; //16 bits
        int eWallet = 2000; //32 bits
        long phoneNumber = 8830777155L; //64 bits

        long number1 = 200; //we are not putting L after 200? >> because 200 is small number and fits into 32 bits

        //Copy Operation
        int number2 = (int)number1; // Num1 is 64 bits and num2 is 32 bits container, hence error.

        byte num3 = 50;
        int num4 = num3; //UP casting
        //Upcasting is allowed

        //Floating Point

        float taxes = 0.18F; // F makes 0.18 as 32 bits
        // float takes 32 bits in memory

        double amountAfterTaxes = 200.345;
        //allowed, takes 64 bits

        // Characters

        char ch = 'A';
        ch = '@';
        ch = 90;

        System.out.println("Ch is: "+ch);

        char ch1 ='\u2605';
        System.out.println("Ch is: "+ch1);

        ch1 ='\u2685';
        System.out.println("Ch is: "+ch1);


        //Logical
        boolean enableGPS = true; // 0000 0001
        boolean internet = false; // 0000 0000

        System.out.println("Primitve Data Types Finished: ");




    }
}
