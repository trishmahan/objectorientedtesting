package objectorientedtesting;
import java.awt.Point;

public class Square {
	public int width = 0;
	public int height = width;
    public Point origin;
    
    // four constructors
    public Square() {
        origin = new Point(0, 0);
    }
    public Square(Point p) {
        origin = p;
    }
    public Square(int w) {
        origin = new Point(0, 0);
        width = w;
        height = w;
    }
    public Square(Point p, int w) {
        origin = p;
        width = w;
        height = w;
    }

    // a method for moving the square
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
		System.out.println("origin = " + origin);

    }
    
    // a method for computing the area of the square
    public int getArea() {
        return width * height;
    }

}
