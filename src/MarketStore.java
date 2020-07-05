import java.util.Scanner;

public class MarketStore {
    public static void main(String[] args) {

        MarketStoreModel marketStore = new MarketStoreModel();
        System.out.println("1.Bronze");
        //Call bronzeCard method
        marketStore.bronzeCard(0, 150);
        System.out.println("2.Silver");
        //Call silverCard method
        marketStore.silverCard(600, 850);
        System.out.println("3.Gold");
        //Call goldCard method
        marketStore.goldCard(1500, 1300);

    }
}

class MarketStoreModel {

    void bronzeCard(double turnover, double valueOfPurchase) {

        double totalPrice;
        double discount;
        double discountRate;
        if (turnover < 100) {
            discountRate = 0;
            discount = 0;
            totalPrice = valueOfPurchase - discount;
            System.out.println("Purchase value: " + "$" + valueOfPurchase);
            System.out.println("Discount rate: " + discountRate + "%");
            System.out.println("Discount: " + "$" + discount);
            System.out.println("Total: " + "$" + totalPrice);
        } else if (turnover >= 100 || turnover <= 300) {
            discountRate = 1;
            discount = (valueOfPurchase * discountRate) / 100;
            totalPrice = valueOfPurchase - discount;
            System.out.println("Purchase value: " + "$" + valueOfPurchase);
            System.out.println("DiscountRate: " + discountRate + "%");
            System.out.println("Discount: " + "$" + discount);
            System.out.println("Total: " + "$" + totalPrice);
        } else {
            discountRate = 2.5;
            System.out.println("DiscountRate: " + discountRate + "%");
        }
    }

    void silverCard(double turnover, double valueOfPurchase) {

        double totalPrice;
        double discount;
        double discountRate = 2;
        if (turnover > 300) {
            discountRate = 3.5;
        }
        discount = (valueOfPurchase * discountRate) / 100;
        totalPrice = valueOfPurchase - discount;
        System.out.println("Purchase value: " + "$" + valueOfPurchase);
        System.out.println("DiscountRate: " + discountRate + "%");
        System.out.println("Discount: " + "$" + discount);
        System.out.println("Total: " + "$" + totalPrice);
    }

    void goldCard(double turnover, double valueOfPurchase) {

        double totalPrice;
        double discount;
        double discountRate = 2;
        if (turnover >= 100) {
            double grow = turnover / 100;
            discountRate += grow;
            if (discountRate > 10) {
                discountRate = 10;
            }
        }
        discount = (valueOfPurchase * discountRate) / 100;
        totalPrice = valueOfPurchase - discount;
        System.out.println("Purchase value: " + "$" + valueOfPurchase);
        System.out.println("DiscountRate: " + discountRate + "%");
        System.out.println("Discount: " + "$" + discount);
        System.out.println("Total: " + "$" + totalPrice);
    }
}
