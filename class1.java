package class1;

class Rectangle
{
	public double length;
	public double breadth;

	public double area()
	{
	return length*breadth;
	}
	public double perimeter()
	{
	return 2*(length+breadth);
	}
}
	public class class1
	{
	public static void main(String args[])
	{
	Rectangle r1= new Rectangle();
	
	r1.length=7;
	r1.breadth=14;

	System.out.println("Area="+r1.area());
	System.out.println("Perimeter="+r1.perimeter());
	}
	}