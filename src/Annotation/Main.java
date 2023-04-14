package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException{
        Class<Demonstartion> demonstartionClass = Demonstartion.class;
        readAnnotation(demonstartionClass);

        Method method = demonstartionClass.getMethod("printString");
        readAnnotation(method);
    }
     static void readAnnotation(AnnotatedElement element){
        try {
            System.out.println("\n Search Annotations" + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for(Annotation annotation : annotations){
                if(annotation instanceof JavaFileInfo fileInfo){
                    System.out.println("Author:"+fileInfo.name());
                    System.out.println("Version:"+fileInfo.value());
                }
            }
        }
         catch (Exception ex){
            ex.printStackTrace();
         }

     }
}
