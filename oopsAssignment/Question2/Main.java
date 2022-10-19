package Question2;

public class Main {

	public static void main(String[] agrs) {
		Traingle traingle = new Traingle(8, 9);
		System.out.println("area of traingle is: " + traingle.area());

		Rectangle rectangle = new Rectangle(10, 9);
		System.out.println("area of rectangle: " + rectangle.area());

		Square square = new Square(3);
		System.out.println("are of square: " + square.area());
	}
}
