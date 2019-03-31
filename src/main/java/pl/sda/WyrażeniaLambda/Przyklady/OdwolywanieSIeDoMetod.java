package pl.sda.WyrażeniaLambda.Przyklady;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class OdwolywanieSIeDoMetod {

    public static void main(String[] args) {

        Object object = new Object();
        IntSupplier equalsMethodOnObject = object::hashCode;
        System.out.println(equalsMethodOnObject.getAsInt());

        // /\ to jest to samo co to \/

        Object object2 = new Object();
        System.out.println(object.hashCode());

        ToIntFunction<Object> hashCodeMethodOnClass = Object::hashCode;
        Object objInstance = new Object();
        System.out.println(hashCodeMethodOnClass.applyAsInt(objInstance));

        List<Integer> numbers = new ArrayList<>();
        numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // /\ to jest to samo co to \/

        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);

        // i to samo co to \/

        numbers.forEach(System.out::println);

    }

}
