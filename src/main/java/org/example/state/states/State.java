package org.example.state.states;

public abstract class State {
    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }
}
