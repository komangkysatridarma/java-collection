package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        //operasi nya sama, tapi ada kelebihan dan kekurangan nya masing masing
        List<String> namesArray = new ArrayList<>();
        List<String> namesLinked = new LinkedList<>();

        namesArray.add("Komeng");
        namesArray.add("Kysa");
        namesLinked.add("Hello");

        namesArray.set(0, "Catur");

        namesArray.remove(1);

        System.out.println(namesArray.get(0));

        for(var value : namesLinked){
            System.out.println(value);
        }

    }
}
