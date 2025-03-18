package org.example.chainOfResponsability.exercise;

import org.example.chainOfResponsability.exercise.handlers.CEO;
import org.example.chainOfResponsability.exercise.handlers.Director;
import org.example.chainOfResponsability.exercise.handlers.VP;

public class Client {
    public static void main(String[] args) {

        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handle(request);

        request = new Request(RequestType.PURCHASE, 1499);
        director.handle(request);

        request = new Request(RequestType.PURCHASE, 2499);
        director.handle(request);
    }
}