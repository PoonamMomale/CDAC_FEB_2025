public class Main {
 public static void main(String[] args) {
 String str = null;
 System.out.println(str.length());
 }
} 


/*
/------------------------------------------------------------------------------------------------------/

Assign13.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

Exception in thread "main" java.lang.NullPointerException
        at Main.main(Assign13.java:4)

// we get an exception because we are trying to access length property on null object

Correct code - 

 class Main {
 public static void main(String[] args) {
 String str = "CDAC";
 System.out.println(str.length());
 }
} 


*/