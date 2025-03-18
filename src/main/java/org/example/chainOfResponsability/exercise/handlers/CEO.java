package org.example.chainOfResponsability.exercise.handlers;

import org.example.chainOfResponsability.exercise.Request;

public class CEO extends Handler {
    @Override
    public void handle(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
