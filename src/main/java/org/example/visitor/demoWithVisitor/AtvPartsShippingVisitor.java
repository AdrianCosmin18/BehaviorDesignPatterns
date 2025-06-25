package org.example.visitor.demoWithVisitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
    double shippingAmount = 0;
    @Override
    public void visit(Fender2 fender) {
        shippingAmount += 3;
        System.out.println("Fender is bulky");
    }

    @Override
    public void visit(Oil2 oil) {
        shippingAmount += 9;
        System.out.println("Oil has a hazmat fee");
    }

    @Override
    public void visit(Wheel2 wheel) {
        shippingAmount += 12;
        System.out.println("Wheels are bulky and hazmat fee");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("if they bought more than 3 items we will give a discount on shipping.");
        List<AtvPart2> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is " + shippingAmount);
    }
}
