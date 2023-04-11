package Collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        TreeSet<String> countries = new TreeSet<String>();
        countries.add("Egypt");
        countries.add("Turkey");
        countries.add("Jordan");
        countries.add("OAE");

        System.out.printf(" Tree set size %d", countries.size());
        countries.remove("Jordan");
        for (String country: countries){
            System.out.println(country);
        }
    }
}