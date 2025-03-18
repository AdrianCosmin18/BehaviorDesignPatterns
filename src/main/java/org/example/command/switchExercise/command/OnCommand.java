package org.example.command.switchExercise.command;

import org.example.command.switchExercise.Light;

//concrete command
public class OnCommand implements Command {
    private final Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
