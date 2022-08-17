package com.amazon.atlas22.datastructures;

public class productBST {

    int size;
    ProductTreeNode<T> rootNode;

    public Tree(){
        System.out.println("[ProductTree] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
    }

    public ProductTreeNode<T> insert(ProductTreeNode<T> node, T data) {


        if(node == null) {
            // Create a new Node Object
            node = new ProductTreeNode<T>(data);
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

    public ProductTreeNode<T> getRootNode() {
        return rootNode;
    }

    public void preOrder(ProductTreeNode<T> root) {
        if(root!=null) {
            System.out.print(root.data+" ");  // Print/Visit Root First
            preOrder(root.left);			  // Print/Visit left of the Root
            preOrder(root.right);			  // Print/Visit right of the Root
        }
    }

    public void inOrder(ProductTreeNode<T> root) {
        if(root!=null) {
            inOrder(root.left);			  	  // Print/Visit left of the Root
            System.out.print(root.data+" ");  // Print/Visit Root First
            inOrder(root.right);			  // Print/Visit right of the Root
        }
    }

    public void postOrder(ProductTreeNode<T> root) {
        if(root!=null) {
            postOrder(root.left);			  // Print/Visit left of the Root
            postOrder(root.right);			  // Print/Visit right of the Root
            System.out.print(root.data+" ");  // Print/Visit Root First
        }
    }
}