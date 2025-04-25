// Employee class to represent employee data
class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;
    private String phone;

    // Constructor to initialize employee data
    public Employee(int id, String name, double salary, String address, String phone) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.phone = phone;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary +
                ", Address: " + address + ", Phone: " + phone);
    }
}

// EmployeeManager class to manage employees
class EmployeeManager {
    private Employee[] employees;  // Array to store employees
    private int count;  // Counter to track the number of employees

    // Constructor to initialize the array with a fixed size (15 employees)
    public EmployeeManager() {
        employees = new Employee[15];
        count = 0;  // Initially no employees
    }

    // Method to insert an employee
    public void insert(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Method to print all employee details
    public void print() {
        for (int i = 0; i < count; i++) {
            employees[i].displayEmployeeDetails();
        }
    }
}

// Main class to test the Employee Management System
class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an instance of EmployeeManager
        EmployeeManager manager = new EmployeeManager();

        // Insert 15 employee records
        manager.insert(new Employee(1, "Alice", 50000, "123 Street, City", "555-1234"));
        manager.insert(new Employee(2, "Bob", 55000, "456 Avenue, City", "555-5678"));
        manager.insert(new Employee(3, "Charlie", 60000, "789 Road, City", "555-8765"));
        manager.insert(new Employee(4, "David", 45000, "101 Blvd, City", "555-4321"));
        manager.insert(new Employee(5, "Eve", 70000, "202 Lane, City", "555-1357"));
        manager.insert(new Employee(6, "Frank", 75000, "303 Crescent, City", "555-2468"));
        manager.insert(new Employee(7, "Grace", 52000, "404 Path, City", "555-3579"));
        manager.insert(new Employee(8, "Hank", 48000, "505 Passage, City", "555-4680"));
        manager.insert(new Employee(9, "Ivy", 51000, "606 Walkway, City", "555-5791"));
        manager.insert(new Employee(10, "Jack", 53000, "707 Trail, City", "555-6802"));
        manager.insert(new Employee(11, "Kim", 54000, "808 Route, City", "555-7913"));
        manager.insert(new Employee(12, "Liam", 62000, "909 Alley, City", "555-8024"));
        manager.insert(new Employee(13, "Mona", 53000, "1010 Loop, City", "555-9135"));
        manager.insert(new Employee(14, "Nina", 65000, "1111 Street, City", "555-0246"));
        manager.insert(new Employee(15, "Oscar", 68000, "1212 Parkway, City", "555-1357"));

        // Print all employee details
        System.out.println("Employee Records:");
        manager.print();
    }
}
