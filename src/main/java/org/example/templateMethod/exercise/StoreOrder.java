package org.example.templateMethod.exercise;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Ring up items from cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Process paymanet with card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Bag items at counter");
    }

    @Override
    public void doDelivery() {
        System.out.println("Print receipt");
    }
}
