package Graphs;

import Utils.GraphEdge;

public class ShortestDistance {
    public static void main(String[] args) {
        GraphEdge[] GraphEdges = {
                new GraphEdge(0, 2, 1),
                new GraphEdge(0, 1, 1),
                new GraphEdge(2, 1, 1),
                new GraphEdge(2, 3, 1),
                new GraphEdge(1, 3, 1),
        };
        Graph g = new Graph(GraphEdges);
        System.out.println(g.isCyclic());

    }
}
