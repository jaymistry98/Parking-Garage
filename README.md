# Parking-Garage

You have recently been thinking of going into business. It has always been your dream to own a parking lot in the city. You recently went and bought a very large underground facility and are almost ready for opening day! 

● Design a program that models a parking lot. 

● You should have the relevant data structures (more than one perhaps depending if they park their car or an attendant does, etc.). You can use collections, but you must also create your own generic class and create your own data structure. 

● You should be able to do things like sort data (you should write your own sorting methods, use comparators and iterators). 

● This should be a real world design, so think of all the possibilities and how you would deal with them. 

● Include a doc that explains your design (and obviously comment your code). 

● At least 8 objects should be implemented and run in main. Make sure to put in data. You will also need to analyze the cars coming into your lot, simulating some of the process 

● Extra credit: If you like you can use lambdas and streams to analyze your information a bit



/*---------------------------------DESIGN EXPLANATION-------------------------------------------------*/

This program is composed of 5 classes which is the “Vehicle” that is extended by “Truck”, “Car”, and “Bike”, and have “ “ParkingPlace” class as a placeholder for the other classes.

Vehicle: 

Is the super class that holds all the details of the basic understanding of what a vehicle has and stores the user detail input of the vehicle. 



VehicleType:

It is a Java Enum that helps to organize and identifies the vehicles and which type they belong to between 3 listed: Car, Bike, Bus.



ParkingPlace: 

A class that takes count of how many parking spaces are left as more cars come in and park by having an initial capacity stored. When that capacity is full the class will stop adding more vehicles. Also this class helps print out a detailed description of the vehicle after parking it in the garage. We Can also set the Capacity by using setters.



Bus:

Bus class is extended to Vehicle class that use the VehiclesType enum (VehicleType.Bus) to identify the type of vehicle entering the parking lot, and help report details of that specific Bus. Which are the company name, model, and LicenseNumber.



Car:

Car class is extended to Vehicle class that uses the Vehicle type enum (VehicleType.Car) which helps us to directly identify the vehicle that are Cars and also helps to provide details as a bike and car (Company, Model, LicenseNumber).



Bike:

Bike class is extended to Vehicle class that uses the Vehicle type enum (VehicleType.Bike) which helps us to directly identify the vehicle that are bikes and helps report the similar details as a bus and car (Company, Model, LicenseNumber).