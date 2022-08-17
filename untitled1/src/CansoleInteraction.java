import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class CansoleInteraction {
    public static void main(String[] args){

        System.out.println("Welcome to Java session");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();

        scanner.nextLine(); // DO an empty nextline if reading strings after numbers

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome, "+name+" your age is "+age+".");
        scanner.close();

    }
}
