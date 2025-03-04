public class Main {
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign21.java:2: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

Assign22.java:3: error: illegal start of expression
 static void displayMessage() {
 ^
1 error

// The method displayMessage is incorrectly declared inside the main method. Java does not allow methods to be nested within other methods.

Correct code -

 class Main {

 static void displayMessage() {
 System.out.println("Message");
 }

 public static void main(String[] args) {
	displayMessage();
 } 
}


*/