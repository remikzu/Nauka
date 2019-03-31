package pl.sda.Kolekcje.Nauka.Sety;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    public static void main(String[] args) {

        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Marcin");
        setWithNames.add("Marek");
        setWithNames.add("Marcin");

        Set<String> otherSet = new HashSet<>();
        otherSet.add("Zenon");
        otherSet.add("Marek");

        setWithNames.addAll(otherSet);

        System.out.println(setWithNames.isEmpty());
        System.out.println(setWithNames.size());
        System.out.println(setWithNames.contains("Marcin"));
        System.out.println(setWithNames.remove("Janusz"));
        System.out.println(setWithNames.toString());

        Set<String> sampleSet = new HashSet<>();
        sampleSet.addAll(setWithNames);
        sampleSet.add("Marcin");
        sampleSet.add("Adela");
        sampleSet.add("Marek");
        sampleSet.add("Magda");

        System.out.println("Iterowanie po zbiorze");
        for(String item : sampleSet) {
            System.out.println(item);
        }

    }

}
