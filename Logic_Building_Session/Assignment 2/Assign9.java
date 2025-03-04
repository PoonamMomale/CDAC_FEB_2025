public class Main {
 public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign9.java:3: error: not a statement
 int class = 10;
 ^
Assign9.java:3: error: ';' expected
 int class = 10;
    ^
Assign9.java:3: error: <identifier> expected
 int class = 10;
          ^
Assign9.java:4: error: <identifier> expected
 System.out.println(class);
                   ^
Assign9.java:4: error: illegal start of type
 System.out.println(class);
                    ^
Assign9.java:4: error: <identifier> expected
 System.out.println(class);
                         ^
Assign9.java:6: error: reached end of file while parsing
}

//class is a reserved keyword used to define a class in java

Correct code - 

 class Main {
 public static void main(String[] args) {
 int a = 10;
 System.out.println(a);
 }
} 

*/