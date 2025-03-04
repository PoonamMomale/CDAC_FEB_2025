public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a + b * 2;
 System.out.println(result);
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign18.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

// multiplication (*) has higher precedence than addition (+), so b * 2 is computed first, and then the result is added to a


Correct code -

class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a + b * 2;
 System.out.println(result);
 }
} 


*/