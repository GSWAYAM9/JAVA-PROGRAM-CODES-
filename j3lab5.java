import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bank {
    String name;
    double personalLoanRate; // Interest rate for personal loans
    double homeLoanRate;     // Interest rate for home loans

    // Constructor to initialize bank details
    public Bank(String name, double personalLoanRate, double homeLoanRate) {
        this.name = name;
        this.personalLoanRate = personalLoanRate;
        this.homeLoanRate = homeLoanRate;
    }

    // Overloaded loan method for personal loan interest calculation
    public double loan(double principal, int years) {
        return principal * (personalLoanRate / 100) * years;
    }

    // Overloaded loan method for home loan interest calculation
    public double loan(double principal, int years, boolean isHomeLoan) {
        if (isHomeLoan) {
            return principal * (homeLoanRate / 100) * years;
        }
        return loan(principal, years); // Default to personal loan calculation
    }

    // Method to display bank details and loan rates
    public void display() {
        System.out.println(name + " - Personal Loan Rate: " + personalLoanRate + "%, Home Loan Rate: " + homeLoanRate + "%");
    }
}

public class j3lab5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Creating bank objects
        Bank hdfc = new Bank("HDFC", 11.5, 8.0);
        Bank sbi = new Bank("SBI", 10.5, 7.5);
        Bank icici = new Bank("ICICI", 12.0, 8.2);

        // Displaying bank details
        System.out.println("Available Banks and Loan Rates:");
        hdfc.display();
        sbi.display();
        icici.display();

        // Taking user input
        System.out.print("\nEnter principal amount: ");
        double principal = Double.parseDouble(reader.readLine());

        System.out.print("Enter loan tenure in years: ");
        int years = Integer.parseInt(reader.readLine());

        System.out.print("Enter loan type (personal/home): ");
        String loanType = reader.readLine().toLowerCase();

        boolean isHomeLoan = loanType.equals("home");

        // Calculating loans for each bank
        double hdfcLoan = hdfc.loan(principal, years, isHomeLoan);
        double sbiLoan = sbi.loan(principal, years, isHomeLoan);
        double iciciLoan = icici.loan(principal, years, isHomeLoan);

        // Determining the bank with the least rate of interest
        double minLoan = Math.min(hdfcLoan, Math.min(sbiLoan, iciciLoan));
        String bestBank = (minLoan == hdfcLoan) ? "HDFC" : (minLoan == sbiLoan) ? "SBI" : "ICICI";

        System.out.println("\nLoan Details:");
        System.out.printf("HDFC Loan Amount: %.2f%n", hdfcLoan);
        System.out.printf("SBI Loan Amount: %.2f%n", sbiLoan);
        System.out.printf("ICICI Loan Amount: %.2f%n", iciciLoan);

        System.out.println("\nThe bank with the least rate of interest for " + loanType + " loan is: " + bestBank);
    }
}
