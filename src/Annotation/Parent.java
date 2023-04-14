package Annotation;

public class Parent implements Mark {

}

class Child extends Parent {}

class Program{
    public static void main(String[] args){
       Parent p = new Parent();
       Child c = new Child();

       testInterface(p);
       testInterface(c);
       System.out.println();
       /*testAnnotation(p);
       testAnnotation(c);
*/
    }
    static void testInterface(Mark marketObj){
        System.out.println("Method 'TestInterface' successfully finished !");
    }
    /*static void testAnnotation(Object object){
        if(!object.getClass().isAnnotationPresent(MyAnnotation.class)){
            throw new RuntimeException("Object no annotiated by annotation 'MyAnnotation'");
        }
        System.out.println("Method 'TestAnnotation' successfully finished !");
    }*/
}
