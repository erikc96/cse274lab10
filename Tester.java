
public class Tester {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add("a");
		bst.add("c");
		bst.add("b");
		bst.add("d");

		bst.inorderTraversal();
		System.out.println();
		bst.remove("c");
		bst.inorderTraversal();
		System.out.println();
		
	}

}
