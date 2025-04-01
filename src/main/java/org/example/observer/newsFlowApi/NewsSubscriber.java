package org.example.observer.newsFlowApi;

import java.util.concurrent.Flow.*;

// Observer <=> subscriber
public class NewsSubscriber implements Subscriber<String> {
    private final String name;
    private Subscription subscription;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("[" + name + "] Subscribed!");
        this.subscription = subscription;
        subscription.request(1); // cerem primul element
    }

    @Override
    public void onNext(String item) {
        System.out.println("[" + name + "] Received news: " + item);
        subscription.request(1); // cerem următorul element
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("[" + name + "] Error: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("[" + name + "] All news received.");
    }
}
