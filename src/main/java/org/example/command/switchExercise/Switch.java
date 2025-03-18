package org.example.command.switchExercise;

import org.example.command.switchExercise.command.Command;

// invoker
public class Switch {
    public void storeAndExecute(Command onCommand) {
        onCommand.execute();
    }
}
