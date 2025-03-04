public class Main {
 public static void main(String[] args) {
 int x = "Hello";
 System.out.println(x);
 }
} 

/*
/------------------------------------------------------------------------------------------------------/

Assign6.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
Assign7.java:3: error: incompatible types: String cannot be converted to int
 int x = "Hello";

//java is statically typed language means type of each variable is known at compile time

Correct code - 

 class Main {
 public static void main(String[] args) {
 String x = "Hello";
 System.out.println(x);
 }
}

*/