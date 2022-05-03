package com.jon.learning.tests;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the shortest path from a point to another.
 *      A---6---B
 *      |     / | \5
 *      1   2   2  C
 *      | /     | /5
 *      D---1---E
 *
 *           A,B,C,D,E
 *      0=A:{0,6,0,1,0}
 *      1=B:{6,0,5,2,2}
 *      2=C:{0,5,0,0,5}
 *      3=D:{1,2,0,0,1}
 *      4=E:{0,2,5,1,0}
 *
 * Example: Find the shortest path from A to B
 * Answer: {A,D,B}. Because A -> B is 6 and A -> D -> B is 1+2=3
 */
public class ShortestPath {

    public int[] solution(int[][] graph, int start, int end) {
        Map<Integer, Integer> map = new HashMap<>(graph.length);

        for (int i=0; i<graph.length; i++) {
            for (int j=0; j<graph[i].length; i++) {
                if (graph[i][j] != 0) {
                    Integer shortest = map.get(graph[i]);
                    if (shortest==null) {
                        map.put(i, graph[i][j]);
                    } else {
                        map.put(i, Math.min(shortest, graph))
                    }
                }
            }
        }
    }
}
