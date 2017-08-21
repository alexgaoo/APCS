/*
 * Alex Gao
 * Ethan Houston
 * Ethan Shaotran
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Stripes extends Flag {
	
	public void drawStripe(Graphics g, int pos) {
		width = getWidth();
		height = getHeight();
		Color c;
		
		if (pos % 2 == 0) {
			c = Color.white;
		}
		else {
			c = Color.red;
		}
		
		g.setColor(c);
		g.fillRect(0, (width/13)*(pos-1), width, height/13);
	}
	
	
}
