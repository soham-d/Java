package com.amazon.atlass22.datastructures.main;

import com.amazon.atlas22.datastructures.Graph;

public class GraphApp {

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);

        graph.addEdge(1,2);
        graph.addEdge(1,3);

        graph.addEdge(2,4);

        graph.addEdge(3,4);

        graph.addEdge(4,5);

        graph.addEdge(5,6);

        graph.printAdjMatrix();
        System.out.println();
        graph.printAdjList();

    }
}
