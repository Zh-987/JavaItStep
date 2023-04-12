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
        people.add(new Person("Talgat",34));
        people.add(new Person("Andrey",44));
        people.add(new Person("Shynar",18));

        for (Person person: people){
            System.out.println(person.getName());
        }

    }
}
