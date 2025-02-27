import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}
}