package org.example.templateMethod.demoComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateEverydayDemo {

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

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);
    }
}
