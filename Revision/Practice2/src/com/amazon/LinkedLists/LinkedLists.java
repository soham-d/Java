package com.amazon.LinkedLists;

import com.amazon.LinkedLists.DataStructures.Node;


public class LinkedLists {

    Node root; // default value of null
    int size;

    void add(int data){
        size++;

        Node node = new Node();
        System.out.println("[LinkedList] [add] node for data"+data+"is: "+node);
        node.data = data;

        if(root == null){
            root = node;
            System.out.println("[LinkedList] [add] ROOT node is: "+root);

        }else{
            Node temp = root;

            while(temp.nextNode != null){
                temp = temp.nextNode;
            }

            temp.nextNode = node;
            System.out.println("[Linkedlist] [add] Node"+node+"added after: "+temp);
        }
        System.out.println();
    }

    void deleteLast(){
        if(size==0){
            System.out.println("[LinkedList][deletelast] Nothing to delete");
        }
        else{
            Node temp = root;
            if(temp.nextNode.nextNode==null){
                temp = temp.nextNode;
            }
            System.out.println("[LinkedList][deleteLast] Node "+temp+" with data:"+temp.data+" deleted");
            temp.nextNode = null;
        }
        size--;
    }

    void deleteFirst(){
        if(size == 0){
            System.out.println("[LinkedList][deleteFirst] Nothing to delete");
        }
        else{
            System.out.println("[LinkedList][deleteFirst] Node "+root+"with data "+root.data+" deleted");
            root = root.nextNode;
            size--;
        }
    }

    void delete(int data){

        Node temp = root;

        if(root.data==data){
            root = root.nextNode;
            size--;
            return;
        }
        while(temp.nextNode!=null){
            if(temp.nextNode.data==data){

                if(temp.nextNode.nextNode==null){
                    temp.nextNode=null;
                    size--;
                    break;
                }
                else{
                    temp.nextNode = temp.nextNode.nextNode;
                    size--;
                }

            }
            temp = temp.nextNode;
        }

    }

    boolean contains(int data){
        boolean check = false;

        Node temp = root;

        while(temp.nextNode != null){
            if (temp.data == data) {
                check = true;
            }
            temp = temp.nextNode;

        }
        if(temp.data == data){
            check = true;
        }

        return check;
    }

    void iterate(){

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("[LinkedList] [iterate] Printing LinkedList of size: "+size);
        System.out.println();

        Node temp = root;

        while (temp.nextNode != null){
            System.out.println("[LinkedList] [iterate] data is: "+temp.data);
            temp = temp.nextNode;

        }
        System.out.println("[LinkedList] [iterate] data is: "+temp.data);
        System.out.println("-----------------------------------");
    }

}
