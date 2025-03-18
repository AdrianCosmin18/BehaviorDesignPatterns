package org.example.chainOfResponsability.exercise.handlers;

import org.example.chainOfResponsability.exercise.Request;
import org.example.chainOfResponsability.exercise.RequestType;

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
