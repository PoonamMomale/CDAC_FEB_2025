// Abstract class Shape
abstract class Shape {
    protected String shapeName;

    // Constructor to initialize shapeName
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Method to return shape name
    public String getShapeName() {
        return shapeName;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Concrete class Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius and shapeName
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Implementing calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of circle: πr^2
    }
}

// Concrete class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length, width, and shapeName
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Implementing calculateArea method
    @Override
    public double calculateArea() {
        return length * width; // Area of rectangle: length * width
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating a Circle object with radius 5.0
        Shape circle = new Circle(5.0);
        System.out.println("Shape: " + circle.getShapeName() + ", Area: " + circle.calculateArea());

        // Creating a Rectangle object with length 4.0 and width 6.0
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Shape: " + rectangle.getShapeName() + ", Area: " + rectangle.calculateArea());
    }
}
