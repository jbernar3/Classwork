
public class ShapeRunner {
	public static void main(String [] args)
	{
		Rectangle rect = new Rectangle(100,3);
		Circle circ = new Circle(3);
		if (circ.area() > rect.area())
		{
			System.out.println(circ.area() + " is bigger than the rectangle area");
		}
		else 
		{
			System.out.println(rect.area() + " is bigger than the circle area");
		}
		if (circ.perimeter() > rect.perimeter())
		{
			System.out.println(circ.perimeter() + " is bigger than the rectangle perimeter.");
		}
		else
		{
			System.out.println(rect.perimeter() + " is bigger than the circle perimeter.");
		}
	}
}
