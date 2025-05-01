import java.lang.*;
import java.io.*;

class j3lab7
{
	public static Double area(Double radius)
	{
	return Math.PI*radius*radius;
	}
	
	public static Double area(Double base,Double height)
	{
	return 0.5*base*height;
	}

	public static int area(int side)
	{
	return side*side;
	}

	public static void main(String args[])
	{
	j3lab7 b1=new j3lab7();	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try 
	{
	System.out.println("1.Circle\n2.Triangle \n3.Square");
	System.out.println("Enter your choice=");
	int choice=Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 1:
	System.out.println("Enter the Radius of a Circle=");
	Double radius=Double.parseDouble(br.readLine());
	System.out.println("The Area of a Circle="+b1.area(radius));
	break;

	case 2:
	System.out.println("Enter Base of a Triangle=");	
	Double base=Double.parseDouble(br.readLine());
	System.out.println("Enter Height of a Triangle=");
	Double height=Double.parseDouble(br.readLine());
	System.out.println("The Area of a Triangle="+b1.area(base,height));
	break;

	case 3:
	System.out.println("Enter Side of a Square=");
	int side=Integer.parseInt(br.readLine());
	System.out.println("The Area of a Square="+b1.area(side));
	break;
	
	default:
	System.out.println("Invalid Choice");
	break;
	}
}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}