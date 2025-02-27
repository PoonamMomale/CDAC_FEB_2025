import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First NUmber");
		int a = sc.nextInt();

		System.out.println("Enter Second NUmber");
		int b = sc.nextInt();

		System.out.println(a +"X"+ b+ "="+ (a*b));

	}
}