/*
 * Aditya Kaliappan
 * March 7, 2016
 * Pd. 7
 * TreeNode.java ver. 1.0
 * 
 * This program implements the TreeNode class to be used with any tree-related
 * classes.
 */

public class TreeNode {
	//instance variables
	private Object value;
	private TreeNode left, right;
	
	public TreeNode(Object initValue) {
		value = initValue;
		left = null;
		right = null; 
	}//end of TreeNode()

	public TreeNode(Object initValue, TreeNode initLeft, TreeNode initRight) {
		value = initValue;
		left = initLeft;
		right = initRight;
	}//end of TreeNode()

	public Object getValue() {
		return value;
	}//end of getValue()
	
	public TreeNode getLeft() {
		return left;
	}//end of getLeft()
	
	public TreeNode getRight() {
		return right;
	}//end of getRight()
	
	public void setValue(Object theNewValue) {
		value = theNewValue;
	}//end of setValue()
	
	public void setLeft(TreeNode theNewLeft) {
		left = theNewLeft;
	}//end of setLeft()
	
	public void setRight(TreeNode theNewRight) {
		right = theNewRight;	
	}//end of setRight()
}//end of TreeNode