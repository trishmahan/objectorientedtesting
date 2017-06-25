package objectorientedtesting;

public class ObjectOrientedTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 5; 
		int height = 6;

		Rectangle testRect = new Rectangle(width, height);
		Square testSquare = new Square(width);
		
		System.out.println("Rect width = " + testRect.width);
		System.out.println("Rect height = " + testRect.height);
		System.out.println("Rect origin = " + testRect.origin);
		System.out.println("Square width = " + testSquare.width);
		System.out.println("Square height = " + testSquare.height);
		System.out.println("Square origin = " + testSquare.origin);
		
		testRect.move(width, height);
		testSquare.move(width, width);
		
		System.out.println("Rect area = " + testRect.getArea());
		System.out.println("Square area = " + testSquare.getArea());
	}

}
