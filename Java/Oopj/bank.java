// Customer class
class Customer {
    private String name;
    private double balance;

    // Constructor to initialize customer data
    public Customer(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to get customer balance
    public double getBalance() {
        return balance;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Balance: " + balance);
    }
}


// Bank class
class Bank {

    // Method to deposit money into the customer's account
    public void depositToAccount(Customer customer, double amount) {
        customer.deposit(amount);
    }

    // Method to withdraw money from the customer's account
    public void withdrawFromAccount(Customer customer, double amount) {
        customer.withdraw(amount);
    }
}


// BankApplicationDemo class
 class BankApplicationDemo {
    public static void main(String[] args) {
        // Create a customer object
        Customer customer = new Customer("John Doe", 1000.00);
        
        // Create a bank object
        Bank bank = new Bank();
        
        // Display customer details before any operations
        customer.displayCustomerDetails();
        
        // Deposit some money
        bank.depositToAccount(customer, 500.00);
        
        // Withdraw some money
        bank.withdrawFromAccount(customer, 200.00);
        
        // Display customer details after operations
        customer.displayCustomerDetails();
    }
}
