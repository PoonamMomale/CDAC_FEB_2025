 public class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 5:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}

/*
/------------------------------------------------------------------------------------------------------/

Assign26.java:1: error: class Switch is public, should be declared in a file named Switch.java
public class Switch {
       ^
Assign26.java:8: error: duplicate case label
 case 5:
 ^
2 errors

// The compiler complains about duplicate case labels because you cannot have two identical case labels within the same switch block. This leads to a compilation error.

Correct code -

 class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 6:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}


*/