package org.example.observer.newsNoExternalLibraries;

import org.example.observer.newsNoExternalLibraries.SubjectOrObservable.NewsAgency;
import org.example.observer.newsNoExternalLibraries.SubscribersOrObservers.EmailSubscriber;
import org.example.observer.newsNoExternalLibraries.SubscribersOrObservers.Observer;
import org.example.observer.newsNoExternalLibraries.SubscribersOrObservers.SmsSubscriber;

import java.util.EnumSet;

public class DemoNews {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer cosmin = new EmailSubscriber("Cosmin", EnumSet.of(NewsType.SPORTS, NewsType.TECHNOLOGY));
        Observer bob = new SmsSubscriber("Bob", EnumSet.of(NewsType.POLITICS));
        Observer clara = new EmailSubscriber("Clara", EnumSet.of(NewsType.POLITICS, NewsType.TECHNOLOGY));

        agency.addObserver(cosmin);
        agency.addObserver(bob);
        agency.addObserver(clara);

        agency.publishNews(new NewsEvent(NewsType.POLITICS, "Alegeri anticipate anul viitor!"));
        agency.publishNews(new NewsEvent(NewsType.SPORTS, "România câștigă meciul!"));
        agency.publishNews(new NewsEvent(NewsType.TECHNOLOGY, "Lansare nou iPhone."));
    }
}
