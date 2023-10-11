package shapes;

public class Square extends Point {
	
	private float side;
	
	public Square(float x, float y, int side) {
		super(x, y);
		this.side = side;
	}
	
	public float getSide() {
		return side;
	}
	
	@Override
	public double area() {
		return side * side;
	}
	
	@Override
	public double perimeter() {
		return 4 * side;
	}

	@Override
	public String toString() {
		return "Square [x=" + x + ", y=" + y + ", side=" + side + "]";
	}
	
	
}
