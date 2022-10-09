package com.amazon.atlas22.creational;

abstract class Product{

    int pid;
    String name;
    String brand;
    int price;

}

class Mobile extends Product{
    //..

}

class TV extends Product{
    //..

}

class AndroidMobile extends Mobile{

}

class IOSMobile extends  Mobile{

}

class LEDTV extends TV{

}

class OLEDTV extends TV{

}
interface AbstractProductFactory{
    Product createProduct(int type);
}
class MobileFactory implements  AbstractProductFactory{

    @Override
    public Product createProduct(int type) {
        return null;
    }
}
class TVFactory implements  AbstractProductFactory{

    @Override
    public Product createProduct(int type) {
        return null;
    }
}

public class ProductAbstractFatoryAssignment {
    public static void main(String[] args) {

        static  ProductAbstractFatory getFactory(int type){

        }
    }

}
