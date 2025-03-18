package org.example.chainOfResponsability.exercise.handlers;

import org.example.chainOfResponsability.exercise.Request;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(Request request);
}
