package shapesprintable;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape {
	
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		super(x, y);
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
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void print(Graphics g) {		
		System.out.printf("%s - perimeter: %f, area: %f\n", this, 
				area(), perimeter());
		
		g.setColor(Color.BLACK);
		g.drawLine(x, y - 2, x, y + 2);
		g.drawLine(x - 2, y, x + 2, y);
	} 
	
}
