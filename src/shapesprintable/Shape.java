package shapesprintable;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Printable {
	
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
	public abstract void print(Graphics g);
	
}
