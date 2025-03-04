public class Main {
 public static void main() {
 System.out.println("Hello, World!");
 } 
}


/*
/------------------------------------------------------------------------------------------------------/

Assign4.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {

Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)

//The String[] args allows the program to accept input when it is executed from the command line

Correct code - 

 class Main {  
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
}

*/