public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a ** b;
 System.out.println(result);
 }
}  

/*
/------------------------------------------------------------------------------------------------------/

Assign17.java:5: error: illegal start of expression
 int result = a ** b;
                 ^
1 error       ^

// ** operator is not valid in Java because Java does not use this operator for exponentiation. 

Correct code -

 class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = (int) Math.pow(a,b);
 System.out.println(result);
 }
}  


*/