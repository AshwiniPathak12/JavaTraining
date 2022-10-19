package Question2;

public class Square implements Shape {

	private int length;

	public Square(int length) {
		this.length = length;
	}
	public int area() {
		return length * length;
	}
	
}
