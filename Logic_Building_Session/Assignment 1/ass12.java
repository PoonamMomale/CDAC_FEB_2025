import java.util.Scanner;

class Demo {
	public static void main(String args[]) {
		//to take input from user we have to use scanner object

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();

	   	int reverse = 0;

   		while (n != 0) {
   	        int remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n = n / 10;
             }
            System.out.println("Reverse Number: "+reverse);
	}
}