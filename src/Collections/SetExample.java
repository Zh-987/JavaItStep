package Collections;

import java.util.HashSet;

public class SetExample {
    public static void main(String args[]) {
        HashSet<String> countries = new HashSet<String>();
        countries.add("Egypt");
        countries.add("Turkey");
        countries.add("Jordan");
        countries.add("OAE");
        boolean isAdd = countries.add("Egypt");
        System.out.println(isAdd);

        System.out.printf(" Hash set size %d", countries.size());

        for (String country: countries){
            System.out.println(country);
        }
        countries.remove("Jordan");

        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Talgat"));
        people.add(new Person("Andrey"));
        people.add(new Person("Shynar"));

        for (Person person: people){
            System.out.println(person.getName());
        }

    }
}
