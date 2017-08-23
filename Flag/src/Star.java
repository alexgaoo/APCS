
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

import javax.swing.JApplet;

public class Star extends Flag {
	
	public void drawStar(Graphics g, int w, int h) {
		
		g.setColor(Color.white);
		
		int height = h;
		int width = w;
		
		double starRadius = (((width / 1.9) * (K)) / (2));
		
		for(int i = 1; i < 12; i++) {
			
			for(int j = 1; j < 10; j++) {
				int starX = (int) (((D/B) * w) * i)/12;
				int starY = (int) (((7./13.) * h) * j)/10;
				
				if((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
//					g.fillOval((int) starX,(int) starY, (int) starRadius, (int) starRadius);
					
					/*
					 * https://stackoverflow.com/questions/15620590/polygons-with-double-coordinates
					 * 
					 *  ^ Might have to do this
					 */
					
					g.fillPolygon(newCalcStarX(starX, starRadius), newCalcStarY(starY, starRadius), 10);
					
				}
				
			}
			
		}
		
	}
	
	public int[] newCalcStarX(int xPos, double radius) {
		
		double[] coord = new double[10];
		
		coord[0] = ((radius) * (Math.cos((Math.PI/180) * 18)));
		coord[1] = (radius) * (Math.sin((Math.PI/180) * 18)) / (Math.tan((Math.PI * 180) / 54));
		coord[2] = 0;
		coord[3] = -coord[1];
		coord[4] = -coord[0];
		
		coord[5] = (radius * Math.cos((Math.PI/180) * 18) * Math.sin((Math.PI/180) * 18) / Math.sin((Math.PI * 180) / 54));
		coord[6] = -((radius) * (Math.cos((Math.PI/180) * 54)));
		coord[7] = 0;
		coord[8] = -coord[6];
		coord[9] = -coord[5];
		
		for(int i = 0; i < coord.length; i++) {
			coord[i] += xPos;
		}
		
		int[] intArray = new int[10];
		
		//Convert to array of ints
		intArray = doubleToInt(coord);
		
		return intArray;
	}
	
	public int[] newCalcStarY(int yPos, double radius) {
		
		double[] coord = new double[10];
		
		
		// We need to do this
		coord[0] = radius * Math.sin((Math.PI/180) * 18);
		coord[1] = coord[0];
		coord[2] = radius;
		coord[3] = coord[0];
		coord[4] = coord[0];

		coord[5] = radius * Math.sin((Math.PI/180) * 18) * Math.sin((Math.PI/180) * 342) / Math.sin((Math.PI/180) * 54);
		coord[6] = radius * Math.sin((Math.PI/180) * 234);
		coord[7] = -(radius * Math.sin((Math.PI/180) * 18) / Math.sin((Math.PI/180) * 54));
		coord[8] = coord[6];
		coord[9] = coord[5];

		for(int i = 0; i < coord.length; i++) {
			coord[i] *= -1;
			coord[i] += yPos;
			
		}
		
		int[] intArray = new int[10];
		
		intArray = doubleToInt(coord);
		
		return intArray;
	}
	
	
	public int[] doubleToInt(double[] doubleArray) {
		
		int[] intArray = new int[doubleArray.length];
		
		for(int i = 0; i < doubleArray.length; i++) {
			intArray[i] = (int) doubleArray[i];
		}
		
		return intArray;
	}
	
}
