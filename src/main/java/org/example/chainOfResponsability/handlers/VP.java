package org.example.chainOfResponsability.handlers;

import org.example.chainOfResponsability.Request;
import org.example.chainOfResponsability.RequestType;

public class VP extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handle(request);
            }
        }
    }
}
