package org.example.observer.newsFlowApi;

import java.util.concurrent.SubmissionPublisher;

// Observable <=> subject
public class NewsPublisher extends SubmissionPublisher<String> {
    // Extindem SubmissionPublisher, care e deja un Flow.Publisher<String>

    public void publishNews(String news) {
        System.out.println("[Publisher] Publishing: " + news);
        this.submit(news); // trimite știrea la toți subscriberii
    }
}