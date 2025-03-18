package org.example.chainOfResponsability.handlers;

import org.example.chainOfResponsability.Request;

public class CEO extends Handler {
    @Override
    public void handle(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
