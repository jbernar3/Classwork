/*
 * Creates a square that extends to the Rectangle class.
 * @author Jefferson C. Bernard
 */
public class Square extends Rectangle {
	
    int side;
    /*
     * Constructor.
     * Creates square using super to call Rectangle function.
     */
    public Square(int side)
    {
        super(side,side);
        this.side = side;
    }

    /*
     * @returns a String.
     * The String contains the information of the Square generated.
     */
    public String toString()
    {
        return "Square side length is " + this.side + "\tSquare area is " + this.area() + "\tSquare perimeter is " + this.perimeter();   
    }
}