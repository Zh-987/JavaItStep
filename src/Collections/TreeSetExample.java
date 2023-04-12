package Collections;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        TreeSet<String> countries = new TreeSet<String>();
        countries.add("Egypt");
        countries.add("Turkey");
        countries.add("Jordan");
        countries.add("OAE");

        System.out.printf(" Tree set size %d", countries.size());
        System.out.println();
        for (String country: countries){
            System.out.println(country);
        }
        System.out.println();
        System.out.println(countries.first());
        System.out.println(countries.last());
        System.out.println();

        SortedSet<String> set =  countries.subSet("Egypt", "OAE");
        System.out.println(set);
        /*countries.remove("Jordan");*/
        System.out.println();
        String greater = countries.higher("OAE");
        String lower = countries.lower("Turkey");

        System.out.println(greater);
        System.out.println(lower);
        System.out.println();
        NavigableSet<String> navSet = countries.descendingSet();

        SortedSet<String> setLower = countries.headSet("Turkey");
        SortedSet<String> setGreater = countries.tailSet("Turkey");

        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);


       /* TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("David",12));
        people.add(new Person("Tom",11));
        people.add(new Person("Smith",10));
        people.add(new Person("Zara",32));

        for (Person p:people){
            System.out.println(p.getName());
        }
*/
        System.out.println();
       /* PersonNameComparotar personC = new PersonNameComparotar();
        TreeSet<Person> people2 = new TreeSet<Person>(personC);
        people2.add(new Person("David",30));
        people2.add(new Person("Queen",32));
        people2.add(new Person("Bekham",31));
        people2.add(new Person("Jhonson",22));

        for (Person p:people2){
            System.out.println(p.getName());
        }*/

        Comparator<Person> pcomparator = new PersonAgeComparotar().thenComparing(new PersonAgeComparotar());
        TreeSet<Person> people3 = new TreeSet<Person>(pcomparator);
        people3.add(new Person("David",30));
        people3.add(new Person("Queen",32));
        people3.add(new Person("Bekham",31));
        people3.add(new Person("Jhonson",22));

        for (Person p:people3){
            System.out.println(p.getName() + "\t" + p.getAge());
        }

    }
}