import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int n1 = sc.nextInt();

	   	System.out.println("Enter Second Number:");
		int n2 = sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int n3 = sc.nextInt();

		int n = (n1+n2+n3)/3;
		System.out.println("The average is: "+n);
	}
}