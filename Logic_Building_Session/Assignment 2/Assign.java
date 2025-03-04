public class Main {
 public void main(String[] args) {
 System.out.println("Hello, World!");
 }
}
/*
/------------------------------------------------------------------------------------------------------/

Error - Assign.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main { 

Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)
 

Correct code - 

 class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 } 
}

*/