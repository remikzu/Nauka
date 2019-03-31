package pl.sda.Strumienie.Zadania;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MinElementInCollection {

    private static final List<Integer> lista = Arrays.asList(44, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    private static Optional<Integer> findMinElement (List<Integer> list) {
        Optional<Integer> min = list.stream()
                .reduce((a, b) -> a < b ? a : b);
        return min;
    }

    //inny sposób

    public static <T> Optional<T> min (Collection<T> collection, Comparator<T> comparator) {

        return collection.stream().reduce(BinaryOperator.minBy(comparator));

    }

    public static void main(String[] args) {
        System.out.println(findMinElement(lista));

        List<String> names = Arrays.asList("Marcin", "Marek", "Mariusz", "Marian");

        Optional<String> name = min(names, Comparator.comparingInt(String::length));
        Optional<Integer> nameInteger = min(lista, Comparator.comparingInt(Integer::intValue));
        System.out.println(name);
        System.out.println(nameInteger);

    }

}
