package shapes;

public class TestShapes {

	public static void main(String[] args) {
		
		Shape p1 = new Shape(6, 7);		
		System.out.printf("%s - perimeter: %f, area: %f\n", p1, 
				p1.area(), p1.perimeter());
		
		Circle circle = new Circle(9, 10, 6);		
		System.out.printf("%s - perimeter: %f, area: %f\n", circle, 
				circle.perimeter(), circle.area());
		
		Square square = new Square(12, 4, 5);
		System.out.printf("%s - perimeter: %f, area: %f\n", square, 
				square.perimeter(), square.area());

	}

}
