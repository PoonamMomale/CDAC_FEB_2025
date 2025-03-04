 pblic class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4;
 System.out.println(result);
 }
} 

/*
/------------------------------------------------------------------------------------------------------/

Assign16.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^

// both num and 4 are integers, Java performs integer division. 

Correct code - 

 class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4;
 System.out.println(result);
 }
} 

*/