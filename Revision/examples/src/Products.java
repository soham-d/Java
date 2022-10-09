import java.sql.Struct;

public class Products {

    String asin;
    String productName;
    float price;
    int currentInventory;

//    void setAsin(String asin){
//        this.asin = asin;
//    }
//    String getAsin(){
//
//        return this.asin;
//
//    }


    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(int currentInventory) {
        this.currentInventory = currentInventory;
    }
}
