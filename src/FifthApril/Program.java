package FifthApril;

public class Program {
    public static void main(String[] args) /*throws CloneNotSupportedException*/ {
        try {

            Person dan = new Person("Dan", "Not to smoking");
            System.out.print(dan.toString());

            Person tom = dan.clone();
            tom.setRestrictions("Not to Drink");

            System.out.print(dan.getRestrictions());
            System.out.print(tom.getRestrictions());

          /*  Person tom = dan.clone();
            tom.setName("Tom");
            tom.setRestrictions("Not to drink");
            tom.toString();
            dan.toString();*/
        }
        catch(CloneNotSupportedException ex){
            System.out.println("Clonable not implemented");
        }
    }
}


