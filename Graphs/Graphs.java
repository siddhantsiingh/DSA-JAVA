package Graphs;

import java.util.*;

public class Graphs {
    static class Edge {
        int src;
        int dst;
        int wt;

        public Edge(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v]; // all index value null
        // empty arraylist
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();

        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));

    }
}
