package org.example.templateMethod.exercise;

public abstract class OrderTemplate {
    //alg pe care il vom folosi de fiecare data cand vom vrea sa procesam o comanda
    public boolean isGift; // hook (optional)
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrap.");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
    }
}
