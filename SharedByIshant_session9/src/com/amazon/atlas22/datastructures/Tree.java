package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.TreeNode;

public class Tree<T> {
	
	int size;
	TreeNode<T> rootNode; 

	public Tree(){
		System.out.println("[Tree] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
	}
	
	public TreeNode<T> insert(TreeNode<T> node, T data) {
		
		
		if(node == null) {
			// Create a new Node Object
			node = new TreeNode<T>(data);
			size++; 

			if(size == 1) {
				// Allocate the rootNode
				rootNode = node;
			}
			return node;
		}
		
		if(data instanceof Integer) {
			int d1 = (Integer)data;
			int d2 = (Integer)node.data;
			
			if(d1<d2) { // insert in the left
				node.left = insert(node.left, data);			
			}else {				// insert in the right
				node.right = insert(node.right, data);
			}
		}else if(data instanceof String) {
			String s1 = (String)data;
			String s2 = (String)node.data;
			
			if(s1.compareTo(s2) < 0) { // insert in the left
				node.left = insert(node.left, data);			
			}else {				// insert in the right
				node.right = insert(node.right, data);
			}
		}
		
		System.out.println("[Tree] [Insert] Node Added: "+node+" and size is: "+size);
		node.showNode();
		
		//lastAddedNode = node;
		return node;
				
	}

	public int getSize() {
		return size;
	}

	public TreeNode<T> getRootNode() {
		return rootNode;
	}
	
	public void preOrder(TreeNode<T> root) {
		if(root!=null) {
			System.out.print(root.data+" ");  // Print/Visit Root First
			preOrder(root.left);			  // Print/Visit left of the Root
			preOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void inOrder(TreeNode<T> root) {
		if(root!=null) {
			inOrder(root.left);			  	  // Print/Visit left of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
			inOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void postOrder(TreeNode<T> root) {
		if(root!=null) {
			postOrder(root.left);			  // Print/Visit left of the Root
			postOrder(root.right);			  // Print/Visit right of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
		}
	}
}
