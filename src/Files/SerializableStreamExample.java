package Files;

import java.io.*;
import java.lang.annotation.Documented;

public class SerializableStreamExample {
    public static void main(String args[]){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person person = new Person("Maqsat",18,178,false);
            oos.writeObject(person);
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}


class Person2 implements Serializable {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person2(String s, int n, double d, boolean b){
        this.name = s;
        this.age = n;
        this.height = d;
        this.married = b;
    }
    String getName(){return name;}
    int getAge(){return age;}
    double getHeight(){return height;}
    boolean getMarried(){
        return married;
    }
}
