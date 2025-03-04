import java.util.Scanner;

 class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next();

        double discount = 0;

        if (totalAmount >= 1000) {
            discount = 0.20;
        } else if (totalAmount >= 500) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }

        if (membership.equalsIgnoreCase("yes")) {
            discount += 0.05;
        }

        double discountAmount = totalAmount * discount;
        double finalAmount = totalAmount - discountAmount;

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Total after discount: Rs." + finalAmount);

        scanner.close();
    }
}
