package pl.sda.Adnotacje.Zadanie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyDocumentation {
String author() default "Remigiusz Zudzin";
String comment() default "Przykładowy komentarz";
}
