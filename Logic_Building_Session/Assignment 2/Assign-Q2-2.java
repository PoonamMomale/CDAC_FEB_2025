import java.util.Scanner;

 class Days {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number for days: ");
        int day = sc.nextInt();  
        
        switch (day) {
            case 1: 
                System.out.println("Monday");
                System.out.println("It is a weekday.");
                break;
            case 2: 
                System.out.println("Tuesday");
                System.out.println("It is a weekday.");
                break;
            case 3: 
                System.out.println("Wednesday");
                System.out.println("It is a weekday.");
                break;
            case 4: 
                System.out.println("Thursday");
                System.out.println("It is a weekday.");
                break;
            case 5: 
                System.out.println("Friday");
                System.out.println("It is a weekday.");
                break;
            case 6: 
                System.out.println("Saturday");
                System.out.println("It is a weekend.");
                break;
            case 7: 
                System.out.println("Sunday");
                System.out.println("It is a weekend.");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        
        sc.close();
    }
}
