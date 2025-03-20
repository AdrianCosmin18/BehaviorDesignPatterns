package org.example.iterator.exercise;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");
        //ca bikeRepo sa fie iterabile trebuie sa implementeze Iterable

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
        //putem inlocui expresia de parcurgere de mai sus cu:
//        for (String s : repo) {
//            System.out.println(s);
//        }
        // putem face asta pentru ca se respecta conditiile unui iterator (hasNext si next implementate)

    }
}
