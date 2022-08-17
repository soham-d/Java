package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.Node;

public class BinarySearchTree {
	
	int size;
	Node rootNode; 
	//Node lastAddedNode;

	public BinarySearchTree(){
		System.out.println("[BinarySearchTree] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
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
		
		System.out.println("[BinarySearchTree] [Insert] Node Added: "+node+" and size is: "+size);
		node.showNode();
		
		//lastAddedNode = node;
		return node;
				
	}

	public int getSize() {
		return size;
	}

	public Node getRootNode() {
		return rootNode;
	}
	
	public void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");  // Print/Visit Root First
			preOrder(root.left);			  // Print/Visit left of the Root
			preOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);			  	  // Print/Visit left of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
			inOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);			  // Print/Visit left of the Root
			postOrder(root.right);			  // Print/Visit right of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
		}
	}

	public int minimum(Node root) {
		int min = root.data;


		return min;
	}

	public int maximum(Node root) {
		int max = root.data;


		return max;
	}
	
}
