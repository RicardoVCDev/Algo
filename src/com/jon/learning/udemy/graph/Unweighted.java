package com.jon.learning.udemy.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unweighted {
    private int nodeCount;
    private Map<Integer, List<Integer>> adjacentList = new HashMap<>();

    public void addVertex(int node) {
        this.adjacentList.put(node, new LinkedList<>());
    }

    public void addEdge(int node1, int node2) {
        this.adjacentList.get(node1).add(node2);
        this.adjacentList.get(node2).add(node1);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int node : this.adjacentList.keySet()) {
            sb.append(node+"-->");
            for (int edge : this.adjacentList.get(node)) {
                sb.append(edge+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
