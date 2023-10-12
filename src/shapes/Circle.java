package shapes;

public class Circle extends Shape {
	
	private float radius;
	
	public Circle(int x, int y, float radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public float getRadius() {
		return radius;
	}
	
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}	
	
}
