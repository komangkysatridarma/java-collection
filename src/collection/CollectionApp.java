package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();

        names.add("Komeng");
        names.add("Kysa");
        names.addAll(List.of("Iruma", "Kun", "ehe"));

        for(var value : names){
            System.out.println(value);
        }

        System.out.println("REMOVE");

        names.remove("Kysa");
        names.removeAll(List.of("Kun", "ehe"));

        for(var value : names){
            System.out.println(value);
        }

        System.out.println(names.contains("Iruma"));
        System.out.println(names.containsAll(List.of("Komeng", "Kysa")));

        System.out.println(names.size());
    }
}