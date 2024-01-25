/*Write a program having a class named Arithmetic with a method named add,sub,mul and div that takes  double as parameters and returns an double.*/
import java.util.*;
class Arithmetic
{
	double add(double i,double j)
	{
		return (i+j);
	}
	double sub(double i,double j)
	{
		return (i-j);
	}
}
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st no.:" );		
		double a=sc.nextDouble();
								System.out.print("Enter 2nd no.:" );		
		double b=sc.nextDouble();

		Arithmetic ar=new Arithmetic();
		double d=ar.add(a,b);
		System.out.println("Sum of "+a+" and "+b+" is "+ d);
			System.out.println("Subtraction of "+a+" and "+b+" is "+ar.sub(a,b));
	}
}

		



