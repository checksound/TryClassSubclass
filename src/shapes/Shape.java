package shapes;

/**
 * 
 * @param x coordinate ascissa
 * @param y coordinate ordinata 
 */

public class Shape {
	
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
}
