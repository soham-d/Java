package com.amazon.atlas22.datastructures;
import com.amazon.atlas22.model.Node;

import java.util.SortedMap;

public class BinarySearchTree {
    int size;
    Node rootNode;
    //Node lastAddedNode;

    public BinarySearchTree() {
        System.out.println("[BinarySearchTree] Created at " + this + " with size: " + size + " and rootNode as " + rootNode);
    }

    public Node insert(Node node, int data) {


        if (node == null) {
            // Create a new Node Object
            node = new Node(data);
            size++;

            if (size == 1) {
                // Allocate the rootNode
                rootNode = node;
            }
            return node;
        }

        if (data < node.data) { // insert in the left
            node.left = insert(node.left, data);
        } else {                // insert in the right
            node.right = insert(node.right, data);
        }

        System.out.println("[BinarySearchTree] [Insert] Node Added: " + node + " and size is: " + size);
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
}