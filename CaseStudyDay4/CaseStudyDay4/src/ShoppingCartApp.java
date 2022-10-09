import java.util.Scanner;
import java.util.TreeMap;

public class ShoppingCartApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Amazon");
        System.out.println("Enter 1 to Add Product to Cart");
        System.out.println("Enter 2 to Remove Product from Cart");
        System.out.println("Enter 3 to Check-out");

        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter your choice");
            int choice = scanner.nextInt();

            if(choice == 1) {
                System.out.println("Entering Add Product Mode: ");
                System.out.print("Enter Product ID: ");
                String productID = scanner.nextLine();
                System.out.print("Enter Product Name: ");
                String productName = scanner.nextLine();
                System.out.print("Enter Product Price: ");
                Integer productPrice = scanner.nextInt();

                Product product = new Product(productID, productName, productPrice);
                cart.addProduct(product);
            } else if (choice==2) {
                //Implement removal logic
                System.out.println("Removing product");
            } else if (choice == 3) {
                System.out.println("Checking Out");
                cart.checkOut();
                break;
            }else{
                System.err.println("Wrong Input, Try again");
            }


        }

    }
}
