import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class OverloadingDemo {
    // Method with no parameters
    public void display() {
        System.out.println("No parameters provided.");
    }

    // Method with one parameter
    public void display(int number) {
        System.out.println("Single parameter (integer): " + number);
    }

    // Method with two parameters
    public void display(int number1, int number2) {
        System.out.println("Two parameters (integers): " + number1 + " and " + number2);
    }
}

public class j3lab2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OverloadingDemo demo = new OverloadingDemo();

        // Calling method with no parameters
        demo.display();

        // Getting one parameter from the user
        System.out.print("Enter an integer: ");
        int num1 = Integer.parseInt(reader.readLine());
        demo.display(num1);

        // Getting two parameters from the user
        System.out.print("Enter the first integer: ");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.print("Enter the second integer: ");
        int num3 = Integer.parseInt(reader.readLine());
        demo.display(num2, num3);
    }
}
