import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius:");
		int n = sc.nextInt();
		
		System.out.println("Area of Circle is "+(3.142*n*n));
		}
}