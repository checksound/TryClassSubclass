package shapes;

public class TestShapesNew {
	
	private static void doPrint(Shape shape) {
		System.out.printf("%s - perimeter: %f, area: %f\n", shape, 
				shape.area(), shape.perimeter());
	}

	public static void main(String[] args) {
		
		Point point = new Point(6, 7);		
		doPrint(point);
		
		Circle circle = new Circle(9, 10, 6);		
		doPrint(circle);
		
		Square square = new Square(12, 4, 5);
		doPrint(square);
	}

}
