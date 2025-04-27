package org.example.state.states;

import org.example.state.context.Fan;

public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off.");
        fan.setState(fan.getOffState());
    }

    @Override
    public String toString() {
        return "Fan is high.";
    }
}
