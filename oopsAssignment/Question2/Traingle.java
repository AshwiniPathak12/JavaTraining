package Question2;

public class Traingle implements Shape {

	private int height;
	private int breath;

	public Traingle(int height, int breath) {
		this.height = height;
		this.breath = breath;
	}

	public int area() {
		return (height * breath) / 2;
	}

}
