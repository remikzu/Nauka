package pl.sda.HashCodeIEquals.Zadanie;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Jan", 26, "1234");
        Human human2 = new Human("Jan", 26, "4321");
        Human human3 = new Human("Michał", 25, "1596");

        System.out.println(human1.equals(human2));
        System.out.println(human1.equals(human3));
        System.out.println(human2.equals(human1));

    }

}
