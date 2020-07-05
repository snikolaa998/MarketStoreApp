import java.util.Scanner;

public class MarketStore {
    public static void main(String[] args) {

        MarketStoreModel marketStore = new MarketStoreModel();
        //Add data for bronze card
        Scanner scanner = new Scanner(System.in);
        //Add data for turnover
        System.out.println("Enter turnover");
        double turnover = scanner.nextDouble();
        //Add data for value of purchase
        System.out.println("Enter value of purchase");
        double valueOfPurchase = scanner.nextDouble();
        System.out.println("1.Bronze");
        //Call bronzeCard method
        marketStore.bronzeCard(turnover, valueOfPurchase);
        System.out.println("2.Silver");
        //Call silverCard method
        marketStore.silverCard(turnover, valueOfPurchase);
        System.out.println("3.Gold");
        //Call goldCard method
        marketStore.goldCard(turnover, valueOfPurchase);

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
