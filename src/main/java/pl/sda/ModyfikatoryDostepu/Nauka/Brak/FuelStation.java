package pl.sda.ModyfikatoryDostepu.Nauka.Brak;

public class FuelStation {

        public void fillUp(Car car) {
            double toFill = Car.FUEL_TANK_CAPACITY - car.fuelLevel;
            System.out.println("Tankuje " + toFill + " litrow.");
            car.fuelLevel = Car.FUEL_TANK_CAPACITY;
        }

}
