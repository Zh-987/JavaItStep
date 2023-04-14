package Annotation;

import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface JavaFileInfo {
    String name() default "Zh. A.";
    String value() default "0.0";
}

@Documented
@interface TestDocument{
    String doTestDocumented();
}

@interface TestNotDocument{
    String doTestNoDocumented();
}

/*@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface {

}*/

//Аннотации для аннотации
/*@Target()*/

//Аннотации типов
/*@Retention()
@Documented
@Inherited
@Repeatable()*/


// Аннотации для кода
/*@Override
@Deprecated
@SuppressWarnings()
@SafeVarargs
@FunctionalInterface*/





//Нативные аннотации
//Аннотации которые мы сами создаем

