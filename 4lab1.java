import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Base class representing 2D shapes
class TwoDShape {
    protected double length;
    protected double width;
    
    // Constructor to initialize dimensions
    public TwoDShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the sheet
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the cost of the sheet
    public double calculateCost() {
        return calculateArea() * 40; // Cost is Rs 40 per square ft
    }
}

// Derived class representing 3D shapes
class ThreeDShape extends TwoDShape {
    private double height;

    // Constructor to initialize dimensions
    public ThreeDShape(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Method to calculate the volume of the box
    public double calculateVolume() {
        return length * width * height;
    }

    // Method to calculate the cost of the box
    @Override
    public double calculateCost() {
        return calculateVolume() * 60; // Cost is Rs 60 per cubic ft
    }
}

// Main class
public class j4lab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the type of plastic (2D/3D): ");
        String type = reader.readLine();

        if (type.equalsIgnoreCase("2D")) {
            System.out.println("Enter the length of the sheet (in ft): ");
            double length = Double.parseDouble(reader.readLine());

            System.out.println("Enter the width of the sheet (in ft): ");
            double width = Double.parseDouble(reader.readLine());

            TwoDShape sheet = new TwoDShape(length, width);
            double cost = sheet.calculateCost();

            System.out.printf("The cost of the 2D sheet is: Rs %.2f\n", cost);

        } else if (type.equalsIgnoreCase("3D")) {
            System.out.println("Enter the length of the box (in ft): ");
            double length = Double.parseDouble(reader.readLine());

            System.out.println("Enter the width of the box (in ft): ");
            double width = Double.parseDouble(reader.readLine());

            System.out.println("Enter the height of the box (in ft): ");
            double height = Double.parseDouble(reader.readLine());

            ThreeDShape box = new ThreeDShape(length, width, height);
            double cost = box.calculateCost();

            System.out.printf("The cost of the 3D box is: Rs %.2f\n", cost);

        } else {
            System.out.println("Invalid input. Please enter either '2D' or '3D'.");
        }
    }
}
