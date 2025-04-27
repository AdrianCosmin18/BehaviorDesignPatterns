package org.example.state.states;

import org.example.state.context.Fan;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high.");
        fan.setState(fan.getHighState());
    }

    @Override
    public String toString() {
        return "Fan is medium.";
    }
}
