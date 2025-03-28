package org.example.mediator.exercise;

import org.example.command.switchExercise.Light;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private final List<Light> lights = new ArrayList<Light>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        for (Light light : lights) {
            if (!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
