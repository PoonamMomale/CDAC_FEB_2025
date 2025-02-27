import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NUmber:");
		int n = sc.nextInt();
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}
}