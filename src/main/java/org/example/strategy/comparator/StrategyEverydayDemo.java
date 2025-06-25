package org.example.strategy.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
    private static void printContents(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }

    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "234234234234", 39);
        Person mark = new Person("Mark", "234234234234", 41);
        Person chris = new Person("Chris", "234234234234", 29);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }

                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                return 0;
            }
        });

        System.out.println("\nSorted by age");
        printContents(people);


        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSorted by name");
        printContents(people);
    }
}
