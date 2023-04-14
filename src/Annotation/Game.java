package Annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
@interface Game {
    String name() default "Some question....";
    String day();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Games{
    Game[] value();
}