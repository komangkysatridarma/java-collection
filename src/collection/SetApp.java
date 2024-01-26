package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        //// Set ini tidak mempedulikan adanya duplikat, jika ada duplikat maka tidak akan dicetak
        //HashSet ketika memiliki data maka datanya akan acak/tidak berurut
        //LinkedHashSet kebalikan dari HashSet, datanya akan berurut
        Set<String> namesHashSet = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Komeng");
        names.add("Kysa");
        names.add("Tri");
        names.add("Darma");
        names.add("Komeng");
        names.add("Kysa");
        names.add("Tri");
        names.add("Darma");

        for(var value : names){
            System.out.println(value);
        }

    }
}
