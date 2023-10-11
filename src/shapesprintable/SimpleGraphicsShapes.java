package shapesprintable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGraphicsShapes extends JPanel {
	
	/**
    * Draws a picture.  The parameters width and height give the size 
    * of the drawing area, in pixels.  The drawing area is automatically
    * filled with the background color before this subroutine is called.
    */
	public void drawPicture(Graphics g, int width, int height) {
		
		Point point = new Point(56, 70);		
		Circle circle = new Circle(59, 40, 6);		
		Square square = new Square(12, 4, 15);
				
		point.print(g);
		circle.print(g);		
		square.print(g);
		
	}

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Simple Graphics");
		SimpleGraphicsShapes drawingArea = new SimpleGraphicsShapes();
		
		drawingArea.setBackground(Color.WHITE);
		window.setContentPane(drawingArea);
		
		/* NOTE:  In the next line, the numbers 800 and 600 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(800,600));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        
		window.setVisible(true);
		
		

	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // The following strange line will give a nicer, less jagged appearance
        // to lines and circles that are drawn using g.
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        drawPicture(g, getWidth(), getHeight());
    }

}
