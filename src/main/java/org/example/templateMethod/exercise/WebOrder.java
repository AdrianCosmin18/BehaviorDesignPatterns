package org.example.templateMethod.exercise;

public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Get items from cart,");
        System.out.println("Set gift preferences,");
        System.out.println("Set delivery address,");
        System.out.println("Set billing address.");
    }

    @Override
    public void doPayment() {
        System.out.println("Process paymanet without card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Ship the item to address");
    }

    @Override
    public void doDelivery() {
        System.out.println("Email receipt");
    }
}
