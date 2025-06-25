package org.example.visitor.demoWithVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart2 {
    private List<AtvPart2> parts = new ArrayList<AtvPart2>();

    public PartsOrder() {}

    public void addPart(AtvPart2 atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart2> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart2 atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
