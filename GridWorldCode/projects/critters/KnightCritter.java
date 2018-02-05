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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.Actor;

import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

/**
 * A <code>CrabCritter</code> looks at a limited set of neighbors when it eats and moves.
 * <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class KnightCritter extends Critter
{
    public KnightCritter()
    {
        setColor(Color.RED);
    }

    /**
     * A crab gets the actors in the three locations immediately in front, to its
     * front-right and to its front-left
     * @return a list of actors occupying these locations
     */
    public ArrayList<Actor> getActors()
    {
    		
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int[] dirs =
            { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
        for (Location loc : getLocationsInDirections(dirs))
        {
        	
            Actor a = getGrid().get(loc);
            if (a != null)
                actors.add(a);
        }

        return actors;
    }

    /**
     * @return list of empty locations immediately to the right and to the left
     */
    public ArrayList<Location> getMoveLocations()
    {
    	
    		ArrayList<Location> locs = new ArrayList<Location>();
        int[] dirs =
            { Location.LEFT, Location.RIGHT };
        for (Location loc : getLocationsInDirections(dirs)) {
        	
            if (getGrid().get(loc) == null) {
                locs.add(loc);
            }
        
        }     
            
        return locs;
    }

    /**
     * If the crab critter doesn't move, it randomly turns left or right.
     */
    public void makeMove(Location loc)
    {
    	
    		Location newLocation = loc;
    		Location oldLocation = getLocation();
    	
        /*if (loc.equals(getLocation()))
        {
            //double r = Math.random();
            
            int angle;
            
            
            
            if (r < 1.00) 
                angle = Location.LEFT;
            else
                angle = Location.RIGHT;
            
            angle = Location.LEFT;
            
            setDirection(getDirection() + angle);
        }
        else*/
    		
    		Grid gr = getGrid();  		
    		
    		try {
    			
    			String adjacentActorName = gr.getNeighbors(newLocation).get(0).getClass().getName();
    			
    			adjacentActorName = adjacentActorName.substring(adjacentActorName.lastIndexOf(".") + 1); 			
    			
    			switch (adjacentActorName) {
    			
    				case "Rock":
    					Rock currentRock = (Rock) gr.getNeighbors(newLocation).get(0);	
    					Color currentRockColor = (Color) currentRock.getColor();
    					this.setColor(currentRockColor);			
    			
    			}
    			
    		}
    		catch (IndexOutOfBoundsException e) {}
    		
        super.makeMove(newLocation);

    }
    
    /**
     * Finds the valid adjacent locations of this critter in different
     * directions.
     * @param directions - an array of directions (which are relative to the
     * current direction)
     * @return a set of valid locations that are neighbors of the current
     * location in the given directions
     */
    public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
    	
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();
        
        		int[][] knightPathPossibilities = {
        			
        			{1, 2},
        			{2, 1},
        			{-1, -2},
        			{-2, -1},
        			{1, -2},
        			{-1, 2},
        			{-2, 1},
        			{2, 1},
        		
        		};
        		
        		System.out.println(knightPathPossibilities);
        	
    		Location loc1 = new Location(getLocation().getRow() + 1, getLocation().getCol() + 2);
    		Location loc2 = new Location(getLocation().getRow() + 2, getLocation().getCol() + 1);
    		Location loc3 = new Location(getLocation().getRow() - 1, getLocation().getCol() - 2);
    		Location loc4 = new Location(getLocation().getRow() - 2, getLocation().getCol() - 1);
    		Location loc5 = new Location(getLocation().getRow() + 1, getLocation().getCol() - 2);
    		Location loc6 = new Location(getLocation().getRow() - 1, getLocation().getCol() + 2);
    		Location loc7 = new Location(getLocation().getRow() - 2, getLocation().getCol() + 1);
    		Location loc8 = new Location(getLocation().getRow() + 2, getLocation().getCol() - 1);

    		
    		if(gr.isValid(loc1)) {
    			locs.add(loc1);
        		//System.out.println(loc1);
    		}
    		if(gr.isValid(loc2)) {
    			locs.add(loc2);
        		//System.out.println(loc2);
    		}
    		if(gr.isValid(loc3)) {
    			locs.add(loc3);
        		//System.out.println(loc3);
    		}
    		if(gr.isValid(loc4)) {
    			locs.add(loc4);
        		//System.out.println(loc4);
    		}
    		if(gr.isValid(loc5)) {
    			locs.add(loc5);
        		//System.out.println(loc5);
    		}
    		if(gr.isValid(loc6)) {
    			locs.add(loc6);
        		//System.out.println(loc6);
    		}
    		if(gr.isValid(loc7)) {
    			locs.add(loc7);
        		//System.out.println(loc7);
    		}
    		if(gr.isValid(loc8)) {
    			locs.add(loc8);
        		//System.out.println(loc8);
    		}
    		
    		
        
        /*if (gr.isValid(neighborLoc)) {
            locs.add(neighborLoc);
        		System.out.println(neighborLoc);	
        }*/
          
     
        return locs;
    }    
}
