package com.amazon.LinkedLists;

public class LinkedListApp {

    public static void main(String[] args) {


        LinkedLists list = new LinkedLists();

        System.out.println("[LLApp] [main] list is: "+list);
        System.out.println();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("[LLApp] [main] size of LinkedList is: "+list.size);

        list.iterate();

        System.out.println();
        System.out.println("[LLApp] [main] Delete based on data");

        list.delete(30);

        list.iterate();

    }
}
