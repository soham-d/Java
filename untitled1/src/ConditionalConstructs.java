import  java.util.Scanner;
public class ConditionalConstructs {

    public static void main(String[] args){

        int HUNGRY = 101;
        int promoCodeByUser = 0;
        double amount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Order Amt: ");
        amount = scanner.nextDouble();

        System.out.println("Enter Promo Code");
        promoCodeByUser = scanner.nextInt();

        scanner.close();

        System.out.println("Amount: "+amount);
        System.out.println("Promo code: "+promoCodeByUser);

        if(amount >= 159){
            System.out.println("You Can apply Promo Code HUNGRY");
        }
        else{
            System.out.println("You need to add items worth "+(159-amount)+"more");

        }
        // Nested If else
        // Ladder of if else
    }
}
