package project2;

public class Vehicle {

    private String companyName;
    private String model;
    private VehicleType type;
    private String LicenseNumber; 

    // Regular constructor
    public Vehicle(VehicleType type, String companyName, String model, String LicenseNumber) {
        this.type = type;
        this.companyName = companyName;
        this.model = model;  
        this.LicenseNumber = LicenseNumber;
    }
    //We can't use Copy Method & Constructor because a vehicle cannot have same license number
 
//getters
    public String getCompanyName(){
        return companyName;
    }
    
    public String getModel() {
        return model;
    }

    public VehicleType getVehicleType() {
        return type;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    //setters
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public void setVehicleType(VehicleType type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    //EqualsMethod
    public boolean equals(Vehicle x) {
        return (companyName.equalsIgnoreCase(x.companyName) && type.equals(x.type)
                && model.equalsIgnoreCase(x.model) 
                && LicenseNumber.equalsIgnoreCase(x.LicenseNumber));
    }
    
    @Override
    public String toString() {
        String str = "Company: " + companyName + "\nModel: " + model + "\nVehicleType: "
                     + type + "\nLicenseNumber: " + LicenseNumber;
        return str;
    }
    
    public Void VehicleDescription(){
        
        String str = "Company: " + companyName + "\nModel: " + model + "\nLicenseNumber: " + LicenseNumber;
        if (type.equals(VehicleType.Car)) {
            System.out.println("Vehicle Type: Car \n" + str);
        }
        else if (type.equals(VehicleType.Bus)) {
            System.out.println("Vehicle Type: Bus \n" + str);
        }
        else if (type.equals(VehicleType.Bike)) {
            System.out.println("Vehicle Type: Bike \n" + str);
        }
        return null;
    }
    
}
