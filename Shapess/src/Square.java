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

    //@return String that has information on Square being created.
    public String toString()
    {
        return "Squa. length is " + this.side + "\tSqua. area is " + this.area() + "\tSqua. perimeter is " + this.perimeter();   
    }
}