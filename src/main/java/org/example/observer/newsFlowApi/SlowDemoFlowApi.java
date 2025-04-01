package org.example.observer.newsFlowApi;

public class SlowDemoFlowApi {
    public static void main(String[] args) throws InterruptedException {
        NewsPublisher publisher = new NewsPublisher();

        SlowNewsSubscriber subscriber = new SlowNewsSubscriber("Alice");

        publisher.subscribe(subscriber);

        for (int i = 1; i <= 10; i++) {
            publisher.publishNews("News #" + i);
        }

        Thread.sleep(6000);
        publisher.close();
    }
}
