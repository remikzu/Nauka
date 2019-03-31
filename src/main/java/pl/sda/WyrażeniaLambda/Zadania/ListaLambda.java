package pl.sda.WyrażeniaLambda.Zadania;

import java.util.*;

public class ListaLambda {

    private static List<String> makeStringList() {
        List<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String word = sc.next();
            list.add(word);
        }
        return list;
    }

    private static void sortList (List<String> list) {
        list.sort(((o1, o2) -> o1.length() - o2.length()));
    }

    private static void sortListDifferentWay (List<String> list) {
        Collections.sort(list, ((o1, o2) -> o1.compareToIgnoreCase(o2)));
        list.forEach(s -> System.out.println(s));
    }

    private static void showList (List<String> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list = makeStringList();
        sortListDifferentWay(list);
        sortList(list);
        showList(list);

    }

}
