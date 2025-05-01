import java.io.*;

class BankAccount {
    private double balance = 0;

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("You added $" + amount + ". New balance: $" + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("You withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Oops! Not enough balance. You only have $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp1 {
    public static void main(String[] args) throws IOException {
        BankAccount account = new BankAccount();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Your Bank Account!");
        System.out.println("Your current balance: $" + account.getBalance());

        Thread depositThread = new Thread(() -> {
            try {
                System.out.print("Enter amount to deposit: ");
                double amount = Double.parseDouble(reader.readLine());
                account.deposit(amount);
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        });

        Thread withdrawThread = new Thread(() -> {
            try {
                System.out.print("Enter amount to withdraw: ");
                double amount = Double.parseDouble(reader.readLine());
                account.withdraw(amount);
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        });

        depositThread.start();
        try { depositThread.join(); } catch (InterruptedException e) { e.printStackTrace(); }
        withdrawThread.start();
        try { withdrawThread.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Final balance: $" + account.getBalance());
    }
}
