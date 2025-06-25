package org.example.visitor.demoWithVisitor;

public class Fender2 implements AtvPart2 {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
