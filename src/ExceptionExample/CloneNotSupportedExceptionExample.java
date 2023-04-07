package ExceptionExample;

public class CloneNotSupportedExceptionExample {
    public static void main(String[] args){
        Person Jack = new Person("Jack");
        try{
            Jack.clone();
        }
        catch (CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }
    }
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}