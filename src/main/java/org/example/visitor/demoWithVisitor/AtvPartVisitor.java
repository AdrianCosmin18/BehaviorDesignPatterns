package org.example.visitor.demoWithVisitor;

public interface AtvPartVisitor {

    void visit(Fender2 fender);

    void visit(Oil2 oil);

    void visit(Wheel2 wheel);

    void visit(PartsOrder partsOrder);
}
