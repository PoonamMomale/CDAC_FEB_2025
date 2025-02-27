import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();

		int count = 0;

 		while(n!=0) {
			n = n/10;
			count++;
		}
		System.out.println("The number has "+count+" digits");

  	}
}	