import java.util.Scanner;

class Demo {
    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number:");
        int n = sc.nextInt();
     
        if (n == 1) {
            System.out.println("The number " + n + " is not prime");
        } else {
            int prime = 1;
            
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = 0;
                    break;
                }
            }
            
            if (prime==1) {
                System.out.println("The number " + n + " is prime");
            } else {
                System.out.println("The number " + n + " is not prime");
            }
        }
    }
}
