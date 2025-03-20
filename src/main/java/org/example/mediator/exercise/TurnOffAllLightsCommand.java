package org.example.mediator.exercise;

import org.example.command.switchExercise.command.Command;

public class TurnOffAllLightsCommand implements Command {
    private final Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
