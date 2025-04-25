// Interface Photosynthesis
interface Photosynthesis {
    void absorbSunlight();
}

// Interface Respiration
interface Respiration {
    void releaseOxygen();
}

// Concrete class Plant implementing both interfaces
class Plant implements Photosynthesis, Respiration {
    private String plantName;

    // Constructor to initialize plant name
    public Plant(String name) {
        this.plantName = name;
    }

    // Method to get the name of the plant
    public String getPlantName() {
        return plantName;
    }

    // Implementing absorbSunlight method from Photosynthesis
    @Override
    public void absorbSunlight() {
        System.out.println("Plant is absorbing sunlight for photosynthesis.");
    }

    // Implementing releaseOxygen method from Respiration
    @Override
    public void releaseOxygen() {
        System.out.println("Plant is releasing oxygen through respiration.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating Plant objects
        Plant mangoTree = new Plant("Mango Tree");
        Plant fern = new Plant("Fern");

        // Testing the Plant functionality
        System.out.println("Plant Name: " + mangoTree.getPlantName());
        mangoTree.absorbSunlight();
        mangoTree.releaseOxygen();

        System.out.println();

        System.out.println("Plant Name: " + fern.getPlantName());
        fern.absorbSunlight();
        fern.releaseOxygen();
    }
}
