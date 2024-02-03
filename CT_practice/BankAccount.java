// BankAccount class
public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        
    }

    public void withdraw(double amount) {
            balance -= amount;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    
    public static void main(String[] args) {
            
            BankAccount account = new BankAccount(123456, "John Doe", 1000.0);
            
            BankAccount account2 = new BankAccount(789012, "Jane Smith", 500.0);
            
            account.deposit(500.0);
            //account.withdraw(200.0);
            
           // account2.deposit(1000.0);
            account2.withdraw(300.0);
            
            System.out.println("Account 1 Details:");
            account.displayAccountDetails();
            
            System.out.println("\nAccount 2 Details:");
            account2.displayAccountDetails();
        }
    
}
