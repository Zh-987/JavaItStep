package Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface JavaFileInfo {
    String name() default "Zh. A.";
    String value() default "0.0";
}
