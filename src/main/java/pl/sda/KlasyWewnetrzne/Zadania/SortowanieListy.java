package pl.sda.KlasyWewnetrzne.Zadania;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortowanieListy {

    public static void get5Words () {

        List<String> lista = new LinkedList<>();
        lista.add("ababaa");
        lista.add("acaca");
        lista.add("adaddfs");
        lista.add("aeaefdasdfa");
        lista.add("afaffdasdfasdfasdf");
        printList(lista);
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println();
        printList(lista);

    }

    public static void printList(List<String> lista) {
        for (String slowo : lista) {
            System.out.println(slowo);
        }
    }

    public static void main(String[] args) {
        get5Words();
    }

}
