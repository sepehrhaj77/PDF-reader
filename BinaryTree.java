/*
 * Aditya Kaliappan
 * March 7, 2016
 * Pd. 7
 * BinaryTree.java ver. 1.0
 * 
 * This program implements the abstract BinaryTree class for use with the
 * BinarySearchTree class.
 */

public abstract class BinaryTree{
	//instance variable
	private TreeNode root;
	
	public BinaryTree(){
		root = null;
	}//end of BinaryTree()
	
	public TreeNode getRoot(){
		return root;
	}//end of getRoot()
	
	public void setRoot(TreeNode theNewNode){
		root = theNewNode;
	}//end of setRoot()
	
	public boolean isEmpty(){
		return root == null;
	}//end of isEmpty()
	
	public void inorder(){
		//call the doInorder() method to recursively display the binary search
		//tree if at least one node exists
		if(!isEmpty()){
			doInorder(root);
		}
		System.out.println();
	}//end of inorder()
	
	private void doInorder(TreeNode node){
		//call the doInorder() method recursively if a left node exists
		if (node.getLeft() != null){
			doInorder(node.getLeft());
		}
		
		//display the current node
		System.out.print(node.getValue() + " ");
		
		//call the doInorder() method recursively if a right node exists
		if (node.getRight() != null){
			doInorder(node.getRight());
		}
	}//end of doInorder()
	
	public void preorder(){
		//call the doPreorder() method to recursively display the binary search
		//tree if at least one node exists
		if(!isEmpty()){
			doPreorder(root);
		}
		System.out.println();
	}//end of preorder()
	
	private void doPreorder(TreeNode node){
		//display the current node
		System.out.print(node.getValue() + " ");
		
		//call the doPreorder() method recursively if a left node exists
		if (node.getLeft() != null){
			doPreorder(node.getLeft());
		}
		
		//call the doPreorder() method recursively if a right node exists
		if (node.getRight() != null){
			doPreorder(node.getRight());
		}
	}//end of doPreorder()
	
	public void postorder(){
		//call the doPostorder() method to recursively display the binary search
		//tree if at least one node exists
		if(!isEmpty()){
			doPostorder(root);
		}
		System.out.println();
	}//end of postorder()
	
	private void doPostorder(TreeNode node){
		//call the doPostorder() method recursively if a left node exists
		if (node.getLeft() != null){
			doPostorder(node.getLeft());
		}
		
		//call the doPostorder() method recursively if a right node exists
		if (node.getRight() != null){
			doPostorder(node.getRight());
		}
		
		//display the current node
		System.out.print(node.getValue() + " ");
	}//end of doPostorder()
	
	//abstract methods to be implemented in derived classes
	public abstract void insert(Comparable item);
	public abstract TreeNode find(Comparable key);
	public abstract boolean remove(Comparable item);
}//end of BinaryTree