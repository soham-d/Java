package com.amazon.atlass22.datastructures.main;

import com.amazon.atlas22.datastructures.GenericGraph;
import com.amazon.atlas22.datastructures.model.User;
import org.ietf.jgss.GSSName;

import java.util.HashMap;
import java.util.LinkedList;

public class GenericGraphApp {
    public static void main(String[] args) {

        //GenericGraph<Integer> graph1 = new GenericGraph<Integer>();
//        graph1.addEdge(0,1);
//        graph1.addEdge(0,2);
//        graph1.addEdge(1,2);
//        graph1.addEdge(1,3);
//        graph1.addEdge();

        GenericGraph<User> graph2 = new GenericGraph<User>();
        User user0 = new User("0. Sia", "sia@example.com", "98988900");
        User user1 = new User("1. Kim", "sia@example.com", "98988900");
        User user2 = new User("2. Leo", "sia@example.com", "98988900");
        User user3 = new User("3. Appa", "sia@example.com", "98988900");
        User user4 = new User("4. Amma", "sia@example.com", "98988900");
        User user5 = new User("5. Tau", "sia@example.com", "98988900");
        User user6 = new User("6. Taayi", "sia@example.com", "98988900");

        System.out.println(user0);

        graph2.addEdge(user0, user1);
        graph2.addEdge(user0, user2);
        graph2.addEdge(user1, user2);
        graph2.addEdge(user1, user3);
        graph2.addEdge(user2, user4);
        graph2.addEdge(user4, user5);
        graph2.addEdge(user5, user6);

        System.out.println();
        graph2.printAdjList();





        //HashMap<User, LinkedList<>>

    }
}
