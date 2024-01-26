package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.addAll(Set.of("Komeng", "Kysa", "Tri", "Darma"));

        NavigableSet<String> names = navigableSet.descendingSet();
        NavigableSet<String> komeng = navigableSet.tailSet("Komeng", true);

        for (var value : komeng){
            System.out.println(value);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(navigableSet);
        immutable.add("Komeng");

    }
}
