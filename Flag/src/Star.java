
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Star extends Flag {
	
	public void drawStar(Graphics g, int w, int h) {
		
		g.setColor(Color.white);
		
		for(int i = 1; i < 12; i++) {
			
			for(int j = 1; j < 11; j++) {
				int starX = (int) (((D/B) * w) * i)/12;
				int starY = (int) (((7./13.) * h) * j)/10;
				
				if((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
//					g.fillRect((int) starX,(int) starY, 3, 3);
					//Change function below to 10 points
					g.fillPolygon(calcStarX(starX), calcStarY(starY), 5);
					
				}
				
			}
			
		}
		
	}
	
	public int[] calcStarX(int i) {
		
		//Change to 10 indices
		int[] x = new int[5];
		
//		x[0] = (int) (K*Math.cos(18.0*Math.PI/180));
//		x[1] = (int) (K*Math.sin(18.0*Math.PI/180)*Math.cos(54.0*Math.PI/180)/(Math.sin(54.0*Math.PI/180)));
//		x[2] = (int) 0;
//		x[3] = -x[2];
//		x[4] = -x[1];
		
		//Test
		x[0] = 0;
		x[1] = 0;
		x[2] = 1;
		x[3] = 1;
		x[4] = 1;
		
		
		//Change to 10 indices
		for(int n = 0; n < 5; n++) {
			x[n] += i;
		}
		System.out.println(x);
		return x;
	}
	
	public int[] calcStarY(int j) {
		
		//Change to 10 indices
		int[] y = new int[5];
		
//		y[0] = (int) (K*Math.sin(18.0*Math.PI/180));
//		y[1] = y[1];
//		y[2] = (int) K;
//		y[3] = y[1];
//		y[4] = y[1];
		
		//Test
		y[0] = 0;
		y[1] = 1;
		y[2] = 1;
		y[3] = 0;
		y[4] = -1;
		
		//Change to 10 indices
		for(int n = 0; n < 5; n++) {
			y[n] += j;
		}
		System.out.println(y);
		
		return y;
				
	}
	
	
	
}
