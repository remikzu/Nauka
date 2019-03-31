package pl.sda.WyrażeniaLambda.Zadania;

import java.util.Objects;
import java.util.function.*;

public class ObjectEquals {

    private int age;

    private ObjectEquals(int age) {
        age = this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectEquals that = (ObjectEquals) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public static void main(String[] args) {

        Supplier objectCreator = Object::new;
        System.out.println(objectCreator);

        BiPredicate<Object, Object> getObjectEqualsFromClass = Object::equals;
        System.out.println(getObjectEqualsFromClass.test(objectCreator, new Object()));

        Predicate<Object> getObjectEqualsFromMethod = objectCreator::equals;
        System.out.println(getObjectEqualsFromMethod.test(new Object()));
    }

}
