package org.example.mediator.exercise;

import org.example.command.switchExercise.command.Command;

public class TurnOnAllLightsCommand implements Command {
    private final Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
