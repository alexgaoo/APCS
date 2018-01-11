package cow;

import java.util.Arrays;

public class Cowcompare {
	public static void main(String[] args) {
	    Cow[] cows = { new Cow(2000, "Hulk"),
	                   new Cow(),
	                   new Cow(1600, "Bessie"),
	                   new Cow(1700, "Moohead"),
	                   new Cow(),
	                   new Cow(1900, "Big Time Jones") };

	    printArray(cows);
	    Arrays.sort(cows);
	    printArray(cows);
	}
	
	public static void printArray(Cow[] list) {
		
		int list_length = list.length;
		
		String[] returnString = new String[list_length];
		
		for(int i = 0; i < list.length; i++) {
//			returnString[i] = list[i].toString();
			System.out.println(list[i].toString());
		}
		
//		System.out.println(returnString);
//		return returnString;
		
	}
}
