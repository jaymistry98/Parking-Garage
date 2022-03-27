package project2;

public class Project2 {

    public static void main(String[] args) {

        Car Car1 = new Car(VehicleType.Car, "Tesla", "S", "NYS234");
        Car Car2 = new Car(VehicleType.Car, "Tesla", "3", "KDR785");
        Car Car3 = new Car(VehicleType.Car, "Tesla", "X", "MJF245");
        Car Car4 = new Car(VehicleType.Car, "Tesla", "Y", "JFK906");
        Vehicle Car5 = new Car(VehicleType.Car, "Ford", "Mustang", "BRX102");

        Bus Bus1 = new Bus(VehicleType.Bus, "MEGABUS", "-", "MHY163");
        Bus Bus2 = new Bus(VehicleType.Bus, "NJTransit", "-", "LIK245");

        Bike Bike1 = new Bike(VehicleType.Car, "Suzuki", "N", "RTF684");
        Bike Bike2 = new Bike(VehicleType.Car, "BMW", "F900", "FTY245");

        Vehicle Vehicle1 = new Vehicle(VehicleType.Bike, "Unknown", "-", "AGS548");

        ParkingPlace Park = new ParkingPlace(100); //Change the capacity to 3 to check if it says the parking is full.

        //Parking Vehicles
        //Park.addVehicles();
        Park.addVehicles(Car1);
        Park.addVehicles(Car2);
        Park.addVehicles(Car3);
        Park.addVehicles(Car4);
        Park.addVehicles(Car5);
        Park.addVehicles(Bus1);
        Park.addVehicles(Bus2);
        Park.addVehicles(Bike1);
        Park.addVehicles(Bike2);
        Park.addVehicles(Vehicle1);

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
        }

        // Comment some of the above to see if it works
        System.out.println(" Number of parked vehicles: " + Park.numOfOccupiedSpots());

        System.out.println(" Number of Available parking Spots: " + Park.numOfAvailableSpots());

        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
        }

        // Printing details
        System.out.println("====================\n");
        System.out.println("List of All Parked Vehicles : ");
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
        }

        Park.printParkedVehiclediscription();

        //To Check some of the Methods
        System.out.println(Car1.toString());
        System.out.println("");
        System.out.println(Car2.equals(Car1));
        Car3.setCompanyName("Honda");
        System.out.println(Car3.getCompanyName());
        Park.setLotCapacity(200);
        System.out.println(Park.getMaxCapacity());

    }

}
