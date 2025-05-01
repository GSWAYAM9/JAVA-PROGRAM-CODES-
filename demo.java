import java.util.Scanner;

class Box {
    private double length;
    private double width;
    private double height;

    // Constructor to initialize the dimensions of the box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return the volume of the box
    public double volume() {
        return length * width * height;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the box:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        // Create a Box object
        Box box = new Box(length, width, height);

        // Calculate and print the volume of the box
        System.out.println("The volume of the box is: " + box.volume());

        scanner.close();
    }
}
