import java.lang.*;
import java.io.*;

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI*radius*radius;
    }

    public double TotalsurfaceArea() {
        return 2*(Math.PI)*radius*(radius+height);
    }
	public double volume()
	{
	return Math.PI*radius*radius*height;
}
}
public class Cylinder1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();

        c1.radius = 7;
        c1.height = 14;

        System.out.println("Lid Area = " + c1.lidArea());
        System.out.println("Total Surface Area = " + c1.TotalsurfaceArea());
	System.out.println("Volume of Cylinder="+c1.volume());
    }
}
