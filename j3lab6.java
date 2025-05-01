import java.io.*;

class j3lab6 {
    
    // Method to calculate area of a Circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a Triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate area of a Square
    public int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       j3lab6 obj = new j3lab6();
        
        try {
            System.out.println("Choose the shape to calculate area:");
            System.out.println("1. Circle\n2. Triangle\n3. Square");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = Double.parseDouble(br.readLine());
                    System.out.println("Area of Circle: " + obj.area(radius));
                    break;

                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double base = Double.parseDouble(br.readLine());
                    System.out.print("Enter the height of the triangle: ");
                    double height = Double.parseDouble(br.readLine());
                    System.out.println("Area of Triangle: " + obj.area(base, height));
                    break;

                case 3:
                    System.out.print("Enter the side of the square: ");
                    int side = Integer.parseInt(br.readLine());
                    System.out.println("Area of Square: " + obj.area(side));
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
