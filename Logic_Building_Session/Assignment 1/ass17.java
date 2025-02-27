import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();

 		for(int i=1; i<=n; i++) {
			System.out.print(i+"\t");
		}

  	}
}