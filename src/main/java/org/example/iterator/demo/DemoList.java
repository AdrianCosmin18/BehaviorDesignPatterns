package org.example.iterator.demo;

import java.util.*;

public class DemoList {

    public static void main(String[] args) {
        // List<String> names = new ArrayList<String>();
        Set<String> names = new HashSet<String>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i)); // set-ul nu are get in cazul asta
        // aici se poate face remove dar nu se comporta corect pentru ca se redimensioneaza lista in timp real la fiecare stergere
//
//        }

        //va folosi o instanta a unui Iterator pt a putea face aceasta bucla
        // un iterator cu bucla iterabila
        for (String name : names) {
            System.out.println(name);
            // names.remove(name); // nu poti face remove pentru ca folosim un iterator intern dar nu avem acces la el =>
            // cand facem remove => modificam lista direct si Java isi da seama ca lista a fost modificata fara ca iteratorul intern sa stie
            // si arunca => ConcurrentModificationException
        }

        // cazul corect mereu pentru remove indiferent de tipul colectiei
        Iterator<String> namesItr = names.iterator();
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }
        System.out.println("Name size: " + names.size());
    }
}
