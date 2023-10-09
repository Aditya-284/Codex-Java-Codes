// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BankAccount {
    private int accNo;
    private double bal;

    // Constructor to initialize account with account number and balance
    public BankAccount(int accNo, double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + bal);
    }

    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount(18456327, 10000.0);

        // Display account details
        System.out.println("Account Details:");
        account.displayAccountDetails();
    }
}




