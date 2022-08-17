package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.Node;

/*
 	
 	BF -> H(TR) - H(TR)
 	-1	:	Left Tree is at 1 level lower than Right Tree
 	0	:	Left Tree is at same level as Right Tree is
 	1	:   Left Tree is at 1 level up than Right Tree
 	
 	
 	In order to Balance the Tree, we need to rotate it
 	Based on certain criteria....
 	
 	When to Rotate -> If balance factor is not -1, 0 or 1
 	
 */

public class AVLTree {

	int size;
	Node rootNode; 

	public AVLTree(){
		System.out.println("[AVLTree] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
	}
	
	public Node insert(Node node, int data) {

		if(node == null) {
			// Create a new Node Object
			node = new Node(data);
			size++; 

			if(size == 1) {
				// Allocate the rootNode
				rootNode = node;
			}
			return node;
		}
		
		if(data<node.data) { // insert in the left
			node.left = insert(node.left, data);			
		}else {				// insert in the right
			node.right = insert(node.right, data);
		}
		
		System.out.println("[AVLTree] [Insert] Node Added: "+node+" and size is: "+size);
		node.showNode();

		// Capture the height from left and right and add 1
		node.height = getMaxHeight(height(node.left), height(node.right))+1;


		int balance = balanceFactor(node);
		System.out.println("[AVLTree] [Insert] Balance Factor for : "+node.data+" and size is: "+balance);

		// Code for 4 cases goes here
		// 1. Left-Left case

		if(balance > 1 && data < node.left.data){
			System.out.println("[AVLTree] [Insert] Case1: LL case | Right Rotation required");
			//rotate left
			return rightRotate(node);
		}
		// 2. Right-right case
		if (balance < -1 && data < node.right.data){
			System.out.println("[AVLTree] [Insert] Case2: RR case | Left Rotation required");
			//rotate right
			return leftRotate(node);
		}

		// 3. Left-Right case
		if (balance > 1 && data>node.left.data){
			System.out.println("[AVLTree] [Insert] Case3: LR case | Left > Right Rotation required");
			// rotate left-right

			node.left = leftRotate(node.left);
			return rightRotate(node);

		}

		// 4. Right-left case
		if(balance<-1 && data<node.left.data){
			System.out.println("[AVLTree] [Insert] Case4: RL case | Right > Left Rotation required");

			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		//lastAddedNode = node;
		return node;
				
	}

	public int getSize() {
		return size;
	}

	public Node getRootNode() {
		return rootNode;
	}
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);			  	  // Print/Visit left of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
			inOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	// Iterate in the left subtree
	public int minimum(Node root) {
		int min = root.data;
		
		Node temp = root;
		
		while(temp.left != null) {
			min = temp.left.data;
			temp = temp.left;
		}
		
		return min;
	}
	
	// Iterate in the right subtree
	public int maximum(Node root) {
		int max = root.data;
		
		Node temp = root;
		
		while(temp.right != null) {
			max = temp.right.data;
			temp = temp.right;
		}
		
		return max;
	}

	int height(Node node){
		if(node != null){
			return node.height;
		}
		return  0;
	}
	int balanceFactor(Node node){
		if(node==null){
			return 0;
		}
		return height(node.left)-height(node.right);
	}

	int getMaxHeight(int leftHeight, int rightHeight){
		int maxHeight = leftHeight > rightHeight ? leftHeight : rightHeight;
		return maxHeight;

	}
	Node rightRotate(Node node){

		Node leftNode = node.left;
		Node leftNodesRightNode = leftNode.right;

		//perform rotation
		leftNode.right = node;
		node.left = leftNodesRightNode;

		//update heights
		node.height = getMaxHeight(height(node.left), height(node.right))+1;
		leftNode.height = getMaxHeight(height(leftNode.left), height(leftNode.right))+1;

		return leftNode;
	}
	Node leftRotate(Node node){
		Node rightNode = node.right;
		Node rightNodesLeftNode = rightNode.left;

		//perform rotation
		rightNode.left = node;
		node.right = rightNodesLeftNode;

		//update heights
		node.height = getMaxHeight(height(node.right), height(node.left))+1;
		rightNode.height = getMaxHeight(height(rightNode.left), height(rightNode.right))+1;

		return rightNode;
	}


}
