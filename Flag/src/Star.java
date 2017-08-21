
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Star extends Flag {
	
	public void drawStar(Graphics g, int w, int h) {
		
		g.setColor(Color.white);
		
		int width = w;
		int height = h;
	
		int[] xArray = new int[50];
		int[] yArray = new int[50];
		
		for(int i = 1; i < 12; i++) {
			
			for(int j = 1; j < 11; j++) {
			
				double starX = (((0.76/1.9) * width) * i)/12;
				double starY = (((7./13.) * height) * j)/10;
				
				if((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
					
					int xIndex = (i-1);
					int yIndex = (j-1);
					
					g.fillRect((int) starX,(int) starY, 3, 3);
					
					xArray[xIndex] = (int) starX;
					yArray[yIndex] = (int) starY;
					
				}
				
			}
			
			
		}
		
		
		
		
	}
	
	
}
