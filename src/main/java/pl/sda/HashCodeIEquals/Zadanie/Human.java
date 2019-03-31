package pl.sda.HashCodeIEquals.Zadanie;

import java.util.Objects;

public class Human {

    private String name;
    private int age;
    private String pesel;

    public Human(String name, int age, String pesel) {
        this.name = name;
        this.age = age;
        if (pesel == null)
        {
            throw new IllegalArgumentException ("Everyone has to have pesel number!");
        }
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return pesel.equals(((Human) o).pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pesel);
    }
}
