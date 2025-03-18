package org.example.chainOfResponsability.handlers;

import org.example.chainOfResponsability.Request;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(Request request);
}
