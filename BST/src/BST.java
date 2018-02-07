public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(T datum) {
		left = new BST<T>(datum);
	}

	public void setRight(T datum) {
		right = new BST<T>(datum);
	}
	
	public int depth() {
	    
	    int leftdepth = 0;
	    int rightdepth = 0;
	    
	    if(getLeft() != null) {
		leftdepth += getLeft().depth();
	    }
	    else if(getRight() != null) {
		rightdepth += getRight().depth();
	    }
	    
	    int max = Math.max(leftdepth, rightdepth);
	    
	    return 1 + max;
	    
	}

	public void insert(T datum) {
	
	    
	    if(datum.compareTo(this.datum) == 1) {
		
		if(getRight() == null) {
		    setRight(datum);
		    return;
		} else {
		    getRight().insert(datum);
		}
		
	    }
	    
	    else if(datum.compareTo(this.datum) == -1) {
		
		if(getLeft() == null) {
		    setLeft(datum);
		    return;
		} else {
		    getLeft().insert(datum);
		}
		
	    }
		    
	    
	}
	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}
}