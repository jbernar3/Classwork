
public class Rectangle implements Shape{
	private double length;
	private double width;
	//@return perimeter of the rectangle.
	public double perimeter()
	{
		return length*2 + width*2;
	}
	//@return area of rectangle.
	public double area()
	{
		return length * width;
	}
	/*
     * Constructor.
     * Creates rectangle using a length and width.
     */
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	//@return String that has information of the rectangle created.
	 public String toString()
	    {
	        return "Rect. length is " + this.length + "\tRect. width is  "+ this.width + "\tRect. area is " + this.area() + "\tRect. perimeter is " + this.perimeter();   
	    }
}
