import java.util.Random;
public class ShapeUtilities {
	public static double sumArea(Shape[] shapeArray)
	{
		int output = 0;
		for (Shape sh : shapeArray)
		{
			output += sh.area();
		}
		return output;
	}
	public static double sumPerimeter(Shape[] shapeArray)
	{
		int output = 0;
		for (Shape sh : shapeArray)
		{
			output += sh.perimeter();
		}
		return output;
	}
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
		case 0:
			return new Circle(r.nextInt(100) + 1);
			
		case 1:
			return new Rectangle((r.nextInt(100) + 1),(r.nextInt(100) + 1));
			
		case 2:
			return new Square(r.nextInt(100) + 1);
		
		default:
			return getRandomShape();
		
		}
	}
	
}
