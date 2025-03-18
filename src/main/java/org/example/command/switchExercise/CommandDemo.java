package org.example.command.switchExercise;

import org.example.command.switchExercise.command.AllLightsCommand;
import org.example.command.switchExercise.command.Command;
import org.example.command.switchExercise.command.ToggleCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand1 = new ToggleCommand(bedroomLight);
        Command toggleCommand2 = new ToggleCommand(kitchenLight);

        lightSwitch.storeAndExecute(toggleCommand1);
        lightSwitch.storeAndExecute(toggleCommand2);
        lightSwitch.storeAndExecute(toggleCommand1);

        List<Light> lights = new ArrayList<Light>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
