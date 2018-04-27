
public class Tester {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add("house");
		bst.add("mouse");
		bst.add("cat");
		bst.add("dog");
		bst.add("cob");
		bst.add("egg");

		bst.inorderTraversal();
		bst.remove("house");
		bst.inorderTraversal();
		bst.remove("mouse");
		bst.inorderTraversal();
		bst.remove("aa");
		bst.inorderTraversal();
		
	}

}
