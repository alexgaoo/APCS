package mobile;

//You write this.
//
//If you make Structure a class, Mobile must extend it.
//If you make Structure an interface, Mobile must implement it.

public class Mobile implements Structure{	
	// This constructor is mandatory by problem specification
	// You have to figure out how to handle it
	Branch left;
	Branch right;

	public Mobile(Branch left, Branch right) {
		this.left = left;
		this.right = right;
	}

	public double getWeight() {
		return (left.getStructure().getWeight() + right.getStructure().getWeight());
	}

	public boolean isBalanced() {
		return (left.torque() == right.torque());
	}
}
