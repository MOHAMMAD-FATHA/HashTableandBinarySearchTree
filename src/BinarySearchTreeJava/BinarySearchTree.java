package BinarySearchTreeJava;

/*
 * @author Mohammad Fatha 
 * Purpose to create a method to add elements in Binary Tree
 */

class Node {
	int data;
	Node left, right;

}

class NodeBST {

	public Node insert(Node node,int data) {
        if (node == null ){
            return createNode(data);
        }
        if ( data < node.data){
            node.left = insert(node.left,data);

        }else if (data > node.data){
            node.right = insert(node.right,data);
        }
        return node;
    }

	private Node createNode(int data) {
        Node root = new Node();
        root.data = data;
        root.left = null;
        root.right = null;
        return root;
    }
	public boolean searchNode(Node node,int data){
        if (node == null) return false;
        boolean isPresent = false;
        while (node != null){
            if (data < node.data){
                node = node.left;
            }
            else if(data > node.data){
                node=node.right;
            }
            else {
                isPresent = true;
                break;
            }
        }
        return  isPresent;
    }
	
	public void inorderTraversal(Node node) {
		if (node == null)
			System.out.println("Tree is empty");
		else {
			if (node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				inorderTraversal(node.right);
		}
	}
	
}


	
public class BinarySearchTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NodeBST tree = new NodeBST();
		Node node = new Node();
		tree.insert(node, 56);
		tree.insert(node,30);
		tree.insert(node,70);
		tree.insert(node,22);
		tree.insert(node,40);
		tree.insert(node,11);
		tree.insert(node,3);
		tree.insert(node,16);
		tree.insert(node,60);
		tree.insert(node,95);
		tree.insert(node,65);
		tree.insert(node,63);
		tree.insert(node,67);

		System.out.println(" Element present in the tree :: "+ tree.searchNode(node,63));
		System.out.println();
		System.out.println("Level order traversal of binary tree is ");
		tree.inorderTraversal(node);
	}
}
