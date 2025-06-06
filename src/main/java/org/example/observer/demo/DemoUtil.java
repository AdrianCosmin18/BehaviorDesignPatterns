package org.example.observer.demo;

import java.util.Observable;
import java.util.Observer;

public class DemoUtil {
    public static void main(String[] args) {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("Bryan");
        Client client2 = new Client("Mark");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }

}

// state pe care vrem sa il observam
// concrete subject
class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

// concrete observer
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }

}
