public class Main {
 public static void main(String[] args) {
 double num = "Hello";
 System.out.println(num);
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign14.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

Assign14.java:3: error: incompatible types: String cannot be converted to double
 double num = "Hello";
              ^
1 error

// we get an exception because we are trying to access length property on null object

Correct code - 

 class Main {
 public static void main(String[] args) {
 String num = "Hello";
 System.out.println(num);
 }
} 

*/