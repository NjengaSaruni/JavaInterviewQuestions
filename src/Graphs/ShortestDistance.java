package Graphs;

import Utils.GraphEdge;

public class ShortestDistance {
    public static void main(String[] args) {
        GraphEdge[] GraphEdges = {
                new GraphEdge(0, 2, 1),
                new GraphEdge(0, 3, 4),
                new GraphEdge(0, 4, 2),
                new GraphEdge(0, 1, 3),
                new GraphEdge(1, 3, 2),
                new GraphEdge(1, 4, 3),
                new GraphEdge(1, 5, 3),
                new GraphEdge(1, 7, 1),
                new GraphEdge(2, 4, 1),
                new GraphEdge(3, 5, 4),
                new GraphEdge(4, 5, 2),
                new GraphEdge(4, 6, 7),
                new GraphEdge(4, 7, 2),
                new GraphEdge(5, 6, 4),
                new GraphEdge(6, 7, 5)
        };
        Graph g = new Graph(GraphEdges);
        g.addEdge(new GraphEdge(0, 8, 1));
        g.calculateShortestDistances();
        g.printResult(); // let's try it !

    }
}
