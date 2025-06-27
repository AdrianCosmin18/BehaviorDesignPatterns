package org.example.visitor.demoWithVisitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Fender2 fender) {
        System.out.println("We have Fenders");
    }

    @Override
    public void visit(Oil2 oil) {
        System.out.println("We have Oil");
    }

    @Override
    public void visit(Wheel2 wheel) {
        System.out.println("We have Wheels");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have Orders");
    }
}
