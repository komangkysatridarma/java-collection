package collection;

import collection.data.Person;
import collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Komeng"));
        people.add(new Person("Kysa"));
        people.add(new Person("Tri"));

        for(var person : people){
            System.out.println(person.getName());
        }

        /*
        SortedSet<Person> people1 = Collections.unmodifiableSortedSet(people);
        people1.add(new Person("Komangg"));
        */

    }
}
