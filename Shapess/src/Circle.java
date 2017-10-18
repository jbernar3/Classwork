public class Circle implements Shape{
	private double radius;
	private static double pi=3.14;
	public Circle(double rad)
	{
		this.radius = rad;
	}
	public double area()
	{
		return pi*(radius*radius);
	}
	public double perimeter()
	{
		return 2*pi*radius;
	}
	 public String toString()
	   {
	        return "Circle radius is " + this.radius + "\tCircle area is " + this.area() + "\tCircle circumference is " + this.perimeter();   
	   }
}
