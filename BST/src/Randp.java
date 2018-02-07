import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Randp {
    
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
	
	initNums(n);

    }
	
    private void initNums(int n) {
        
	this.nums = new int[n];
	
	for(int i = 0; i < n; i++) {
	    this.nums[i] = i + 1;
	}
	
	this.numsLeft = n;
	
    }
	
    public int nextInt() {
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
	
	if(this.numsLeft == 0) {
	    return 0;
	}
	
	Random r = new Random();
	int rand = r.nextInt(this.numsLeft) + 1;
	int randIndex = rand - 1;
	
	int randInt = this.nums[randIndex];
	int returnMe = randInt;
	
	this.nums[randIndex] = this.nums[numsLeft - 1];
	
	numsLeft--;

	return returnMe;
	
    }
}
