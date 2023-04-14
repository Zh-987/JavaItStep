package Annotation;

import java.lang.annotation.Annotation;

public class MainForInheritedExample {
    public static void main(String[] args) {
        ParentforInheritedExample parent = new ParentforInheritedExample();
        ChieldInherited child = new ChieldInherited();

        if(parent.getClass().getAnnotations().length > 0){
            System.out.println("For class 'Parent' we can implement this annotations: ");
            for (Annotation annotationName:parent.getClass().getAnnotations()){
                System.out.println(annotationName);
            }
        }
        else {
            System.out.println("For class 'Parent' we can`t implement no one annotation: ");
        }
        if (child.getClass().getAnnotations().length > 0){
            System.out.println("For class 'Child' we can implement this annotations: ");
            for (Annotation annotationName:child.getClass().getAnnotations()){
                System.out.println(annotationName);
            }
        }
        else {
            System.out.println("For class 'Child' we can`t implement no one annotation: ");
        }

        }
    }

