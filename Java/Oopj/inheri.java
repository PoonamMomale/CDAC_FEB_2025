class Flower {
	String name;
	String color;
	boolean hasFragrance;
	
	public Flower(String name, String color, boolean hasFragrance) {
		this.name = name;
		this.color = color;
		this.hasFragrance = hasFragrance;
	}
	
	public void displayData() {
		System.out.println("Flower Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Fragrance: "+( hasFragrance ? "Yes" : "No"));
	}
	
}

class Rose extends Flower {
	boolean hasThorns;
	
	Rose(String name, String color, boolean hasFragrance, boolean hasThorns) {
		super(name, color, hasFragrance);
		this.hasThorns = hasThorns;
	}
	
	public void displayData() {
		super.displayData();
		System.out.println("Has Thorns: "+(hasThorns ? "Yes" : "No"));
	}
	
}

class Lily extends Flower {
	boolean isWaterPlant;
	
	Lily(String name, String color, boolean hasFragrance, boolean isWaterPlant) {
		super(name, color, hasFragrance);
		this.isWaterPlant = isWaterPlant;
	}
	
	public void displayData() {
		super.displayData();
		System.out.println("Grows in water: "+(isWaterPlant ? "Yes" : "No"));
	}
}
class Inheri {
	public static void main(String[] args) {
		Rose rose = new Rose("Rose", "Red", true, true);
		Lily lily = new Lily("Lily", "White", true, true);
		
		System.out.println("-----Rose Details-----");
		rose.displayData();
		
		System.out.println("-----Lily Details------");
		lily.displayData();
	}
}