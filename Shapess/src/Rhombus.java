
public class Rhombus implements Shape{
	private double diagonal;
	private double diagonal2;
	private double side;
	//@return perimeter of the rhombus.
	public double perimeter()
	{
		return side*4;
	}
	//@return area of the rhombus.
	public double area()
	{
		return (diagonal * diagonal2)/2;
	}
	/*
	 * Constructor.
	 * Creates rhombus using two diagonals and side.
	 */
	public Rhombus(double diag,double diag2,double side)
	{
		this.diagonal = diag;
		this.diagonal2 = diag2;
		this.side = side;
	}
	//@return String that has information on the rhombus created.
	public String toString()
	{
		return "Rhom. diagonal1 is " + this.diagonal + "\tRhomb. diagonal2 is  "+ this.diagonal2 + "\tRhom. area is " + this.area() + "\tRhom. perimeter is " + this.perimeter(); 
	}
	
}
