package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        LinkedList<String> countries = new LinkedList<String>();

        countries.add("Kazakhstan");
        countries.add("Usa");
        countries.add("China");
        countries.addLast("Indonesia");
        countries.addFirst("India");
        countries.add(2,"Germany");

        System.out.printf("Linked List size %d", countries.size());
        System.out.println(countries.get(1));
        countries.set(3,"Italy");

        for (String country: countries){
            System.out.println(country);
        }
        if(countries.contains("Kazakhstan")){
            System.out.println("This linked list contains Kazakhstan");
        }
        else {
            System.out.println("This linked list not contains Kazakhstan");
        }

        countries.remove("China");

        countries.removeFirst();
        countries.removeLast();

        for (String country: countries){
            System.out.println(country);
        }
        LinkedList<Person> people = new LinkedList<Person>();

        people.add(new Person("Talgat"));
        people.addFirst(new Person("Andrey"));
        people.addLast(new Person("Shynar"));
        people.remove(2);

        for (Person person: people){
            System.out.println(person.getName());
        }

        Person first = people.getFirst();

        System.out.println(first.getName());
    }
}
