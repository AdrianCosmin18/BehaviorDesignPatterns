package org.example.observer.newsJava8.SubscribersOrObservers;

import java.util.Observable;
import java.util.Observer;

public class NewsSubscriber implements Observer {
    private final String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " received news: " + arg);
    }
}
