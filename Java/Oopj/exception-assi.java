/*Q1. Electricity Bill Calculation with Exception Handling 
Design a Java program to calculate the electricity bill for a customer, including exception 
handling for invalid input values. Implement a class named ElectricityBill with the following 
specifications: 
Class: ElectricityBill 
Instance Variables 
  customerName (String): Name of the customer 
  unitsConsumed (double): Number of electricity units consumed 
  billAmount (double): The calculated bill amount 
Constructor 
  A parameterized constructor to initialize the customerName and unitsConsumed 
fields. 
 Throw an IllegalArgumentException if unitsConsumed is negative. 
Method 
  void calculateBillAmount(): This method calculates the electricity bill based on the 
following rules: 
  First 100 units: Rs. 5 per unit 
 Next 200 units (101–300): Rs. 7 per unit 
 Above 300 units: Rs. 10 per unit 
Main Program 
In the main() method: 
1.  Prompt the user to enter the customer’s name and units consumed. 
2.  Use try-catch blocks to handle the following scenarios: 
○  Catch InputMismatchException if the user enters non-numeric data for units. 
○  Catch IllegalArgumentException if a negative value is entered for units. 
3.  If the input is valid, create an object of the ElectricityBill class, compute the bill using 
calculateBillAmount(), and print the customer’s name, units consumed, and the total 
bill amount. */

/*
import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String name, double units) {
        if (units < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
        customerName = name;
        unitsConsumed = units;
    }

    void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = 500 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 500 + 1400 + (unitsConsumed - 300) * 10;
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter customer name: ");
                String name = scanner.next();

                System.out.print("Enter units consumed: ");
                double units = scanner.nextDouble();

                ElectricityBill bill = new ElectricityBill(name, units);
                bill.calculateBillAmount();

                System.out.println("Customer Name: " + bill.customerName);
                System.out.println("Units Consumed: " + bill.unitsConsumed);
                System.out.println("Bill Amount: " + bill.billAmount);

                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
*/

/* Q2. Student Marks and Grade Calculation with Exception Handling 
Design a Java program to calculate the total marks, average, and grade of a student, with 
proper exception handling for invalid inputs. Implement a class named Student with the 
following specifications: 
Class: Student 
Instance Variables 
  name (String): Name of the student 
  rollNo (int): Roll number of the student 
  marks (double array of size 5): Marks obtained in 5 subjects 
  average (double): Average marks 
  grade (char): Grade based on average 
Constructor 
  A parameterized constructor to initialize the name, rollNo, and marks. 
  Throw an IllegalArgumentException if any mark is negative or greater than 100. 
Methods 
  void calculateAverage(): Computes the average of marks. 
  void calculateGrade(): Assigns grade based on the average as per the following 
criteria: 
  A: average ≥ 90 
  B: 80 ≤ average < 90 
  C: 70 ≤ average < 80 
  D: 60 ≤ average < 70 
  F: average < 60 
 void displayStudentInfo(): Displays the student’s name, roll number, marks, average, 
and grade. 
Main Program 
In the main() method: 
1.  Prompt the user to input student details and marks for 5 subjects. 
2.  Use a try-catch block to handle the following: 
○  InputMismatchException for non-numeric input 
○  IllegalArgumentException for invalid mark entries (e.g., < 0 or > 100) 
3.  Create a Student object, calculate average and grade, and display the full information.*/

import java.util.Scanner;
import java.util.*;

class Student {
    String name;
    int rollNo;
    double[] marks;
    double average;
    char grade;

    Student(String n, int r, double[] m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void calculateAverageAndGrade() {
        double sum = 0;
        for (double mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Mark must be between 0 and 100.");
            }
            sum += mark;
        }
        average = sum / marks.length;
        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        double[] marks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        Student student = new Student(name, rollNo, marks);
        student.calculateAverageAndGrade();
        student.displayStudentInfo();
    }
}