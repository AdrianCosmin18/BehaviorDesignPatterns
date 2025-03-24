package org.example.observer.newsNoExternalLibraries.SubscribersOrObservers;

import org.example.observer.newsNoExternalLibraries.NewsEvent;
import org.example.observer.newsNoExternalLibraries.NewsType;

public interface Observer {
    void update(NewsEvent event);
    boolean isInterestedIn(NewsType type);
}

