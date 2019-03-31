package pl.sda.Strumienie.Nauka;

import java.util.stream.IntStream;

public class LeniweStrumienie {

    public static void main(String[] args) {
        //strumienie przetwarzają elementy dopiero po wykonaniu metody kończącej
        IntStream numbersStream = IntStream.range(0, 8);
        System.out.println("Przed");
        numbersStream = numbersStream.filter(n -> n % 2 == 0);
        System.out.println("W trakcie 1");
        numbersStream = numbersStream.map(n -> {
            System.out.println("> " + n);
            return n;
        });
        System.out.println("W trakcie 2");
        numbersStream = numbersStream.limit(2);
        System.out.println("W trakcie 3");
        numbersStream.forEach(System.out::println);
        System.out.println("Po");
    }
}
