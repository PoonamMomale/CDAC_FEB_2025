public class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = num1 + num2;
 System.out.println(result);
 } 
}

/*
/------------------------------------------------------------------------------------------------------/

Assign15.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
Assign15.java:5: error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
                   ^
2 errors

// the issue is about assigning a double result to an int variable.

Correct code - 

class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 double result = num1 + num2;
 System.out.println(result);
 }
}

*/