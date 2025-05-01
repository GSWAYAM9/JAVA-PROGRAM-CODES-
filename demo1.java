import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Method to read the values of length and breadth
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display the results
    public void display() {
        System.out.println("The area of the rectangle is: " + calculateArea());
        System.out.println("The perimeter of the rectangle is: " + calculatePerimeter());
    }
}

public class demo1 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Read the dimensions, calculate, and display results
        rectangle.read();
        rectangle.display();
    }
}
