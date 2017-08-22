
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Field extends Flag {
	
	public void drawUnion(Graphics g, int w, int h) {
	
		g.setColor(Color.blue);
	
		double unionHeight = h * (7./13.);
		double unionWidth = w * (D/B);
		
		g.fillRect(0, 0, (int) unionWidth, (int) unionHeight);
		
	}
	
	
}
