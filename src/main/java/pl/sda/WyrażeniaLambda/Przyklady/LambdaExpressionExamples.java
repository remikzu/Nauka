package pl.sda.WyrażeniaLambda.Przyklady;

import jdk.management.resource.ResourceId;

import java.util.function.*;

public class LambdaExpressionExamples {

    private String nickname;

    @FunctionalInterface
    public interface Checker<T> {
        boolean check(T object);
    }

    static Checker<Integer> isOddAnonymous = new Checker<Integer>() {
        @Override
        public boolean check(Integer object) {
            return object % 2 != 0;
        }
    };

    public LambdaExpressionExamples(String nickname) {
        this.nickname = nickname;
    }

    static Checker<Integer> isOddLambda = object -> object % 2 != 0;

    public static void main(String[] args) {
        ResourceId resourceId = () -> "some return value";
        BiConsumer<Integer, Integer> integerIntegerBiConsumer = (Integer x, Integer y) -> System.out.println(x * y);
        DoubleToIntFunction doubleToIntFunction = (DoubleToIntFunction) x -> Math.toIntExact((long) (x * x));

        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));
        System.out.println(isOddLambda.check(123));
        System.out.println(isOddLambda.check(124));

        UnaryOperator<Integer> square = x -> x * x;
        Supplier<String> someString = () -> "say something";
        Function<Integer, Long> someFunction = x -> {
            if (x != null && x % 2 == 0) {
                return (long) x * x;
            } else {
                return 123L;
            }
        };
        Predicate<Integer> check = x -> x % 2 != 0;


        System.out.println(square.apply(2));
        System.out.println(someString.get());
        System.out.println(someFunction.apply(123));
        LambdaExpressionExamples something = new LambdaExpressionExamples("something");
        Supplier<LambdaExpressionExamples> somelol = () -> new LambdaExpressionExamples("cokolwiek");
        System.out.println(somelol.get().nickname.length());


    }


}
