package org.example.observer.newsNoExternalLibraries.SubscribersOrObservers;

import org.example.observer.newsNoExternalLibraries.NewsEvent;
import org.example.observer.newsNoExternalLibraries.NewsType;

import java.util.Set;

// subject <=> observable
public class SmsSubscriber implements Observer {
    private final String name;
    private final Set<NewsType> interests;

    public SmsSubscriber(String name, Set<NewsType> interests) {
        this.name = name;
        this.interests = interests;
    }

    @Override
    public void update(NewsEvent event) {
        System.out.println(name + " (SMS) received [" + event.getType() + "]: " + event.getMessage());
    }

    @Override
    public boolean isInterestedIn(NewsType type) {
        return interests.contains(type);
    }
}
