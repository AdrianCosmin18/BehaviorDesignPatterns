package org.example.state.states;

import org.example.state.context.Fan;

public class FanOffState extends State {
    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getLowState());
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }
}
