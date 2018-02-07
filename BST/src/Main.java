import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
						
		BST<Integer> trialBST = bst();
		
		System.out.println(trialBST.depth());
		
	}
	
	
	public static BST<Integer> bst() {
	    
	    Randp numsarray = new Randp(10000);
	    
	    for(int j = 0; j <= 10000; j++) {
		//System.out.println(numsarray.nextInt());
	    }
	    
	    BST<Integer> bsti = new BST<Integer>(numsarray.nextInt());
	    
	    for(int i = 0; i < 9999; i++) {
		int current = numsarray.nextInt();
		bsti.insert(current);
	    }
	    
	    return bsti;
	}

}
