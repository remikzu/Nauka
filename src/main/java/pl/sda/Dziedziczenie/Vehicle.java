package pl.sda.Dziedziczenie;

public class Vehicle {
    public void startEngine() {
        System.out.println("Engine starts. Brum brum brum.");
    }

    protected final int tankCapacity = 60;
    protected int fuelLevel = tankCapacity;

    public void fillTank() {
        int toFill = tankCapacity - fuelLevel;
        fillTank(toFill);
    }

    public void fillTank(int toFill) {
        if (toFill + fuelLevel > tankCapacity) {
            System.out.println("I can't fill tank with " + toFill + " litres.");
        }
        else {
            fuelLevel += toFill;
            System.out.println("I've filled the tank with " + toFill + " litres.");
        }
    }
}

