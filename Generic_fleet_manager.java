package Generic_problem;
import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract String toString();
}

class Truck extends Vehicle {
    public Truck(String registrationNumber) {
        super(registrationNumber);
    }

    public String toString() {
        return "Truck - Reg#: " + getRegistrationNumber();
    }
}

class Bike extends Vehicle {
    public Bike(String registrationNumber) {
        super(registrationNumber);
    }

    public String toString() {
        return "Bike - Reg#: " + getRegistrationNumber();
    }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T vehicle : fleet) {
            System.out.println(vehicle);
        }
    }
}

public class Generic_fleet_manager {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("TRK123"));
        truckFleet.addVehicle(new Truck("TRK456"));

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("BIKE789"));
        bikeFleet.addVehicle(new Bike("BIKE012"));

        System.out.println("Truck Fleet:");
        truckFleet.showFleet();

        System.out.println("\nBike Fleet:");
        bikeFleet.showFleet();
    }
}


