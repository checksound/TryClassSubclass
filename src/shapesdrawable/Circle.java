package shapesdrawable;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape implements Drawable {
	
	private int radius;
	
	public Circle(int x, int y, int radius) {
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
	
	@Override
	public void draw(Graphics g) {
		System.out.printf("%s - perimeter: %f, area: %f\n", this, 
				area(), perimeter());
		
		g.setColor(Color.GREEN);
		
		g.drawOval(x, y, radius, radius);
	}
	
}
