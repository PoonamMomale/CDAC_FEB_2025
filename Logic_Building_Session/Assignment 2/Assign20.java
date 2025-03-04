
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World")
 }


/*
/------------------------------------------------------------------------------------------------------/

Assign19.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Assign19.java:5)

//every statement must end with a semicolon (;). This marks the end of the statement, signaling to the compiler that the instruction is complete.


Correct code -


class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World");
 }
} 

*/