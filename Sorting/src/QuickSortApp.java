import java.util.Arrays;

public class QuickSortApp {

    static void quickSort(){



    }

    public static void main(String[] args) {

        int[] productPrices = {1200, 1100, 3500, 500, 350, 1900};
        System.out.println("[main] Initial Array: "+ Arrays.toString(productPrices));
        System.out.println();

        System.out.println("Product Prices Before: ");
        System.out.println(Arrays.toString(productPrices));


        quickSort(productPrices, 0, productPrices.length-1);


        System.out.println("Product Prices After: ");
        System.out.println(Arrays.toString(productPrices));
    }
}
