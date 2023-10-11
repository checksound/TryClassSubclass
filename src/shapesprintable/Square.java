package shapesprintable;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
	
	private int side;
	
	public Square(int x, int y, int side) {
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
	
	@Override
	public void print(Graphics g) {
		System.out.printf("%s - perimeter: %f, area: %f\n", this, 
				area(), perimeter());		
		
		g.setColor(Color.BLACK);
		g.drawRect(x - side/2, y - side/2, side, side);
	}
}
