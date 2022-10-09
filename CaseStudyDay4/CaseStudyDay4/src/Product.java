public class Product {

    String productID;
    String productName;
    Integer productPrice;

    Product nextProduct;
    Product previousProduct;

    public Product(String productID, String productName, Integer productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(){
        //Default Constructor
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    void showProduct(){
        System.out.println("--------------------------");
        System.out.println("Product ID:"+productID);
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+productPrice);
        System.out.println("--------------------------");
    }
}
