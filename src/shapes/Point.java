package shapes;

public class Point {
	
	protected float x;
	protected float y;
	
	public Point(float x, float y) {
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
