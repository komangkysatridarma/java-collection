package collection;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Komeng", "Kysa", "Tri", "Darma");

        for(var name : names){
            System.out.println(name);
        }

    }
}
