// Flag starter kit

/*
 * Alex Gao
 * Ethan Houston
 * Ethan Shaotran
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Flag extends JApplet {
	private final int STRIPES = 13;

	// SCALE FACTORS (A through L)
	//
	// Note: Constants in Java should always be ALL_CAPS, even
	// if we are using single letters to represent them

	public final double A = 1.0;  // Hoist (width) of flag
	public final double B = 1.9;  // Fly (length) of flag
	public final double C = 0.5385;  // Hoist of Union
	public final double D = 0.76;  // Fly of Union
	public final double E = 0.054;  // See flag specification
	public final double F = 0.054;  // See flag specification
	public final double G = 0.063;  // See flag specification
	public final double H = 0.063;  // See flag specification
	public final double K = 0.0616;  // Diameter of star
	public final double L = 0.0769;  // Width of stripe
	public int width;           // width of flag in pixels
	public int height;          // height of flag in pixels
	public final int IDEALWIDTH = 400 ;
	public final int IDEALHEIGHT = 760;
	public int stripe_height;   // height of an individual stripe in pixels
	
//	public void makeGraphics() {
//		Graphics g = new Graphics(0,0,460,760);
//	}
	
	public void init() {
		// Choice of width = 1.9 * height to start off
		// Gets ratio of FLY : HOIST
		setSize(760, 400);
		repaint();
	}

	public void paint(Graphics g) {
		width = getWidth();
		height = getHeight();

		
//		System.out.println(width + "," + height);
//		System.out.println((width/height) == (int) 1.9);
//		System.out.println((float) width/height);
//		if ((float) height/width != 1.9) {
//			height = (int) 1.9 * width;
//		}
		drawBackground(g);
		drawStripes(g, width, height);
		drawField(g, width, height);
		drawStars(g, width, height);  
	}

	private void drawBackground(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
	}
	
	public void drawStripes(Graphics g, int width, int height) {
		Stripes stripe = new Stripes();
		
		for(int i=1; i<=13; i++) {
			stripe.drawStripe(g, i, width, height);
		}
		
	}

	public void drawField(Graphics g, int width, int height) {
		Field field = new Field();
		
		field.drawUnion(g, width, height);
	}

	public void drawStars(Graphics g, int width, int height) {
		Star star = new Star();
		
		star.drawStar(g, width, height);
		
	}
}