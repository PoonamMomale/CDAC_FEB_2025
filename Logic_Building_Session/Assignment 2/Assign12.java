class Main {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 break;
 }
 }
}	


/*
/------------------------------------------------------------------------------------------------------/

Assign12.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

// when you try to run above code it will go into an infinite loop bacause the condition will always be true and you can solve this adding 'break' statement

Correct code - 

class Main {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 break;
 }
 }
}	

*/