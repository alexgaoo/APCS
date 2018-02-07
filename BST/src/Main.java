
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.setLeft(7);
		bsti.getLeft().setLeft(4);
		bsti.getLeft().setRight(3);
		bsti.setRight(19);
		
		System.out.println(bsti);
	}

}
