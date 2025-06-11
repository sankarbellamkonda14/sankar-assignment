public class BankAccount
 {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void deposit(double amount)
   {
        double updatedBalance = balance + amount;
        balance = updatedBalance;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) 
    {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 123456;
        acc.accountHolderName = "Mr. Kumar";
        acc.balance = 10000;

        acc.deposit(2500);
    }
}