package com.amazon.atlas22.creational;

class HomePage{

    boolean isInternetAvailable = false;

    static HomePage page;
    private HomePage(){
        // Due to some logical part, where exceptions can be thrown and program can crash due to that.
        if(!isInternetAvailable){
            throw new ArithmeticException("Internet Not Available");
        }
        System.out.println("HomePage object constructed! "+hashCode());
    }

    //Static initialization block
    static {
        try{
            page = new HomePage();
        }catch (Exception e){
            System.err.println("Something went worng: "+e);
        }

    }
    static HomePage getPage(){
        return page;
    }
}

public class SingletonWithBlock {

    public static void main(String[] args) {

        HomePage page1 = HomePage.getPage();
        HomePage page2 = HomePage.getPage();

        if(page1!=null)
            System.out.println("Page1 is: "+page1.hashCode());

        if(page2!=null)
            System.out.println("Page2 is: "+page2.hashCode());

    }



    }
