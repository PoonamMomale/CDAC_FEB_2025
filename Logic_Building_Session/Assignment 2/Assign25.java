public class Switch {
 public static void main(String[] args) {
 double score = 85.0;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
}

/*
/------------------------------------------------------------------------------------------------------/

Assign25.java:1: error: class MissingBreakCase is public, should be declared in a file named MissingBreakCase.java
 public class MissingBreakCase {
        ^
1 error

Assign25.java:4: error: incompatible types: possible lossy conversion from double to int
 switch(score) {
       ^
1 error

// The code does not compile because the switch statement in Java does not allow floating-point types (like double) for the switch expression. Specifically, double values cannot be used in a switch expression.

Correct code -

class Switch {
 public static void main(String[] args) {
 int score = 85;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
}


*/