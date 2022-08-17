public class StringSyntaxes {
    public static void main(String[] args){

        //Interned Strings
        String s1 = "Hello";
        String s2 = "Hello";

        //Object Strings

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("S1 is :"+s1);
        System.out.println("S2 is :"+s2);
        System.out.println("S3 is :"+s3);
        System.out.println("S4 is :"+s4);

    }
}
