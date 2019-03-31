package pl.sda.Enum.ZadanieHuman;

public class Main {

    static Human human1 = new Human("Jan", 25, HairColor.black, EyeColor.blue);
    static Human human2 = new Human("Antoni", 50, HairColor.violet, EyeColor.blue);

    public static void main(String[] args) {

        Human human3 = new Human("Kasia", 24, HairColor.blonde, EyeColor.blue);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human3.getName());

    }

}
