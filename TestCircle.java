public class Circle 
{ 
	 double radius;
	  String color;
   
   // The default constructor with no argument.
   
   	public Circle() 
	{
		radius = 1.0;
		color = "red";
   	}
   
   // 2nd constructor with given radius, but color default
   	public Circle(double r) 
	{
      		radius = r;
      		color = "red";
   	}
   	public Circle(double r,String c) 
	{
      		radius = r;
      		color = c;
   	}
   
   // A public method for retrieving the radius
   	public double getRadius() 
	{
     		return radius; 
   	}
   
  	 // A public method for computing the area of 
	 public double getArea() 
	{
      		return radius*radius*Math.PI;
   	}
}
public class TestCircle 
{ 
   	public static void main(String[] args) 
	{
      		Circle c1 = new Circle();
	      System.out.println("The circle has radius of "     + c1.getRadius() + " and area of " + c1.getArea());
   
     		Circle c2 = new Circle(2.0);
		 System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());

     		Circle c3 = new Circle(5.0,"pink");
		 System.out.println("The circle has radius of " 
         + c3.getRadius() + " and area of " + c3.getArea());

   }
}