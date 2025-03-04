public class Main {
 public static void main(String[] args) {
 System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign5.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {

Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)

//JVM will only run the main(String[] args) method when the program is run.

Correct code - 

  class Main {
 public static void main(String[] args) {
 System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }
} 


*/