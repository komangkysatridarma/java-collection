package collection;

import collection.data.Person;

import java.util.List;

public class MutableList {
    public static void main(String[] args) {

        Person immutableListPerson = new Person("Komeng");

        immutableListPerson.addHobbies("Game");
        immutableListPerson.addHobbies("Coding");

        for(var value : immutableListPerson.getHobbies()){
            System.out.println(value);
        }
    }

    public static void doSomethingWithHobby(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}
