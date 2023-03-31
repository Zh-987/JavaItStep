package ExampleSDP211;


public class Person { //abstract

    private String name;
/*    */

    public String getName(){
        return name;
    }
    public Person(String name){
        this.name=name;
    }
    public void display(){
        System.out.printf("Employee name: %s \n", name);
    }  //abstract
}

class Employee extends Person{
    private String company;
    public Employee(String name,String company){
        super(name);
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    public void display(){
        System.out.printf("Employee name: %s \n Company name: %s", super.getName(),company);
    }
}

class Client extends Person{
    private int sum;
    private String company;
    public Client(String name,String company, int sum){
        super(name);
        this.company = company;
        this.sum = sum;
    }
    public String getCompany(){
        return company;
    }
    public int Sum(){
        return sum;
    }
    public void display(){
        System.out.printf("Client name: %s \n Company name: %s", super.getName(),company);
    }
}
//Person p = new Person();

interface Printable{
   default void print2() {
       System.out.println("Undefined print");
   }
    void print();

   static void read(){
       System.out.println("Read printable");
   }
   interface Writable{

   }
}

class Book implements Printable{
    String name;
    String author;
    Book( String name,String author){
        this.name = name;
        this.author = author;
    }
    public void print(){
        System.out.printf("%s - %s ", name,author);
    }
}

class Journal implements Printable{
    String name;
    String author;
    Journal( String name,String author){
        this.name = name;
        this.author = author;
    }
    String getName(){
        return name;
    }
    public void print(){
        System.out.printf("%s - %s ", name,author);
    }
}

interface Calculate{
    int Qwerty = 12;
    default int sum(int a, int b){
        return sumAll(a,b);
    }
    default int sum(int a, int b,int c) {
        return sumAll(a, b, c);
    }
    private int sumAll(int... val){
        int result =0;
        for(int i:val){
            result+=i;
        }
        return result;
    }

}

class Calculation extends Person implements Calculate, Printable{
    String name;
    public Calculation(String name){
        super(name);
    }
    public void print(){
        System.out.print("Heeey");
    }
    interface Devide{
        void devide();
    }
}

class Algebra implements Calculation.Devide {
    public void devide(){

    }
}

interface BookPrint extends Printable{
    void write();
}

