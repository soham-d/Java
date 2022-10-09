import java.time.Period;

public class ShoppingCart {

    Product head;
    Product tail;

    int size;

    void addProduct(Product product){
        size++;

        System.out.println("[Shopping Cart] add: Adding Product: "+product.productName);

        if(head==null){
            head = product;
            head.nextProduct = tail;
            tail = product;
            tail.nextProduct = head;
        }else{
            product.previousProduct = tail;
            tail.nextProduct = product;
            tail = product;
            tail.nextProduct = head;
        }
    }

    void removeProduct(Product product){
        size--;
        Product temp = head;
        if(product==head){
            head = head.nextProduct;
        }
        else if(product==tail){
            tail = tail.previousProduct;
        }else{
            while(temp.nextProduct != null){
                if(temp.nextProduct == product){
                    temp.nextProduct = temp.nextProduct.nextProduct;
                }
                if(temp.nextProduct == head){
                    break;
                }

            }
        }

        System.out.println("[Shopping Cart] Product "+product.productName +" Removed Successfully!");
    }


    void checkOut(){

        Product temp = head;
        int cartTotal = 0;

        System.out.println("Number of Products available in the cart: "+size);


        while(temp.nextProduct != null){

            if(temp.nextProduct != head) {
                temp.showProduct();

                cartTotal += temp.productPrice;
            }
            else{
                break;
            }
        }
        System.out.println("Total cart value: INR"+cartTotal);
    }

}
