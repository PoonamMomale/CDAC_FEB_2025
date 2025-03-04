 class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[5]);
 }
} 	


/*
/------------------------------------------------------------------------------------------------------/

Assign11.java:1: error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Assign11.java:4)

//the above code only has three indexes so when we try to access index which exceeds the length of the array we will get above exception


Correct code - 
	
 class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[2]);
 }
} 

*/