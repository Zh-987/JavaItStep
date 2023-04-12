package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main (String[] args){
        Map<Integer, String> countries = new HashMap<Integer,String>();
        countries.put(1,"Mexico");
        countries.put(2,"Bangladesh");
        countries.put(4,"Japan");
        countries.put(3,"Argentina");


        String first = countries.get(2);
        System.out.println(first);

        Set<Integer> keys = countries.keySet();
        Collection<String> values = countries.values();

        countries.replace(2,"Spain");
        countries.remove(1);
        System.out.println();
        for (Map.Entry<Integer,String> country: countries.entrySet()){
            System.out.printf("Key: %d, Values: %s \n",country.getKey(), country.getValue());
        }
        System.out.println();
        Map<String,Person> people = new HashMap<String,Person>();
        people.put("12436ai", new Person("Qanat"));
        people.put("13476oi", new Person("Ivan"));
        people.put("16782os", new Person("Toktar"));
        people.put("19287ps", new Person("Ayan"));

        for (Map.Entry<String,Person> p: people.entrySet()){
            System.out.printf("Key: %s, Values: %s \n",p.getKey(), p.getValue().getName());
        }

    }
}

class Person {
    private String name;
    public Person(String value){
        this.name = value;
    }
    String getName(){
        return name;
    }
}
