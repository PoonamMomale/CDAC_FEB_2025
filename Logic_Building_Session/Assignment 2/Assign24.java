 public class MissingBreakCase {
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
}

/*
/------------------------------------------------------------------------------------------------------/

Assign24.java:1: error: class MissingBreakCase is public, should be declared in a file named MissingBreakCase.java
 public class MissingBreakCase {
        ^
1 error

// The reason the code prints "Level 1", "Level 2", "Level 3", and "Unknown level" when level is 1 is because there are no break statements in the switch block. This leads to fall-through behavior, where the program continues to execute subsequent case statements even if they do not match the value of level.

Correct code -

   class MissingBreakCase {
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
}



*/