import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();

		int fact = 1;

 		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of a number is "+fact);
  	}
}