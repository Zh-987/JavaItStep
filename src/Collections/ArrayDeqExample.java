package Collections;

import java.util.ArrayDeque;
import java.util.Comparator;

public class ArrayDeqExample {
    public static void main(String args[]){
        ArrayDeque<String> oblasti = new ArrayDeque<String>();

        oblasti.add("Almaty");
        oblasti.addFirst("Zhetisu");
        oblasti.push("Karaganda");
        oblasti.addLast("Akmolinskaya");
        oblasti.add("Taraz");
        oblasti.add("Turkestan");

        String st = oblasti.getFirst();
        System.out.println(st);

        String last = oblasti.getLast();
        System.out.println(last);

        System.out.printf("Queue size %d", oblasti.size());

        while (oblasti.peek() != null){
            System.out.println(oblasti.pop());
        }

        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tomas",14));
        people.addLast(new Person("Margaret",21));

        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}

/*class Person implements Comparable<Person>{
    private String name;
    public Person(String value){
        this.name = value;
    }
    String getName(){
        return name;
    }
    public int compareTo(Person p){
        return name.length() - p.getName().length();
        *//*name.compareTo(p.getName());*//*
    }}*/

class Person {
    private String name;
    private int age;
    public Person(String value, int age){
        this.name = value;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int  getAge(){
        return age;
    }
  }

class PersonNameComparotar implements Comparator<Person>{
public int compare(Person a, Person b){
return a.getName().compareTo(b.getName());
}
}

class PersonAgeComparotar implements Comparator<Person>{
    public int compare(Person a, Person b){
        if(a.getAge()>b.getAge())
            return 1;
        else if (a.getAge()<b.getAge()) {
            return -1;
        }
        else
            return a.getName().compareTo(b.getName());
    }
}

/*
public interface Comparator<E>{
    int compare(T a, T b);
}*/
