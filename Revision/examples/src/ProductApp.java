public class ProductApp {

    public static void main(String[] args) {

        Products product1 = new Products();

//        product1.asin = "B678978969";
//        product1.productName = "This is product1";
//        product1.price = 350;
//        product1.currentInventory = 1000;


        //System.out.println(product1);

//        System.out.println("Details of product");
//        System.out.println("Product Name "+product1.productName);
//        System.out.println("Product ID"+product1.asin);
//
//
//        product1.setAsin("B6879890");
//        System.out.println("Product ID"+product1.asin);
//
//        String ASIN1 = product1.getAsin();
//
//        System.out.println(product1.getAsin());

        product1.setAsin("B89779");
        product1.setCurrentInventory(78);

        System.out.println("P1 ASIN "+product1.getAsin());
        System.out.println("P1 inventory "+product1.getCurrentInventory());




    }
}
