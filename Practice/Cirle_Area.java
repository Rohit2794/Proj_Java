package Practice;
import java.lang.Math;
import java.util.Scanner;

public class Cirle_Area {
	static double pi = Math.PI;
	static void area()
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Radius");
	double d= s.nextDouble();
	
	double a = Math.pow(d, d);
	double d1 = pi*a;
	System.out.println("Area "+d1);
	
	}
	static void circum()
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Radius");
	double d= s.nextDouble();
	
	double a = Math.pow(d, d);
	double d1 = 2*pi*a;
	System.out.println("Circumference "+d1);
	s.close();
	}
	
	
	public static void main(String[] args) {
		area();
		circum();
		
		
	}

}
