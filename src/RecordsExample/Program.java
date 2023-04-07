package RecordsExample;

import java.io.PrintWriter;

public class Program {
     public static void main(String[] args){
         Person Jack = new Person("Jack","London",50);
         Person Robert = new Person("Robert",51);
         Person Dolgozhitel = new Person("Robert",500);
         System.out.println(Jack.toString());
         System.out.println(Jack.name());
         System.out.println(Jack.age());
         System.out.println(Jack.hashCode());
         System.out.println(Jack.equals(Robert));
         System.out.println(Robert.name());
         System.out.println(Dolgozhitel.toString());
     }
}

record Person(String name, int age) {
    static int minAge;

    static {
        minAge =1;
        System.out.println("Static initiaalizer");
    }

    Person( String firstname, String lastname, int  age){
       /* if(age < 1 || age > 110){
            age = 18;
        }*/
        this(firstname + " " + lastname, age);
    /*    this.name = name;
        this.age = age;*/
    }
    public String name(){
        return "mr " + name;
    }

    public String toString(){
        return String.format("Person %s, age: %d", name,age);
    }
} // конструктор канонический