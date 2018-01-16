package mobile;

public class Main {

	public static void main(String[] args) {
       // Here is one way to construct a mobile.
       //
       // Try drawing this by hand on a piece of paper as it
       // may make understanding the test cases easier.

		Branch b7 = new Branch(8, new Weight(1));
		Branch b8 = new Branch(2, new Weight(4));
		Mobile m4 = new Mobile(b7, b8);
		
		Branch b5 = new Branch(5, new Weight(2));
		Branch b6 = new Branch(2, m4);
		Mobile m3 = new Mobile(b5, b6);
		
		Branch b3 = new Branch(3, new Weight(4));
		Branch b4 = new Branch(4, new Weight(3));
		Mobile m2 = new Mobile(b3,b4);
		
		Branch b1 = new Branch(6, m2);
		Branch b2 = new Branch(6, m3);
		Mobile m1 = new Mobile(b1, b2);
		
		System.out.println(m1.getWeight());
		System.out.println(m1.isBalanced());
	}

}