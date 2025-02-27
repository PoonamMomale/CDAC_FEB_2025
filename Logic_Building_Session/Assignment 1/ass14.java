import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();

 		int firstTerm = 0, secondTerm = 1;
    	      	System.out.println("Fibonacci Series till " + n + " terms:");

  		for (int i = 1; i <= n; i++) {
		System.out.println(firstTerm + " ");
		int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;	
		}
	}
}