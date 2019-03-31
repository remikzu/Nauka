package pl.sda.WyrażeniaLambda.Zadania.KlasaHuman;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class CreateHuman {

    private static Human createHuman() {
        BiFunction<Integer, String, Human> humanCreator = Human::new;

        return humanCreator.apply(25, "Jan");
    }

    public static void main(String[] args) {

        Supplier<Human> createHuman = Human::new; //stworzony dodatkowy konstruktor bezparametrowy
        createHuman.get();
        System.out.println(createHuman.get());

        System.out.println(createHuman());
        System.out.println(createHuman().getAge());
        System.out.println(createHuman().getName());

    }

}
