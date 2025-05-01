import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BankAccount {
    private String firstName, lastName, password;
    private double balance = 0;

    public BankAccount(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

public class BankApp {
    private static BankAccount account;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Banking");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 5, 5));

        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JTextField amountField = new JTextField();
        JLabel statusLabel = new JLabel("Create an account to get started.");
        
        JButton createButton = new JButton("Create Account");
        JButton creditButton = new JButton("Credit");
        JButton debitButton = new JButton("Debit");

        createButton.addActionListener(e -> {
            String firstName = firstNameField.getText().trim();
            String lastName = lastNameField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();

            if (firstName.isEmpty() || lastName.isEmpty() || password.isEmpty()) {
                statusLabel.setText("Please fill all fields.");
                return;
            }

            account = new BankAccount(firstName, lastName, password);
            statusLabel.setText("Welcome, " + account.getFullName() + "! Balance: $0.00");
        });

        creditButton.addActionListener(e -> {
            if (account == null) {
                statusLabel.setText("Create an account first.");
                return;
            }

            try {
                double amount = Double.parseDouble(amountField.getText().trim());
                if (amount <= 0) throw new NumberFormatException();
                account.credit(amount);
                statusLabel.setText("Balance: $" + account.getBalance());
            } catch (NumberFormatException ex) {
                statusLabel.setText("Enter a valid amount.");
            }
        });

        debitButton.addActionListener(e -> {
            if (account == null) {
                statusLabel.setText("Create an account first.");
                return;
            }

            try {
                double amount = Double.parseDouble(amountField.getText().trim());
                if (amount <= 0) throw new NumberFormatException();
                
                if (account.debit(amount)) {
                    statusLabel.setText("Balance: $" + account.getBalance());
                } else {
                    statusLabel.setText("Insufficient funds!");
                }
            } catch (NumberFormatException ex) {
                statusLabel.setText("Enter a valid amount.");
            }
        });

        frame.add(new JLabel("First Name:"));
        frame.add(firstNameField);
        frame.add(new JLabel("Last Name:"));
        frame.add(lastNameField);
        frame.add(new JLabel("Password:"));
        frame.add(passwordField);
        frame.add(createButton);
        frame.add(new JLabel(""));
        frame.add(new JLabel("Amount:"));
        frame.add(amountField);
        frame.add(creditButton);
        frame.add(debitButton);
        frame.add(statusLabel);
        frame.add(new JLabel(""));

        frame.setVisible(true);
    }
}
