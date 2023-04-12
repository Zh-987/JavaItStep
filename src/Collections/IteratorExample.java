package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String args[]){

        /*ListIterator<String>*/

        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Kazakhstan");
        countries.add("Kyrgyzstan");
        countries.add("Uzbekistan");
        countries.add("Tajikistan");

       /* Iterator<String> i = countries.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }*/

        System.out.println();
        ListIterator<String> i = countries.listIterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        i.set("Turkmenistan");

        while (i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}

