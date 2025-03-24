package org.example.observer.newsNoExternalLibraries.SubjectOrObservable;

import org.example.observer.newsNoExternalLibraries.NewsEvent;
import org.example.observer.newsNoExternalLibraries.SubscribersOrObservers.Observer;

import java.util.ArrayList;
import java.util.List;

// subject <=> observable
public class NewsAgency {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void publishNews(NewsEvent event) {
        System.out.println("Publishing news [" + event.getType() + "]: " + event.getMessage());

        for (Observer observer : observers) {
            if (observer.isInterestedIn(event.getType())) {
                observer.update(event);
            }
        }
    }
}
