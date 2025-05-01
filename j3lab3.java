import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class OverloadingDemo {
    // Method with integer parameters
    public void display(int number1, int number2) {
        System.out.println("Integer method called.");
        System.out.println("Sum of integers: " + (number1 + number2));
    }

    // Method with double parameters
    public void display(double number1, double number2) {
        System.out.println("Double method called.");
        System.out.println("Sum of doubles: " + (number1 + number2));
    }
}

public class j3lab3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OverloadingDemo demo = new OverloadingDemo();

        // Getting integer inputs
        System.out.print("Enter the first integer: ");
        int int1 = Integer.parseInt(reader.readLine());
        System.out.print("Enter the second integer: ");
        int int2 = Integer.parseInt(reader.readLine());
        demo.display(int1, int2);

        // Getting double inputs
        System.out.print("Enter the first double: ");
        double double1 = Double.parseDouble(reader.readLine());
        System.out.print("Enter the second double: ");
        double double2 = Double.parseDouble(reader.readLine());
        demo.display(double1, double2);
    }
}
