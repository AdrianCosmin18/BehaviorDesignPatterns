package org.example.visitor;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 3;
    }
}
