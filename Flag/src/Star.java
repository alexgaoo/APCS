
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Star extends Flag {
	
	public void drawStar(Graphics g, int w, int h) {
		
		g.setColor(Color.white);
	
//		int[] xArray = new int[50];
//		int[] yArray = new int[50];
		
		int[] xPoints = new int[500];
		int[] yPoints = new int[500];
		
		for(int i = 1; i < 12; i++) {
			
			for(int j = 1; j < 11; j++) {
			
				double starX = (((0.76/1.9) * w) * i)/12;
				double starY = (((7./13.) * h) * j)/10;
				
				if((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
					
//					g.fillRect((int) starX,(int) starY, 3, 3);
					
//					xArray[i-1] = (int) starX;
//					yArray[j-1] = (int) starY;
					
					
					// set multiple indexes to values in calculated array
					xPoints[i-1] = calcStarX(i);
					yPoints[j-1] = calcStarY(j);
					
				}
				
			}
			
		}
		
		g.fillPolygon(x,y,10);
		
	}
	
	public int[] calcStarX(double i) {
		
		int[] x = new int[10];
		
		
		//Some Math here, 
		return x;
	}
	
	public int[] calcStarY(double j) {
		
		int[] y = new int[10];
		
		return y;
				
	}
	
	
	
}
