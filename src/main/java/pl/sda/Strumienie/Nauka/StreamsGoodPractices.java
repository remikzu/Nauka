package pl.sda.Strumienie.Nauka;

import java.util.stream.IntStream;

public class StreamsGoodPractices {

    public static int timeConsumingTransformation(int number) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int slowNumber = IntStream.range(1950, 2150)
                .filter(n -> n == 2000)
                .map(StreamsGoodPractices::timeConsumingTransformation)
                .sum();
        long finish = System.nanoTime();
        long result = finish - start;

        System.out.println("program wykonal sie w " + result);

        long start2 = System.nanoTime();
        int slowNumber2 = IntStream.range(1950, 2150)
                .map(StreamsGoodPractices::timeConsumingTransformation)
                .filter(n -> n == 2000)
                .sum();
        long finish2 = System.nanoTime();
        long result2 = finish2 - start2;

        System.out.println("program wykonal sie w " + result2);
    }
}
