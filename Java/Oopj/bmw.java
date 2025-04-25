// Parent class BMW
class BMW {
    public void showDetails() {
        System.out.println("This is a BMW vehicle.");
    }

    public void maxSpeed() {
        System.out.println("Speed varies by model.");
    }
}

// Subclass BMWSeries3
class BMWSeries3 extends BMW {
    @Override
    public void showDetails() {
        System.out.println("This is a BMW Series 3.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed: 240 km/h");
    }
}

// Subclass BMWSeries5
class BMWSeries5 extends BMW {
    @Override
    public void showDetails() {
        System.out.println("This is a BMW Series 5.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed: 260 km/h");
    }
}

// Subclass BMWSeries7
class BMWSeries7 extends BMW {
    @Override
    public void showDetails() {
        System.out.println("This is a BMW Series 7.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed: 300 km/h");
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an array of BMW references
        BMW[] bmwVehicles = new BMW[3];
        bmwVehicles[0] = new BMWSeries3();
        bmwVehicles[1] = new BMWSeries5();
        bmwVehicles[2] = new BMWSeries7();

        // Looping through the array and calling methods
        for (BMW vehicle : bmwVehicles) {
            vehicle.showDetails();
            vehicle.maxSpeed();
            System.out.println();
        }
    }
}
