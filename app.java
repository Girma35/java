import java.util.Scanner;
//Part 1:  Creating a Bank Account Class
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private double interestRate;

    // Implement a constructor that takes three arguments
    public BankAccount(String customerName, String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public double interestRate(){
      return interestRate;
    }

    public static void main(String[] args) {
        // Part 3:  Testing Your BankAccount Class
        BankAccount myAccount = new BankAccount("Girma Wakeyo", "1000435128266", 559.84);
        BankAccount myAccount2 = new BankAccount("Ake Wakeyo", "1000252265767", 25.55);

        // Call the deposit method
        myAccount.deposit(0.0);
        myAccount2.deposit(0.0);

        // Call the withdraw method
        myAccount.withdraw();
        myAccount2.withdraw();

        // Call the getAccountInfo method
        myAccount.getAccountInfo();
        myAccount2.getAccountInfo();
    }
     //Part 2:  Adding Functionality with Methods
    // Create the deposit method
    public void deposit( double interestEarned) {
       balance += interestEarned;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello " + getCustomerName() + ", please enter the amount you want to deposit: ");
        double amountDeposit = scanner.nextDouble();
        balance += amountDeposit;
        System.out.println("Deposit Successful. Current Balance: " + balance);
    }

    // Create the withdraw method
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello " + getCustomerName() + ", please enter the amount you want to withdraw: ");
        double amountWithdraw = scanner.nextDouble();
        if (balance >= amountWithdraw) {
            balance -= amountWithdraw;
            System.out.println("Withdrawal Successful. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Unable to withdraw.");
        }
    }
    public void getAccountInfo() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
    public void calculateInterest() {
    double interestEarned = balance * interestRate;
    System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    System.out.println("Interest Earned: " + interestEarned);
}
    
}