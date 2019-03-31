package pl.sda.Interfejsy.Main_Computation_Nauka;

import java.util.Scanner;

public class Main{

    private Scanner sc = new Scanner (System.in);

    private boolean shouldMultiply() {
        System.out.println("Wybierz co chesz zrobić. Wciśnij M jeśli to ma być mnożenie i potwierdź enterem," +
                "w przypadku dodawania wpisz jakąkolwiek inną literę i potwierdź enterem");

        return sc.next().equals("M");
    }

    private double getArgument() {
        System.out.println("Podaj liczby");
        return sc.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }


}