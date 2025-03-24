package org.example.observer.exercise;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
