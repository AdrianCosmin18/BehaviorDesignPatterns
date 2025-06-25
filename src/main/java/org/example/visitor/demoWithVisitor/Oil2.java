package org.example.visitor.demoWithVisitor;

public class Oil2 implements AtvPart2 {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
