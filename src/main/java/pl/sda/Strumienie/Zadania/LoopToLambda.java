package pl.sda.Strumienie.Zadania;

import pl.sda.Strumienie.Nauka.BoardGame;

import java.util.Comparator;

public class LoopToLambda {

    private static void lambdaVersion () {
        BoardGame bestGame = BoardGame.GAMES
                .stream()
                .filter(x -> x.name.contains("a"))
                .max(Comparator.comparing(x -> x.rating)).get();
        System.out.println(bestGame.name);
    }

    public static void main(String[] args) {

        lambdaVersion();

    }

}
