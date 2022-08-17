package com.amazon.day2.promoCode;

public class PromoCode {
    String promo;
    Integer result;


    public PromoCode(String promo, Integer result) {
        this.promo = promo;
        this.result = result;
    }

    public PromoCode() {
        promo = "";
        result = 0;
    }

    public Integer promoCode(String promo){
        if (promo.compareTo("TOP30")==0){
            result = 30;
            System.out.println("Applied promo code successfully");
            System.out.println("Discount Availed: "+result+"%");
            return result;
        }
        else if (promo.compareTo("WINTER90")==0){
            result = 45;
            System.out.println("Applied promo code successfully");
            System.out.println("Discount Availed: "+result+"%");
            return result;
        }
        else if (promo.compareTo("NEWTREND33")==0) {
            result = 20;
            System.out.println("Applied promo code successfully");
            System.out.println("Discount Availed: "+result+"%");
            return result;
        }
        else{
            System.out.println("Invalid Promo Code, Try again!");
            return 0;
        }

    }
}
