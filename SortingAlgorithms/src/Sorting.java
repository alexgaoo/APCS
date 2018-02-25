import java.util.Arrays;

public class Sorting {
    
    public static void main(String[] args) {
	
	
	int[] array = new int[10];
	
	
	array[0] = 10;
	array[1] = 25;	
	array[2] = 40;
	array[3] = 102;
	array[4] = 324;
	array[5] = 144;
	array[6] = 321;
	array[7] = 123;
	array[8] = 9;
	array[9] = 33;
	
	int[] test = new int[1];
	test[0] = 10;
	
	
	System.out.println("Initial: " + Arrays.toString(array));
	
	System.out.println("Insertion: " + Arrays.toString(selectionSort(array)));
	
	// System.out.println(Arrays.toString(insertAt(test, 0, 1000)));
	
    }
    
    	
    	public static int[] copyArray(int[] array) {
    	    int[] output = new int[array.length];
    	    return output;
    	}
    	
    	public static int[] insertAt(int[]input, int index, int newNumber) {
    	    
    	    int[] output = new int[input.length + 1];
    	    
    	    boolean inserted = false;
    	    
    	    for (int i = 0; i < input.length; i++) {
    		
    		if(i == index) {
    		    output[i] = newNumber;
    		    output[i + 1] = input[i];
    		    inserted = true;
    		} else {
    		    if(inserted) {
    			output[i + 1] = input[i];
    		    }else {
    			output[i] = input[i];
    		    }
    		    
    		}
    		
    		
    	    }
    	    
    	    return output;
    	    
    	    
    	}
    
    	public static int[] swap(int[] input, int firstIndex, int secondIndex) {
    	    
    	    int firstValue = input[firstIndex];
    	    int secondValue = input[secondIndex];
    	    
    	    input[firstIndex] = secondValue;
    	    input[secondIndex] = firstValue;
    	    
    	    return input;
    	    
    	    
    	}
    	
    	public static int[] bubbleSort(int[] input) {
    	    
    	    int[] output = copyArray(input);
    	    
    	    for(int i = 0; i < input.length; i++) {
    		
    		for(int j = 0; j < input.length - 1; j++) {
  
        			//output = swap(input, j);
        			
        			int currentIndex = j;
        			
        			int first = input[currentIndex];
        			int second = input[currentIndex + 1];
        			
        			if (first > second) {
        		                output = swap(input, currentIndex, currentIndex + 1);
        		            } 
 
        	    	}
    	    }
    		
    		
    	    return output;
    	}

    	public static int[] insertionSort(int[] input) {
    	    
    	    int[] output = new int[2];
    	    
    	    for (int i = 0; i < input.length; i++) {
    		
    		int currentIndex = i;
    		
    		int currentNumber = input[currentIndex];
    		
    		if(currentIndex == 0) {
    		    output[0] = currentNumber;
    		}
    		
    		else if(currentNumber < output[0]) {
    		    output = insertAt(output, 0, currentNumber);
    		}
    		
    		else if(currentIndex != 0) {
    		    
    		    int largestIndex = currentIndex - 1;
    		    int largestNumber = output[largestIndex];
    		    
    		    if(currentNumber > largestNumber) {
    			
    			output = insertAt(output, currentIndex, currentNumber);
    		    }
    		    else if(largestNumber > currentNumber) {
    			
    			while (largestNumber > currentNumber) {
    			    
    			    if(largestIndex == 0) {
    				output = insertAt(output, 0, currentNumber);
    			    }
    			    
    			    largestIndex--;
    			    largestNumber = output[largestIndex]; 
    			    
    			}
    			output = insertAt(output, largestIndex + 1, currentNumber);
    			
    			
    		    }
    		    
    		    
    		}
    		
    	    }
    	    
    	    int[] newOutput = removeLast(output);
    	    
    	    return newOutput;
    	    
    	    
    	}
    	
    	public static int[] selectionSort(int[] input) {
    	    
    	    for(int i = 0; i < input.length; i++) {
    		
    		int currentIndex = i;
    		int lowestSoFar = input[i];
    		int lowestIndex = i;
    		
    		int tempLowest = input[i];

    		for(int j = 1 + i; j < input.length; j++) {
  
    		    int compareNum = input[j];
    		    
    		    if(compareNum < lowestSoFar && compareNum < tempLowest)  {
    			lowestIndex = j;
    			tempLowest = compareNum;
    		    }    		    
    		}
    	
    		input = swap(input, currentIndex, lowestIndex);
  
    	    }
    	    
    	    return input;
    	    
    	}
    	
    	public static int[] removeLast(int[] array) {
    	    
    	    int length = array.length;
    	    
    	    int[] newArray = new int[length - 1];
    	    
    	    for(int i = 0; i < length - 1; i++) {
    		newArray[i] = array[i];
    	    }
    	    
    	    return newArray;
    	}
    	
}
