import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

class Customer {
    String name;
    int customerID;
    BankAccount account;

    Customer(String name, int customerID, BankAccount account) {
        this.name = name;
        this.customerID = customerID;
        this.account = account;
    }

    void deposit(double amount) {
        account.deposit(amount);
    }

    void withdraw(double amount) {
        account.withdraw(amount);
    }

    void displayInfo() {
        System.out.println("Customer: " + name + ", ID: " + customerID);
        account.display();
    }
}

 class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount(3008, 500);
        Customer c1 = new Customer("Apurbo Debonath", 3008, acc1);

        int choice;
        do {
            System.out.println("\n1. Display Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    c1.displayInfo();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    c1.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    c1.withdraw(wit);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
