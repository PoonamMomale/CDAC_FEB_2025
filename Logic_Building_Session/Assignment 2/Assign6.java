 class Main {
 public static void main(String[] args) {
 int y = 0;
 int x = y + 10;
 System.out.println(x);
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign6.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
Assign6.java:3: error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main

Assign6.java:4: error: variable y might not have been initialized
 int x = y + 10;


Correct code - 

 class Main {
 public static void main(String[] args) {
 int y = 0;
 int x = y + 10;
 System.out.println(x);
 }
} 

*/