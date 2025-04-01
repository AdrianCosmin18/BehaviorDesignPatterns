package org.example.observer.newsFlowApi;

public class DemoFlowApi {
    public static void main(String[] args) throws InterruptedException {
        NewsPublisher publisher = new NewsPublisher();

        NewsSubscriber alice = new NewsSubscriber("Alice");
        NewsSubscriber bob = new NewsSubscriber("Bob");

        publisher.subscribe(alice);
        publisher.subscribe(bob);

        publisher.publishNews("Breaking: Java 21 released!");
        publisher.publishNews("Sports: România câștigă!");
        publisher.publishNews("Tech: AI devine mainstream.");

        Thread.sleep(1000);

        publisher.close(); // semnalează finalul streamului
    }
}
