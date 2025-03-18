package org.example.chainOfResponsability.handlers;

import org.example.chainOfResponsability.Request;
import org.example.chainOfResponsability.RequestType;

public class Director extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors cand approve conferences");
        } else {
            successor.handle(request);
        }
    }
}
