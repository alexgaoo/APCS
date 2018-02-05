import info.gridworld.grid.Location;

/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class TriangleBug extends Bug
{
    private int steps;
    private int sideLength;
    private int turnStage = 0;
    private String stage = "first";
    private int ticker = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public TriangleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }
    
    public void turn(int nth) {
    	
		for(int i = 0; i <= nth; i++) {
			setDirection(getDirection() + Location.HALF_RIGHT);
		}
		
		// 2 for first and third turn, 1 for second turn
	
}

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
    	
    		System.out.println(turnStage);
    	
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
        		
        		if(ticker == 2) {
        			turn();
        			turn();
        			ticker = 0;
        		} else {
        			turn();
        			turn();
        			turn();
        			ticker++;
        		}
            
            
            
            steps = 0;
            
        }
    }
}
