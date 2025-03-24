package org.example.observer.newsJava8;

import org.example.observer.newsJava8.SubjectOrObservable.NewsAgency;
import org.example.observer.newsJava8.SubscribersOrObservers.NewsSubscriber;

public class DemoNewsJava8 {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsSubscriber alice = new NewsSubscriber("Alice");
        NewsSubscriber bob = new NewsSubscriber("Bob");

        agency.addObserver(alice);
        agency.addObserver(bob);

        agency.setNews("Java 17 a fost lansat!");
    }
}
