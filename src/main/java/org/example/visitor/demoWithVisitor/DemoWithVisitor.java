package org.example.visitor.demoWithVisitor;


public class DemoWithVisitor {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel2());
        order.addPart(new Fender2());
        order.addPart(new Oil2());

        order.accept(new AtvPartsShippingVisitor());

        order.accept(new AtvPartsDisplayVisitor());
    }
}
