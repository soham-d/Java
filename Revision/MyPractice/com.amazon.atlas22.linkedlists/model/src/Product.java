public class Product {
    String productName;
    String productID;
    Integer productPrice;
    Product nextProduct = null;
    Product previousProduct = null;

    Product(){}

    Product(String productName, String productID, Integer productPrice, Product previousProduct, Product nextProduct){
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.previousProduct = previousProduct;
        this.nextProduct = nextProduct;
    }
}
