public class Circle implements Shape{
	private double radius;
	private static double pi=3.14;
	/*
	 * Constructor.
	 * Creates circle with given radius.
	 * @param double rad - radius of the circle being created.
	 */
	public Circle(double rad)
	{
		this.radius = rad;
	}
	//@return area of the circle.
	public double area()
	{
		return pi*(radius*radius);
	}
	//@return circumference/perimeter of the circle.
	public double perimeter()
	{
		return 2*pi*radius;
	}
	//@return String that has information of the Circle.
	 public String toString()
	   {
	        return "Circ. radius is " + this.radius + "\tCirc. area is " + this.area() + "\tCirc. circum is " + this.perimeter();   
	   }
}
