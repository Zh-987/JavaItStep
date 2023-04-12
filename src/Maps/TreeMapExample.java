package Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main (String[] args){
        TreeMap<Integer, String> countries = new TreeMap<Integer,String>();
        countries.put(10,"Canada");
        countries.put(2, "Great Britain");
        countries.put(3, "New Zeland");
        countries.put(14, "Australia");
        countries.put(5, "India");

        String first = countries.get(2);
        System.out.println(first);

        for (Map.Entry<Integer,String> country: countries.entrySet()){
            System.out.printf("Key: %d, Values: %s \n",country.getKey(), country.getValue());
        }

        Set<Integer> keys = countries.keySet();

        Collection<String> values = countries.values();

        Map<Integer,String> afterfive = countries.tailMap(5);
        Map<Integer,String> beforefive = countries.headMap(5);

        Map.Entry<Integer, String> lastelement = countries.lastEntry();

        System.out.printf("Last item has key: %d, value: %s \n",lastelement.getKey(), lastelement.getValue() );

        Map<String, Person> people = new TreeMap<String, Person>();

        people.put("12436ai", new Person("Qanat"));
        people.put("13476oi", new Person("Ivan"));
        people.put("16782os", new Person("Toktar"));
        people.put("19287ps", new Person("Ayan"));

        for (Map.Entry<String,Person> p: people.entrySet()){
            System.out.printf("Key: %s, Values: %s \n",p.getKey(), p.getValue().getName());
        }
    }
}
