package BinarySearchTreeJava;

public class NodeRunner {
	public Node searchNode(Node root, int value) {
		if (root == null || root.data == value)
			return root;

		if (root.data > value) {
			return searchNode(root.left, value);
		}
		return searchNode(root.right, value);
	}

}
