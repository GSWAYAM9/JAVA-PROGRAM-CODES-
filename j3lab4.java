import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class OverloadingDemo {
    // Method with two integer parameters
    public void calculate(int num1, int num2) {
        System.out.println("Method with two parameters called.");
        System.out.println("Sum of two integers: " + (num1 + num2));
    }

    // Method with three integer parameters
    public void calculate(int num1, int num2, int num3) {
        System.out.println("Method with three parameters called.");
        System.out.println("Sum of three integers: " + (num1 + num2 + num3));
    }
}

public class j3lab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OverloadingDemo demo = new OverloadingDemo();

        // Using the method with two parameters
        System.out.print("Enter the first integer: ");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.print("Enter the second integer: ");
        int num2 = Integer.parseInt(reader.readLine());
        demo.calculate(num1, num2);

        // Using the method with three parameters
        System.out.print("Enter the third integer: ");
        int num3 = Integer.parseInt(reader.readLine());
        demo.calculate(num1, num2, num3);
    }
}
