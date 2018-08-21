/*
 * Aditya Kaliappan
 * March 7, 2016
 * Pd. 7
 * BSTTester.java ver. 1.0
 * 
 * This program tests the implemented BinarySearchTree class by adding new
 * nodes and finding nodes.
 */

public class BSTTester {

	public static void main(String[] args) {
		//variable
		BinarySearchTree t = new BinarySearchTree();
		
		//insert root node "Adam" into binary search tree
		t.insert("Adam");
		
		//output current binary search tree in order
		System.out.print("Inorder of Binary Search Tree After Adding" +
				" Root Node \"Adam\":\n\t");
		t.inorder();
		System.out.println();

		//insert node "Eve" into binary search tree
		t.insert("Eve");
		
		//output current binary search tree in order
		System.out.print("Inorder of Binary Search Tree After Adding" +
				" Node \"Eve\":\n\t");
		t.inorder();
		System.out.println();
		
		//insert node "Dick" into binary search tree
		t.insert("Dick");
		
		//output current binary search tree in order
		System.out.print("Inorder of Binary Search Tree After Adding" +
				" Node \"Dick\":\n\t");
		t.inorder();
		System.out.println();
		
		//insert remaining nodes into binary search tree
		t.insert("Romeo");
		t.insert("Juliet");
		t.insert("Tom");
		t.insert("Harry");
		
		//output current binary search tree in order
		System.out.print("Inorder of Binary Search Tree After Adding" +
				" Remaining Nodes:\n\t");
		t.inorder();
		System.out.println();
		
		//output whether node "Adam" is found in binary search tree
		System.out.print("Is Node \"Adam\" In The Binary Search Tree? ");
		System.out.println(t.find("Adam") != null);
		System.out.println();
		
		//output whether node "Harry" is found in binary search tree
		System.out.print("Is Node \"Harry\" In The Binary Search Tree? ");
		System.out.println(t.find("Harry") != null);
		System.out.println();
		
		//output whether node "Joe" is found in binary search tree
		System.out.print("Is Node \"Joe\" In The Binary Search Tree? ");
		System.out.println(t.find("Joe") != null);
		System.out.println();
		
		//output current binary search tree in preorder
		System.out.print("Preorder of Current Binary Search Tree:\n\t");
		t.preorder();
		System.out.println();
		
		//output current binary search tree in postorder
		System.out.print("Postorder of Current Binary Search Tree:\n\t");
		t.postorder();
		System.out.println();
		
		System.out.print("Inorder of Binary Search Tree After Removing" +
				" Root Node \"Adam\":\n\t");
		t.remove("Adam");
		t.inorder();
		System.out.println();
		
		System.out.print("Inorder of Binary Search Tree After Removing" +
		" Node \"Dick\" With No Child Nodes:\n\t");
		t.remove("Dick");
		t.inorder();
		System.out.println();
		
		System.out.print("Inorder of Binary Search Tree After Removing" +
		" Node \"Juliet\" With One Child Nodes:\n\t");
		t.remove("Juliet");
		t.inorder();
		System.out.println();
		
		System.out.print("Inorder of Binary Search Tree After Removing" +
		" Node \"Romeo\" With Two Child Nodes:\n\t");
		t.remove("Romeo");
		t.inorder();
		System.out.println();
	}//end of main

}//end of BSTTester