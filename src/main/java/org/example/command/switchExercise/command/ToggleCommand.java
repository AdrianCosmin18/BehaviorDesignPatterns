package org.example.command.switchExercise.command;

import org.example.command.switchExercise.Light;

public class ToggleCommand implements Command {
    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
