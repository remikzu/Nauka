package pl.sda.Strumienie.Nauka;

import java.util.*;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StatefullOperation {

    private final Set<Integer> seen = new HashSet<>();

    private int modify(int number) {
        if (seen.contains(number)) {
            return number;
        }
        seen.add(number);
        return 0;
    }

    private static void showExample() {
        for (int i = 0; i < 3; i++) {
            Stream<Integer> numbers = Stream.of(1, 2, 3, 1, 2, 3, 1, 2, 3);
            StatefullOperation requriements = new StatefullOperation();
            int sum = numbers.parallel()
                    .map(requriements::modify)
                    .mapToInt(n -> n.intValue()).sum();
            System.out.println(sum);
        }
    }

    private static void showExample2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        // GENERUJE BŁĄD ConcurrentModificationException ponieważ zmieniane jest źródło w strumieniu!
        numbers.stream()
                .map(v -> numbers.add(v) ? 1 : 0)
                .forEach(System.out::println);
    }

    private static void tworzenieStrumieniPrzyklady() {
        //tworzenie strumienia na podstawie kolekcji
        Stream<Integer> stream1 = new LinkedList<Integer>().stream();
        //tworzenie strumienia na podstawie tablicy
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{});
        //tworzenie strumienia na podstawie łańcucha znaków rozdzielonego wyrażeniami regularnymi
        Stream<String> stream3 = Pattern.compile(".").splitAsStream("some longer sentence");
        //strumien z typów prostych
        IntStream intStream = IntStream.range(1, 20);
        DoubleStream doubleStream = DoubleStream.of(15, 1, 23, 4, 5, 6);
        LongStream longStream = LongStream.generate(() -> 1L);
        //strumien danych losowych
        Supplier<Random> randomSupplier = Random::new;
        IntStream randomIntStream = randomSupplier.get().ints(10, 1, 30);
        IntStream randomIntStream22 = randomSupplier.get().ints(10, 1, 30);
        DoubleStream randomDoubleStream = randomSupplier.get().doubles(10, 1, 10);
        LongStream randomLongStream = randomSupplier.get().longs();
        //pusty strumien
        Stream.empty();
        //strumien danych z pliku
//        try {
//            Stream<String> lines = new BufferedReader(new FileReader("file.txt")).lines();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        randomIntStream
                .forEach(x1 -> System.out.println(x1 + " "));
        System.out.println();
        randomIntStream22
                .sequential()
                .filter(x -> x > 0 && x < 100)
                .forEach(x1 -> System.out.println(x1 + " "));
        System.out.println();
        randomDoubleStream
                .filter(x -> x > 0 && x < 15)
                .forEach(x -> System.out.println(x));

    }

    public static void main(String[] args) {

//        showExample2(); // generuje błąd
        tworzenieStrumieniPrzyklady();

    }
}