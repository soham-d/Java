package com.amazon.day4.CaseStudy;

public class ShoppingCart {
    Product root;
    int size;

    void addProduct(String productID, String productName, double productPrice){
        size++;

        Product product = new Product();
        System.out.println("[Shopping Cart] [Add] node for product "+productName+" with ID "+ productID+" and price: "+productPrice);
        product.productID = productID;
        product.productName = productName;
        product.productPrice = productPrice;

        if(root == null){
            root = product;
            System.out.println("[Shopping Cart] [add] ROOT node is :"+root);
        }
        else {
            Product temp = root;
            while(temp.nextProduct != null){
                temp = temp.nextProduct;
            }
            temp.nextProduct = product;
            System.out.println("[Shopping Cart] [add] Product "+product+" Added after: "+temp);
        }

        System.out.println();
    }

    void removeProduct(String productID, String productName, double productPrice) {
        //size--;

        Product temp = root;

        if (root.productID == productID){
            root = root.nextProduct;
            size--;
        }
        while(temp.nextProduct != null){
            if(temp.nextProduct.productID==productID){
                if(temp.nextProduct.nextProduct==null){
                    temp.nextProduct = null;
                    size--;
                    break;
                }
                else{
                    temp.nextProduct = temp.nextProduct.nextProduct;
                    size--;
                }
            }
            temp = temp.nextProduct;
        }
    }

    void checkOut(){

        double finalPrice =0;
        System.out.println();
        System.out.println("[Shopping Cart] [checkOut] Checking Out Now");
        System.out.println();

        Product temp = root;

        System.out.println("Products in cart: ");

        while(temp.nextProduct != null){
            System.out.println("Product ID "+temp.productID);
            System.out.println("Product Name "+temp.productName);
            System.out.println("Product Price "+temp.productPrice);
            finalPrice += temp.productPrice;
            temp = temp.nextProduct;
            }
        //For last item
        System.out.println("Product ID "+temp.productID);
        System.out.println("Product Name "+temp.productName);
        System.out.println("Product Price "+temp.productPrice);
        finalPrice += temp.productPrice;

        System.out.println("Total Number of products: "+size);
        System.out.println("Final Price: "+finalPrice);

    }
}
