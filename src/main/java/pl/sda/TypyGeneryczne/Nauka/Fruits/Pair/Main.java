package pl.sda.TypyGeneryczne.Nauka.Fruits.Pair;

import pl.sda.TypyGeneryczne.Nauka.Fruits.Apple.Apple;
import pl.sda.TypyGeneryczne.Nauka.Fruits.BoxOnSteroids;
import pl.sda.TypyGeneryczne.Nauka.Fruits.Orange.Orange;

public class Main {

    public static void main(String[] args) {

        Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOfBoxes =
                new Pair<>(
                        new BoxOnSteroids<>(new Orange()),
                        new BoxOnSteroids<>(new Apple())
                );

        System.out.println(pairOfBoxes.getFirst());
        System.out.println(pairOfBoxes.getSecond());

    }

}
