package com.jon.learning.udemy.graph;

public class Main {
    public static void main(String[] args) {
        Unweighted unweighted = new Unweighted();

        unweighted.addVertex(0);
        unweighted.addVertex(1);
        unweighted.addVertex(2);
        unweighted.addVertex(3);
        unweighted.addVertex(4);
        unweighted.addVertex(5);
        unweighted.addVertex(6);

        unweighted.addEdge(3, 1);
        unweighted.addEdge(3, 4);
        unweighted.addEdge(4, 2);
        unweighted.addEdge(4, 5);
        unweighted.addEdge(1, 2);
        unweighted.addEdge(1, 0);
        unweighted.addEdge(0, 2);
        unweighted.addEdge(6, 5);
        System.out.println(unweighted.toString());
    }
}
