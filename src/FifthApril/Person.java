package FifthApril;


public class Person implements Cloneable{
    private String name;
    private Restrictions restrictions;

    Person(String name, String restrictions){
        this.restrictions = new Restrictions(restrictions);
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    void setRestrictions(String rest){
         restrictions.setRestrictions(rest);

    }

    public String getRestrictions(){
        return  restrictions.getRestrictions();

    }
    public String toString(){
        return "Person: " + name + " has a restriction as "+restrictions.getRestrictions() ;
    }

    public Person clone() throws CloneNotSupportedException{
        Person newPerson = (Person) super.clone();
        newPerson.restrictions = (Restrictions) restrictions.clone();
        return newPerson;
    }

}

class Restrictions{
    private String name;
    public void setRestrictions(String name){
        this.name = name;
    }
    public String getRestrictions(){
        return name;
    }
    public Restrictions(String name){
        this.name = name;
    }

    public Restrictions clone() throws CloneNotSupportedException{
        Restrictions newrestriction = new Restrictions(new String(this.name));
        return newrestriction;
    }
}

record PersonC(String name, String restrictions){

}