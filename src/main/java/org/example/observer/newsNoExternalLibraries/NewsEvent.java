package org.example.observer.newsNoExternalLibraries;

public class NewsEvent {
    private final NewsType type;
    private final String message;

    public NewsEvent(NewsType type, String message) {
        this.type = type;
        this.message = message;
    }

    public NewsType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}

