package Annotation;

public class Test {
    @TestDocument(doTestDocumented = "Hello Doc from ItStep")
    public void doSomeTestDocumented(){
        System.out.println("Test for annotation with 'Documented'");
    }
    @TestNotDocument(doTestNoDocumented = "Hello Doc without annotation")
    public void doSomeTestNotDocumented(){
        System.out.println("Test for annotation without 'Documented'");
    }

}
