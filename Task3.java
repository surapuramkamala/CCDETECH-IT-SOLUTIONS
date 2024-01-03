import java.util.Scanner;

class bankAct {
    private double balance;

    public bankAct(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amut) {
        balance += amut;
    }

    public boolean withdraw(double amut) {
        if (amut <= balance) {
            balance -= amut;
            return true;
        } else {
            return false;
        }
    }
}

public class Task3 {
    private bankAct userAccount;
    private Scanner scanner;

    public Task3(bankAct account) {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }

    public void showOptions() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performTransaction() {
        int choice;
        do {
            showOptions();
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("Your balance is: " + userAccount.getBalance());
    }

    private void deposit() {
        System.out.print("Enter the amount to deposit: $");
        double amut = scanner.nextDouble();
        userAccount.deposit(amut);
        System.out.println("Deposit successful. New balance is: $" + userAccount.getBalance());
    }

    private void withdraw() {
        System.out.print("Enter the amount to withdraw: $");
        double amut = scanner.nextDouble();
        boolean success = userAccount.withdraw(amut);
        if (success) {
            System.out.println("Withdrawal successful. New balance is: $" + userAccount.getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        bankAct account = new bankAct(1000); 
        Task3 atm = new Task3(account);
        atm.performTransaction();
    }
}
