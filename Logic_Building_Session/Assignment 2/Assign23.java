public class Confusion {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 default:
 System.out.println("Default case");
 }
 }
}
/*
/------------------------------------------------------------------------------------------------------/

Assign23.java:1: error: class Confusion is public, should be declared in a file named Confusion.java
public class Confusion {
       ^
1 error

// The reason the default case prints after "Value is 2" is due to the missing break statements in your switch block. If there is no break, the program will "fall through" and continue executing the following case blocks, even if they do not match the value.

Correct code -
 class Confusion {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 default:
 System.out.println("Default case");
 }
 }
} 



*/