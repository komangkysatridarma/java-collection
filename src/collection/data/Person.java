package collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        //ini salah, di oop kan ada enkapsulasi artinya melindungi data/protected, nah data hobbies ini harus dilindungi
        //return hobbies;
        return Collections.unmodifiableList(hobbies);
    }

    public void addHobbies(String hobby) {
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }
}
