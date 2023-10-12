package shapes;

/**
 * 
 * @param x coordinata ascissa del punto
 * @param y coordinata ordinata  del punto
 */

public class Point extends Shape {
	
	public Point(int x, int y) {
		super(x, y);
	}
	
    public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
