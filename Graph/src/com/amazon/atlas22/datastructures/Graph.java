package com.amazon.atlas22.datastructures;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;

public class Graph {

    int v;

    int[][] adjMatrix;



    LinkedList<Integer>[] adjList;

    public Graph(int v){
        this.v = v;
        adjMatrix = new int[v][v];

        adjList = new LinkedList[v];

        // Initialize all the LinkedLists
        for(int i=0;i<adjList.length;i++) {
            adjList[i] = new LinkedList<Integer>();
        }


        System.out.println("[Graph] Created with "+v+ "vertices");
        System.out.println("[Graph] "+(v*v)+" Adj Matrix");
        System.out.println("[Graph] "+v+" Adj Lists");
    }

    public void addEdge(int v1, int v2){
        System.out.println("[Graph] Adding and edge between: vertex "+v1+" and vertex "+v2);
        adjMatrix[v1][v2] = 1;
        adjMatrix[v2][v1] = 1;

        //Update Edge from v1 to v2 in the List
        adjList[v1].add(v2);

        //Update Edge from v2 to v1 in the List
        adjList[v2].add(v1);

    }

    public void printAdjMatrix(){
        for(int i=0; i<adjMatrix.length; i++){
            for(int j=0; j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void printAdjList() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Adj List");
        for(int i=0;i<adjList.length;i++) {
            System.out.print(i+"| ");
            for(int element : adjList[i]) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void printEdgeList(){


        }

}