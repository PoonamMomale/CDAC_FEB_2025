public class Main {
 public static int main(String[] args) {
 System.out.println("Hello, World!");
 return 0;
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign3.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {

Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)

//main method is defined with a void return type, it doesn't return any value.

Correct code - 

class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // return 0;
 }
} 
*/