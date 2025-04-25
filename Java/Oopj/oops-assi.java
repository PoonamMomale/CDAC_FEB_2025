/* Q1. Room Volume Calculation 
Design a class named Room with three data members: height, width, and breadth. Include a method 
volume() to compute and return the volume of the room. Create a separate class RoomDemo that 
creates instances of the Room class and displays the volume for each instance.  */

/*
class Room {
	int height;
	int width;
	int breadth;
	
	Room(int h, int w, int b) {
		this.height = h;
		this.weight = w;
		this.breadth = b;
	}
	
	int volume() {
		return this.height*this.weight*this.breadth;
	}
}
class RoomDemo {
	
	public static void main(String[] args) {
		Room r1 = new Room(20,20,20);
		Room r2 = new Room(3,5,6);
		
		System.out.println("Volume of room 1: "+r1.volume());
	}
}

*/

/*Q2. Student Marks and Average 
Create a class Student with the following members: 
 Name of the student 
 Marks in three subjects 
 A method to assign initial values 
 A method to compute the total and average marks 
 A method to display the student’s name and total marks 
Write a main() method to demonstrate the functionality of the class.  */

/*
class Student {
    String name;
    int marks1, marks2, marks3;

    Student(String n, int m1, int m2, int m3) {
        this.name = n;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    void computeTotalAndAverage() {
        int total = marks1 + marks2 + marks3;
        double average = (double) total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    void displayStudentInfo() {
        int total = marks1 + marks2 + marks3;
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
    }
}

 class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 85, 90, 78);
        student1.displayStudentInfo();
        student1.computeTotalAndAverage();
    }
} 
*/

/*Q3. Box Area and Volume 
Write a class Box with three member variables: height, width, and breadth. Include appropriate 
constructors to initialize these variables. Also, implement two methods: 
 getVolume() to return the volume of the box 
 getArea() to return the surface area of the box 
Create two instances of the Box class and display their volumes and surface areas. */

/*
// Box class definition
class Box {
    double height;
    double width;
    double breadth;

    // Constructor to initialize box dimensions
    Box(double h, double w, double b) {
        height = h;
        width = w;
        breadth = b;
    }

    // Method to calculate box volume
    double getVolume() {
        return height * width * breadth;
    }

    // Method to calculate box surface area
    double getArea() {
        return 2 * (height * width + height * breadth + width * breadth);
    }
}

// Main class with main() method
 class Main {
    public static void main(String[] args) {
        // Create two instances of Box class
        Box box1 = new Box(10, 5, 3);
        Box box2 = new Box(8, 6, 4);

        // Display volume and surface area for each box
        System.out.println("Box 1:");
        System.out.println("Volume: " + box1.getVolume());
        System.out.println("Surface Area: " + box1.getArea());

        System.out.println("\nBox 2:");
        System.out.println("Volume: " + box2.getVolume());
        System.out.println("Surface Area: " + box2.getArea());
    }
}
*/

/*
Q4. Complex Number Operations 
Create a class to represent complex numbers. Include the following constructors: 
1.  A default constructor that sets both real and imaginary parts to 0 
2.  A constructor that initializes the real part only 
3.  A constructor that initializes both real and imaginary parts 
Also, write member functions to: 
 Add two complex numbers 
Multiply two complex numbers 
In the main() method: 
 Create two complex numbers: 3 + 2i and 4 - 2i 
 Display their sum and product */
 
 /*
 class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(real * other.real - imaginary * other.imaginary,
                real * other.imaginary + imaginary * other.real);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

 class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(4, -2);

        System.out.println("Number 1:");
        num1.display();

        System.out.println("Number 2:");
        num2.display();

        System.out.println("Sum:");
        num1.add(num2).display();

        System.out.println("Product:");
        num1.multiply(num2).display();
    }
} */


/*5. BMI Calculator 
Design a Java program to implement a BMI (Body Mass Index) calculator. The program should 
consist of a class named BMICalculator with the following specifications: 
CDAC Mumbai 
Class: BMICalculator 
Fields 
  height (double): To store the height of the person in meters. 
  weight (double): To store the weight of the person in kilograms. 
Constructors 
  A parameterized constructor to initialize the height and weight fields. 
Methods 
  Getter and Setter methods for both height and weight. 
  double calculateBMI(): This method calculates and returns the BMI using the formula: 
BMI=weight(height×height)\text{BMI} = \frac{\text{weight}}{(\text{height} \times 
\text{height})}BMI=(height×height)weight 
Main Program : Write a separate class containing the main() method to 
1.  Create an object of the BMICalculator class. 
2.  Prompt the user to enter their height and weight. 
3.  Use setter methods to assign these values to the object. 
4.  Call the calculateBMI() method to compute the BMI. 
5.  Print the calculated BMI to the console. */

/*
import java.util.Scanner;

class BMICalculator {
    double height;
    double weight;

    BMICalculator(double h, double w) {
        height = h;
        weight = w;
    }

    double calculateBMI() {
        return weight / (height * height);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        BMICalculator bmiCalculator = new BMICalculator(height, weight);
        System.out.println("Your BMI is: " + bmiCalculator.calculateBMI());
    }
}
*/

/*Q6. Electricity Bill Calculation – Java Program 
Design a Java program to calculate the electricity bill for a customer based on the number of units 
consumed. Implement a class named ElectricityBill with the following specifications: 
Class: ElectricityBill 
Instance Variables 
  customerName (String): Name of the customer 
  unitsConsumed (double): Number of electricity units consumed 
  billAmount (double): The calculated bill amount 
Constructor 
  A parameterized constructor to initialize the customerName and unitsConsumed fields. 
Method 
  void calculateBillAmount(): This method calculates the electricity bill amount based on the 
following tariff rules: 
  First 100 units: Rs. 5 per unit 
  Next 200 units (i.e., 101 to 300): Rs. 7 per unit 
  Remaining units (above 300): Rs. 10 per unit 
Main Program 
In the main() method: 
CDAC Mumbai 
1.  Create an object of the ElectricityBill class. 
2.  Set the customerName and unitsConsumed values (can be taken from user input or 
hardcoded). 
3.  Call the calculateBillAmount() method to compute the bill. 
4.  Display the customer's name, units consumed, and final bill amount. */

import java.util.Scanner;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String name, double units) {
        customerName = name;
        unitsConsumed = units;
    }

    void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.next();

        System.out.print("Enter units consumed: ");
        double units = scanner.nextDouble();

        ElectricityBill bill = new ElectricityBill(name, units);
        bill.calculateBillAmount();

        System.out.println("Customer Name: " + bill.customerName);
        System.out.println("Units Consumed: " + bill.unitsConsumed);
        System.out.println("Bill Amount: " + bill.billAmount);
    }
}