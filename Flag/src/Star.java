
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
			
			for(int j = 1; j < 11; j++) {
				int starX = (int) (((D/B) * w) * i)/12;
				int starY = (int) (((7./13.) * h) * j)/10;
				
				if((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
					g.fillOval((int) starX,(int) starY, (int) starRadius, (int) starRadius);
					
					/*
					 * https://stackoverflow.com/questions/15620590/polygons-with-double-coordinates
					 * 
					 *  ^ Might have to do this
					 */
	
					newCalcStarX(40, starRadius);
					
					//g.fillPolygon(calcStarX(starX), calcStarY(starY), 5);
					
				}
				
			}
			
		}
		
	}
	
	public int[] newCalcStarX(int xPos, double radius) {
		
		double[] unformatted = new double[10];
		
		unformatted[0] = ((radius) * (Math.cos((Math.PI/180) * 18)));
		unformatted[1] = (unformatted[0] * ((1)/(Math.tan((Math.PI * 54) / 180))));
		unformatted[2] = 0;
		unformatted[3] = -unformatted[1];
		unformatted[4] = -unformatted[0];
		
		unformatted[5] = ((radius) * (Math.cos((Math.PI/180) * 54)));
		unformatted[6] = 0;
		unformatted[7] = -unformatted[5];
		unformatted[8] = radius * Math.cos((Math.PI/180) * 18) * Math.sin((Math.PI/180) * 18) / Math.sin((Math.PI * 180) / 54);
		
		unformatted[9] = -unformatted[8];
		
		for(int i = 0; i < unformatted.length; i++) {
			unformatted[i] += xPos;
		}
		
		int[] intArray = new int[10];
		
		
		//Convert to array of ints
		intArray = doubleToInt(unformatted);
		
		System.out.println(Arrays.toString(intArray));
		
		
		return intArray;
	}
	
	public int[] newCalcStarY(int yPos, double radius) {
		
		double[] unformatted = new double[5];
		
		
		// We need to do this
		//unformatted[0] = 0;
		unformatted[1] = unformatted[0];
		unformatted[2] = radius;
		unformatted[3] = unformatted[0];
		unformatted[4] = unformatted[0];
		
//		unformatted[5] = 0;
//		unformatted[6] = 0;
//		unformatted[7] = unformatted[5];
//		unformatted[8] = 0;
//		unformatted[9] = unformatted[8];

		for(int i = 0; i < unformatted.length; i++) {
			unformatted[i] += yPos;
		}
		
		int[] intArray = new int[5];
		
		intArray = doubleToInt(unformatted);
		
		return intArray;
	}
	
	
	public int[] doubleToInt(double[] doubleArray) {
		
		int[] intArray = new int[doubleArray.length];
		
		for(int i = 0; i < doubleArray.length; i++) {
			intArray[i] = (int) doubleArray[i];
		}
		
		return intArray;
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
