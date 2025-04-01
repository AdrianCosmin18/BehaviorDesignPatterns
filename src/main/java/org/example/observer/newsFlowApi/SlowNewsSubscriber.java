package org.example.observer.newsFlowApi;

import java.util.concurrent.Flow.*;
import java.util.concurrent.atomic.AtomicInteger;

// Observer <=> subscriber
public class SlowNewsSubscriber implements Subscriber<String> {
    private final String name;
    private Subscription subscription;
    private final int batchSize = 2; // cerem 2 știri odată
    private AtomicInteger processedInBatch = new AtomicInteger(0);

    public SlowNewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) { // pt. fiecare item primit => se va invoca onNext
        System.out.println("[" + name + "] Subscribed!");
        this.subscription = subscription;
        subscription.request(batchSize); // cerem primele 2 știri => dupa ce se termina cu succes se executa automat onNext
    }

    @Override
    public void onNext(String item) {
        System.out.println("[" + name + "] Processing: " + item);
        try {
            Thread.sleep(500); // simulăm o procesare lentă
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int count = processedInBatch.incrementAndGet();
        if (count >= batchSize) {
            System.out.println("[" + name + "] Finished batch, requesting next " + batchSize);
            processedInBatch.set(0);
            subscription.request(batchSize); // cerem următorul batch
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("[" + name + "] Error: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("[" + name + "] All news received. Done!");
    }
}
