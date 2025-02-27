import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First NUmber:");
		int a = sc.nextInt();
		
		System.out.println("Enter Second NUmber:");
		int b = sc.nextInt();

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("After Swapping a: "+a+" b: "+b);

		}
}