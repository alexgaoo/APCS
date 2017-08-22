
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

import javax.swing.JApplet;

public class Star extends Flag {
	
	public void drawStar(Graphics g, int w, int h) {
		
		g.setColor(Color.white);
		
		for(int i = 1; i < 12; i++) {
			
			for(int j = 1; j < 11; j++) {
				int starX = (int) (((D/B) * w) * i)/12;
				int starY = (int) (((7./13.) * h) * j)/10;
				
				if((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
					//g.fillRect((int) starX,(int) starY, 3, 3);
					
					//System.out.println("X: " + starX + "\nY: " + starY + "\n---");
					
					System.out.println(((1/Math.tan(18*Math.PI/180)) * 0.00952));
					
					System.out.println((0.0308 * Math.cos(18.0*Math.PI/180)));
					
					/*
					 * https://stackoverflow.com/questions/15620590/polygons-with-double-coordinates
					 * 
					 *  ^ Might have to do this
					 */
					
					
					
					
					//g.fillPolygon(calcStarX(starX), calcStarY(starY), 5);
					
				}
				
			}
			
		}
		
	}
	
	public int[] newCalcStarX(int xPos) {
		
		
		
		return null;
	}
	
	public int[] newCalcStarY(int yPos) {
		
		
		
		return null;
	}
	
	
	public int[] calcStarX(int i) {
		
		double radius = 0.0308;
		
		//Change to 10 indices
		double[] x = new double[5];
		
		x[0] = (radius * Math.cos(18.0*Math.PI/180));
		x[1] = ((1/Math.tan(18*Math.PI/180)) * 0.00952);
		x[2] = 0;
		x[3] = -x[1];
		x[4] = -x[0];
		
		//Change to 10 indices
		for(int n = 0; n <= 4; n++) {
			x[n] *= (radius * 1000) * i;
			//System.out.println(x[n]);
		}
		
		int[] finalArray = new int[5];
		
		
		//Parsing double array as int.. runs into problems with rounding
		for (int ii=0; ii<x.length; ii++)
		    finalArray[ii] = (int) x[ii];
		
		//System.out.println(x);
		return finalArray;
	}
	
	public int[] calcStarY(int j) {
		
		//Change to 10 indices
		double[] y = new double[5];
		
//		y[0] = (int) (K*Math.sin(18.0*Math.PI/180));
//		y[1] = y[1];
//		y[2] = (int) K;
//		y[3] = y[1];
//		y[4] = y[1];
		
		//Test
		y[0] = 0.00952;
		y[1] = 0.00952;
		y[2] = 0.01;
		y[3] = 0.00952;
		y[4] = 0.00952;
		
		//Change to 10 indices
		for(int n = 0; n <= 4; n++) {
			y[n] *= (0.0308 * 1000 * j);
		}
		
		int[] finalArray = new int[5];
		
		for (int ii=0; ii<y.length; ii++)
		    finalArray[ii] = (int) y[ii];
		
		//System.out.println(x);
		return finalArray;
	
				
	}
	
	
	
}
