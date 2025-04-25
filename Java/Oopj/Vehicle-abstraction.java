// Abstract class Vehicle
abstract class Vehicle {
    String name;
    String type;

    // Constructor to initialize the vehicle's name and type
    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void start();
}

// Bike class that extends the abstract class Vehicle
class Bike extends Vehicle {

    // Constructor to initialize Bike-specific attributes and Vehicle superclass attributes
    public Bike(String name, String type) {
        super(name, type);
    }

    // Implement the abstract method from Vehicle class
    public void start() {
        System.out.println("The " + name + " bike is starting.");
    }

    // Static method in Bike class
    public static void bikeInfo() {
        System.out.println("This is a static method in the Bike class.");
    }

    // Non-abstract method in Bike class
    public void stop() {
        System.out.println("The " + name + " bike is stopping.");
    }
}

// Main class to demonstrate abstraction
 class AbstractionDemo {
    public static void main(String[] args) {
        // Creating a Bike object using the subclass constructor
        Bike myBike = new Bike("Yamaha", "Sport");

        // Accessing the abstract method implemented in the Bike class
        myBike.start();

        // Accessing the non-abstract method in the Bike class
        myBike.stop();

        // Accessing the static method in the Bike class
        Bike.bikeInfo();

        // Displaying vehicle details
        System.out.println("Vehicle: " + myBike.name + " of type " + myBike.type);
    }
}
