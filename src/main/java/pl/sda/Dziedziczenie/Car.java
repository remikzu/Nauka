package pl.sda.Dziedziczenie;

public class Car extends Vehicle {
    public void startEngine() {
        super.startEngine();
        System.out.println("Force driver to fasten seat belts.");
    }
}