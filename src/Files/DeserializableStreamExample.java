package Files;

import java.io.*;
import java.util.ArrayList;

public class DeserializableStreamExample {
    public static void main(String args[]){
        String filename = "person.dat";

        ArrayList<Person2> people= new ArrayList<Person2>();
        people.add(new Person2("Dulat",20,180,false));
        people.add(new Person2("Ivan",40,180,true));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }

        ArrayList<Person2> newPeople = new ArrayList<Person2>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))){
           /* Person2 person2 = (Person2) ois.readObject();*/
            newPeople = ((ArrayList<Person2>)ois.readObject());

        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Person2 p : newPeople){
            System.out.printf("Name: %s, Age: %d \n", p.getName(), p.getAge());
        }
    }
}
