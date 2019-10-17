package core;

import interfaces.Cartable;

public class PayDesk {

    public static double findDiscountRate(Cartable card){
        return card.getDiscount() * 100;
    }

    public static double findDiscountValue(Cartable card, double price){
        return price * card.getDiscount();
    }

    public static double findPriceAfterDiscount(Cartable card, double price){
        return price - (price * card.getDiscount());
    }

}
