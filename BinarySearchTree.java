/*
 * Aditya Kaliappan
 * March 7, 2016
 * Pd. 7
 * BinarySearchTree.java ver. 1.0
 * 
 * This program implements the BinarySearchTree class with insert, find, and
 * print methods to display the existing nodes, and extends the abstract
 * BinaryTree class.
 */

public class BinarySearchTree extends BinaryTree{
	public void insert(Comparable item) {
		if(isEmpty()){ //set the root node if no nodes exist
			setRoot(new TreeNode(item));
		} else{
			//variable
			TreeNode current = getRoot();
			
			//iterate through binary search tree to insert item
			while(current != null){
				//variable
				int compare = item.compareTo(current.getValue());
				
				if(compare <= 0){
					if(current.getLeft() != null){
						//check left child node if available
						current = current.getLeft();
					} else{
						//set the left child node as item
						current.setLeft(new TreeNode(item));
						current = null;
					}
				} else{
					if(current.getRight() != null){
						//check right child node if available
						current = current.getRight();
					} else{
						//set the right child node as item
						current.setRight(new TreeNode(item));
						current = null;
					}
				}
			}
		}
	}//end of insert()

	public TreeNode find(Comparable key) {
		//variable
		TreeNode current = getRoot();
		
		//iterate through binary search tree to find key
		while(current != null){
			//variable
			int compare = key.compareTo(current.getValue());
			
			if(compare < 0){ //check left child node if key < current
				current = current.getLeft();
			} else if(compare > 0){ //check right child node if key > current
				current = current.getRight();
			} else{ //return the TreeNode corresponding to key
				return current;
			}
		}
		
		//returns current, which is null since that is the only possible value
		//after the while loop
		return current;
	}//end of find()
	
	public boolean remove(Comparable item){
		//variables
		TreeNode toRemove = getRoot();
		TreeNode parent = null;
		boolean isFound = false;
		
		//loop to find node to remove and its parent, if they exist
		while(!isFound && toRemove != null){
			//variable
			int compare = item.compareTo(toRemove.getValue());
			
			if(compare == 0){
				//the desired node has been found
				isFound = true;
			} else{
				//set new parent node
				parent = toRemove;
				
				//set next node to assess to find desired node
				if(compare > 0){
					toRemove = toRemove.getRight();
				} else{
					toRemove = toRemove.getLeft();
				}
			}
		}
		
		//the desired node has been found to be removed if isFound is true
		if(isFound){
			//case for if desired node has one or no children
			if(toRemove.getLeft() == null || toRemove.getRight() == null){
				//variable
				TreeNode newNode;
				
				//find child node that is not null, if it exists
				if(toRemove.getLeft() == null){
					newNode = toRemove.getRight();
				} else{
					newNode = toRemove.getLeft();
				}
				
				if(parent == null){
					//set new root node since desired node for removal was
					//the old root node
					setRoot(newNode);
				} else if(parent.getLeft() == toRemove){
					//replace desired node with its left child
					parent.setLeft(newNode);
				} else{
					//replace desired node with its right child
					parent.setRight(newNode);
				}
				

			} else{ //case for two children
				//variables
				TreeNode nextParent = toRemove;
				TreeNode next = toRemove.getRight();
				
			    if (next.getLeft() == null){ //right node has no left child
			    	//change value of node to be removed to that of right child
			    	toRemove.setValue(next.getValue());
			    	
			    	//change node reference to right child of its right child
			    	toRemove.setRight(next.getRight());
			    } else{
					//find parent and node farthest left on the right subtree
					while(next.getLeft() != null){
						nextParent = next;
						next = next.getLeft();
					}
					
					//set value of node to be removed to next largest value
					toRemove.setValue(next.getValue());
					
					//set left node reference of parent node to right child
					//of next largest value node
					nextParent.setLeft(next.getRight());
			    }
			}
			
			//return true since node has been successfully removed
			return true;
		}
		
		//return false since the desired node does not exist to be removed
		return false;
	}//end of remove()
}//end of BinarySearchTree