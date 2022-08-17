package com.amazon.atlas22.datastructures;

import java.util.HashMap;
import java.util.LinkedList;

public class GenericGraph<T> {

    HashMap<T, LinkedList<T>> map;

    public GenericGraph(){

        // HashMap is a builtin data structur
        // Stores the data as K-V pair
        //Dynamically we will add as many vertices we want
        map = new HashMap<>();
        System.out.println("[Graph] Created...");
    }

    private void addVertex(T vertex){
        map.put(vertex, new LinkedList<>());
    }

    public void addEdge(T vertex1, T vertex2){
        if(!map.containsKey(vertex1)){
            addVertex(vertex1);
        }
        if(!map.containsKey(vertex2)){
            addVertex(vertex2);
        }

        map.get(vertex1).add(vertex2);
        map.get(vertex2).add(vertex1);
    }

    public void printAdjList(){
        for(T key: map.keySet()){
            LinkedList<T> adjList = map.get(key);

            for(T vertex: adjList){
                System.out.println(vertex);
            }

        }
    }

    public int vertices(){
        return map.size();
    }


}

