package Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> people = new ArrayList<String>();
        people.add("Bob");
        people.add("Tom");
        people.add("Jhon");
        people.add("Smith");
        people.add("Dan");
        people.add(1,"Alan");
        /*people.trimToSize();*/
       /* people.ensureCapacity(300);*/
        System.out.println(people.get(2));
        people.set(3,"Mike");
        System.out.println();
        System.out.printf("Size of ArrayList = %d", people.size());
        System.out.println();
        System.out.println( people.lastIndexOf("Mike"));
        for(String n: people){
            System.out.println();
            System.out.printf("People -> %s" , n);
        }
        System.out.println();
        if(people.contains("Jhon")){
            System.out.println("Arraylist contains name Jhon");
        }
        else{
            System.out.println("Arraylist not contains name Jhon");
        }
        people.remove("Smith");
        people.remove(1);
        System.out.println("Array :");
        Object[] peopleArray = people.toArray();
        for (Object person: peopleArray){
            System.out.println(person);
        }
    }

}
