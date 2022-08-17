class Product{

    String item_name;
    String price;
    String quantity;

    void show() {
        System.out.println("[Product] Details: Name: "+item_name+" Price: "+price+" Qty: "+quantity);
    }

    public Product(String item_name, String price, String quantity) {
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("[Product] Object Constructed");
    }
}

class Shoe extends Product{

    String shoeSize;
    String shoeColor;

    public Shoe(String item_name, String price, String quantity, String shoeSize, String shoeColor) {
        super(item_name, price, quantity);
        this.shoeSize = shoeSize;
        this.shoeColor = shoeColor;
    }

    void show(){
        super.show();
        System.out.println("[Shoe] Shoe Size: "+shoeSize+" Shoe Color: "+shoeColor);
    }
}

class Shirt extends Product{

    String shirtSize;
    String fabricQuality;

    public Shirt(String item_name, String price, String quantity, String shirtSize, String fabricQuality) {
        super(item_name, price, quantity);
        this.shirtSize = shirtSize;
        this.fabricQuality = fabricQuality;
    }

    void show(){
        super.show();
        System.out.println("[Shirt] Shirt Size: "+shirtSize+" Fabric Quality: "+fabricQuality);
    }

}

class MobilePhone extends Product{

    double screenSize;
    int ram;
    int storageCap;
    String operatingSys;

    public MobilePhone(String item_name, String price, String quantity, double screenSize, int ram, int storageCap, String operatingSys) {
        super(item_name, price, quantity);
        this.screenSize = screenSize;
        this.ram = ram;
        this.storageCap = storageCap;
        this.operatingSys = operatingSys;
    }

    void show(){
        super.show();
        System.out.println("[Mobile] Screen Size: "+screenSize+" RAM :"+ram);
    }
}

public class PracticalExercise1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Shoe shoe = new Shoe("Nike Running", "3000.0", "1", "5", "Black");
        shoe.show();

        MobilePhone mobile = new MobilePhone("Apple iPhone 13 Pro Max", "78000","1",6.1,6,512,"iOS 16");
        mobile.show();

    }

}