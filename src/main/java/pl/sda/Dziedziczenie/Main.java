package pl.sda.Dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        car.startEngine();
        System.out.println();
        vehicle.startEngine();

    }
}
