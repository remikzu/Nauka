package pl.sda.Enum.ZadanieHuman;

public class Human {

    private String name;
    private int age;
    private HairColor hairColor;
    private EyeColor eyeColor;

    public Human(String name, int age, HairColor hairColor, EyeColor eyeColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor=" + hairColor +
                ", eyeColor=" + eyeColor +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }
}
