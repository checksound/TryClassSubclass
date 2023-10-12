package shapes;

/**
 * 
 * @param x coordinata ascissa del centro figura
 * @param y coordinata ordinata  del centro figura
 */

public abstract class Shape {
	
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
	
	public abstract double area();
	
	public abstract double perimeter();
	
}
