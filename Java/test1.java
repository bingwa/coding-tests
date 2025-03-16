import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal succesful New balance: " + balance);
        }
        else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
        
}

class ATM {
    private Map<String, Account> accounts = new HashMap<>;

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(, account));
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        atm.addAccount(new Account("345679", "Andrew", 25000));
        atm.addAccount(new Account("523455", "Finley", 35000));

        while (true) {
            System.out.println("\n Welcome to ATM");
            System.out.println("Enter account number");
            String accNumber = scanner.nextline();

            if (!atm.accountExists(accNumber)) {
                System.out.println("Account not found!");
                continue;
            }

            Account account = atm.getAccount(accNumber);
            System.out.println("Hello, " + account.getAccountHolder());

            while(true) {
                System.out.println("\nl. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.println("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                    System.out.println("Your balance: " + account.getBalance());
                    break;
                    case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(depositAmount);
                    break;
                    case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(withdrawAmountAmount);
                    break;
                    case 4:
                    System.out.println("Thank you for using our ATM!");
                    return;
                    default:
                    System.out.println("Invalid option! Please try again.");
                }
            }
        }
    }
}