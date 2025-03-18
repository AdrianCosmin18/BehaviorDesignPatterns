package org.example.command.switchExercise;

// invoker
public class Switch {
    public void storeAndExecute(Command onCommand) {
        onCommand.execute();
    }
}
