package org.example.mediator.exercise;

import org.example.command.switchExercise.Light;
import org.example.command.switchExercise.command.Command;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("bedroom");
        Light kitchenLight = new Light("kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }
}
