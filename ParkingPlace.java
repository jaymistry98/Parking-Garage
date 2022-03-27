package project2;

import java.util.ArrayList;

public class ParkingPlace {

    private int lotcapacity;
    private ArrayList<Vehicle> VehiclePark;

    public ParkingPlace() {
        this.lotcapacity = 300;
        this.VehiclePark = new ArrayList<Vehicle>(lotcapacity);
        //This ensures car PArk has one 300 vehicles max

    }

    public ParkingPlace(int lotcapacity) {
        this.lotcapacity = lotcapacity;
        this.VehiclePark = new ArrayList<Vehicle>(lotcapacity);
        //This ensures car PArk has one 300 vehicles max

    }

    public void setLotCapacity(int lotcapacity) {
        this.lotcapacity = lotcapacity;
    }

    // Method to find maximum capacity 
    public int getMaxCapacity() {
        return lotcapacity;
    }

    // Method to find available spots
    public int numOfAvailableSpots() {
        return lotcapacity - VehiclePark.size();
    }

    // Method to find number of occupied spaces
    public int numOfOccupiedSpots() {
        return this.VehiclePark.size();
    }

    //Method to add vehicles 
    public void addVehicles(Vehicle vehicle) {

        if (numOfAvailableSpots() > 0) {
            VehiclePark.add(vehicle);
            vehicle.VehicleDescription();
            System.out.println("---------------- \n");
        } else {
            System.out.println("Car Park is full");
        }

    }
    //Method to print parked vehicle details

    public void printParkedVehiclediscription() {

        for (Vehicle vehicle : VehiclePark) {
            vehicle.VehicleDescription();
            System.out.println("++++++++++++++++ \n");

        }

    }

}
