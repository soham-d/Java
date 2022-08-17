package com.amazon.atlas22.datastructures;

import java.util.LinkedList;
import java.util.TreeMap;

class Vertex<T>{
    T vertex;
    Integer weight;

    public  Vertex(){

    }

    public Vertex(T vertex, Integer weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "vertex=" + vertex +
                ", weight=" + weight +
                '}';
    }
}

class Edge{
    Vertex vertex1;
    Vertex vertex2;

    Integer weight;

    public Edge(Vertex vertex1, Vertex vertex2, Integer weight) {

        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", weight=" + weight +
                '}';
    }
}


public class WeightedGraph<T> {

    TreeMap<Vertex<T>, LinkedList<Vertex<T>>>;
    boolean isDirected;

    System.out.println("");

}
