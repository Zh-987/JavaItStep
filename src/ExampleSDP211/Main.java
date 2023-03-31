package ExampleSDP211;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {  // public, private, protected
    public static void main(String[] args){
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(2023,11, 13);

        double result = sqrt(9);

        out.printf("%f",result);

        out.printf("%f",Math.PI);
        out.println();

        Object Alex = new Person("Alex");
        ((Person) Alex).display();
        out.println();

        Employee Jhon = new Employee("Jhon", "Google");
        Jhon.display();
        out.println();

        Object Saimon = new Client("Saimon","Google",100000000);
        if(Saimon instanceof Client clientSaimon){
            clientSaimon.display();
        }
        else{
            out.println("Converion is invalid");
        }

       /* Client emp = (Client) Saimon;
        emp.display();*/
        out.println();
        Book b = new Book("Робин Гуд. Король разбойников","А. Дюм");
        b.print();
        out.println();
        Journal j = new Journal("Forbes","Forbs Bertly Charles");
        j.print();
        out.println();


        Printable p = new Journal("Forbes2","Forbs Bertly Charles");
        p.print();
        String name = ((Journal)p).getName();
        out.println();

        Printable.read();
        out.println();

      /*  Calculate c = new Calculation();
        out.println(c.sum(5,4));
        out.println(c.sum(5,4,8));
        out.println();*/

        Calculation.Devide algebra = new Algebra();

        algebra.devide();
    }
}

class Math{
    public static final double PI = 3.14;
}
