import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class j3lab1 {
    // Method to calculate the square of an integer
    public int square(int number) {
        return number * number;
    }

    // Method to calculate the square of a double
    public double square(double number) {
        return number * number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OverloadingDemo demo = new OverloadingDemo();

        // Getting an integer input
        System.out.print("Enter an integer: ");
        int intNum = Integer.parseInt(reader.readLine());
        System.out.println("Square of integer " + intNum + " is: " + demo.square(intNum));

        // Getting a double input
        System.out.print("Enter a double: ");
        double doubleNum = Double.parseDouble(reader.readLine());
        System.out.println("Square of double " + doubleNum + " is: " + demo.square(doubleNum));
    }
}
