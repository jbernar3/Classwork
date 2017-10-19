import java.util.Random;
public class ShapeUtilities {
	/*
	 * @param shapeArray - array of shapes.
	 * @returns the sum of all the shapes' areas in the array.
	 */
	public static double sumArea(Shape[] shapeArray)
	{
		double output = 0;
		for (Shape sh : shapeArray)
		{
			output += sh.area();
		}
		return output;
	}
	/*
	 * @param shapeArray - array of shapes.
	 * @returns the sum of all the shapes' perimeters in the array.
	 */
	public static double sumPerimeter(Shape[] shapeArray)
	{
		double output = 0;
		for (Shape sh : shapeArray)
		{
			output += sh.perimeter();
		}
		return output;
	}
	/*
	 * Creates a random shape with random radius/length/width.
	 * Radius is between 1 and 99.
	 * Length and width are both between 1 and 99.
	 */
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
