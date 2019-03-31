package pl.sda.Kolekcje.Zadania;

import java.util.*;

public class Zadania {


    private static Scanner sc = new Scanner(System.in);

    private static void getNames() {
        Set<String> set = new HashSet<>();
        System.out.println("Podaj imiona:");

        while (!sc.hasNext("-")) {
            String name = sc.next();
            set.add(name);
        }

        System.out.println(set.toString());
    }

    private static void menu() {
        System.out.println("Wybierz co chcesz zrobić:");
        System.out.println("1. Wpisz parę");
        System.out.println("2. Sprawdź parę");
        System.out.println("3. Wyjście z programu");
    }

    private static void nextMenu() {
        System.out.println("Wybierz co chcesz zrobić:");
        System.out.println("1. Wpisz kolejną parę");
        System.out.println("2. Sprawdź parę");
        System.out.println("3. Wyjście z programu");
    }

    private static void hello() {
        System.out.println("Witaj w programie do sprawdzania par!");
    }

    private static void getPairs() {

        Map<String, String> mapa = new HashMap<>();
        hello();
        menu();
        int choice = 0;
        while (choice != 3) {
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Podaj imię pierwszej osoby z pary:");
                    String firstName = sc.next();
                    System.out.println("Podaj imie drugiej osoby z pary:");
                    String secondName = sc.next();
                    mapa.put(firstName, secondName);
                    nextMenu();
                }
                break;
                case 2: {
                    System.out.println("Podaj imię jednej osoby z pary, a ja podam Tobie odpowiadającą osobę!");
                    String name = sc.next();
                    if (mapa.containsKey(name) || mapa.containsValue(name)) {
                        for (Map.Entry<String, String> entry : mapa.entrySet()) {
                            if (entry.getKey().equals(name)) {
                                System.out.println("Twoim partnerem/partnerką jest: " + entry.getValue());
                            } else if (entry.getValue().equals(name)) {
                                System.out.println("Twoim partnerem/partnerką jest: " + entry.getKey());
                            }
                        }
                    } else {
                        System.out.println("Nie ma takiej pary!");
                    }
                    nextMenu();
                } break;
                case 3: {
                    System.out.println("Wyszedłeś z programu!");
                    System.exit(0);
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
//        getNames();
        getPairs();
        int[] intArray = new int[10];
        List<String> lista2 = new ArrayList<>();
    }
}
