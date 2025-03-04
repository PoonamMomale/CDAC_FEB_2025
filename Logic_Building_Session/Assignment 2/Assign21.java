
class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // Missing closing brace here
}


/*
/------------------------------------------------------------------------------------------------------/

Assign21.java:2: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

Assign21.java:6: error: reached end of file while parsing
}
 ^
1 error

Correct code -

class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // Missing closing brace here
} 
}


*/