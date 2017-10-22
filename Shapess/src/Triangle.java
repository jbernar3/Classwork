
public class Triangle implements Shape{
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	//@return perimeter of the triangle.
	public double perimeter()
	{
		return sideOne + sideTwo + sideThree;
	}
	//@return area of the triangle using heron's formula.
	public double area()
	{
		double s = ((sideOne + sideTwo + sideThree)/2);
		return (Math.sqrt(s * (s-sideOne) * (s-sideTwo) * (s-sideThree)));
	}
	/*
	 * Constructor.
	 * Creates Triangle with three side values.
	 */
	public Triangle(double side1, double side2, double side3)
	{
		this.sideOne = side1;
		this.sideTwo = side2;
		this.sideThree = side3;
	}
	//@return String that has information on the triangle created.
	public String toString()
	{
		 return "Tri. side1 is " + this.sideOne + "\tTri. side2 is  "+ this.sideTwo + "\tTri. side3 is " + this.sideThree + "\tTri. area is " + this.area() + "\tTri. perimeter is " + this.perimeter(); 
	}
}
