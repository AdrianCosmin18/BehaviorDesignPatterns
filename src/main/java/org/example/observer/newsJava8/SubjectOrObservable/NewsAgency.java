package org.example.observer.newsJava8.SubjectOrObservable;

import java.util.Observable;

public class NewsAgency extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged(); // marchează obiectul ca modificat
        notifyObservers(news); // trimite notificarea
    }
}
