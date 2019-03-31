package pl.sda.Kolekcje.Nauka.Listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {

        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Remigiusz");
        listWithNames.add("Krzysztof");
        System.out.println(listWithNames.toString());
        System.out.println(((LinkedList<String>) listWithNames).pollFirst());
        System.out.println(listWithNames.toString());

        List<String> otherListWithNames = new ArrayList<>();
        otherListWithNames.add("Marek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Marek");

        System.out.println(otherListWithNames.contains("Marek"));
        System.out.println(otherListWithNames.get(0));
        System.out.println(otherListWithNames.isEmpty());
        System.out.println(otherListWithNames.indexOf("Marek"));
        System.out.println(otherListWithNames.lastIndexOf("Marek"));
        System.out.println(otherListWithNames.toString());

        List<String> sampleList = new ArrayList<>();
        sampleList.add("Marcin");
        sampleList.add("Adela");
        sampleList.add("Marek");
        sampleList.add("Magda");

        System.out.println("Iterowanie po liscie (foreach)");
        for(String item : sampleList) {
            System.out.println(item);
        }

        System.out.println("Iterowanie po liscie (for)");
        for(int index = 0; index < sampleList.size(); index++) {
            System.out.println(sampleList.get(index));
        }
    }


}
