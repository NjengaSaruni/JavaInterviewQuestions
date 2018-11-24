package Graphs;

import Utils.GraphEdge;
import Utils.GraphNode;

import java.util.ArrayList;

public class Graph {
    private GraphNode[] nodes;
    private int noOfNodes;
    private GraphEdge[] edges;
    private int noOfEdges;

    public Graph(GraphEdge[] edges) {
        this.edges = edges;

        this.noOfNodes = calculateNoOfNodes(edges);
        this.nodes = new GraphNode[this.noOfNodes];

        for (int n = 0; n < this.noOfNodes; n++) {
            this.nodes[n] = new GraphNode();
        }

        this.noOfEdges = edges.length;

        for (int edgeToAdd = 0; edgeToAdd < this.noOfEdges; edgeToAdd++) {
            this.nodes[edges[edgeToAdd].getFromNodeIndex()].getEdges().add(edges[edgeToAdd]);
            this.nodes[edges[edgeToAdd].getToNodeIndex()].getEdges().add(edges[edgeToAdd]);
        }
    }

    public void addEdge(GraphEdge edge){
        GraphEdge[] newEdges = new GraphEdge[this.noOfEdges + 1];
        int i = 0;
        while(i < this.noOfEdges){
            newEdges[i] = this.getEdges()[i];
            i++;
        }
        newEdges[i] = edge;
        this.edges = newEdges;
        this.noOfNodes = calculateNoOfNodes(edges);
        this.nodes[edge.getFromNodeIndex()].getEdges().add(edge);
        this.nodes[edge.getToNodeIndex()].getEdges().add(edge);
    }

    private int calculateNoOfNodes(GraphEdge[] edges) {
        int noOfNodes = 0;
        for (GraphEdge e : edges) {
            if (e.getToNodeIndex() > noOfNodes)
                noOfNodes = e.getToNodeIndex();
            if (e.getFromNodeIndex() > noOfNodes)
                noOfNodes = e.getFromNodeIndex();
        }
        noOfNodes++;
        return noOfNodes;
    }

    private int getNodeShortestDistanced() {
        int storedNodeIndex = 0;
        int storedDist = Integer.MAX_VALUE;
        for (int i = 0; i < this.nodes.length; i++) {
            int currentDist = this.nodes[i].getDistanceFromSource();
            if (!this.nodes[i].isVisited() && currentDist < storedDist) {
                storedDist = currentDist;
                storedNodeIndex = i;
            }
        }
        return storedNodeIndex;
    }

    public void calculateShortestDistances() {
        // node 0 as source
        this.nodes[0].setDistanceFromSource(0);
        int currentNode = 0;
        // visit every node
        for (int i = 0; i < this.nodes.length; i++) {
            // loop around the edges of current node
            ArrayList<GraphEdge> currentNodeEdges = this.nodes[currentNode].getEdges();
            for (int currentEdge = 0; currentEdge < currentNodeEdges.size(); currentEdge++) {
                int neighbourIndex = currentNodeEdges.get(currentEdge).getNeighbourIndex(currentNode);
                // only if not visited
                if (!this.nodes[neighbourIndex].isVisited()) {
                    int tentative = this.nodes[currentNode].getDistanceFromSource() + currentNodeEdges.get(currentEdge).getLength();
                    if (tentative < nodes[neighbourIndex].getDistanceFromSource()) {
                        nodes[neighbourIndex].setDistanceFromSource(tentative);
                    }
                }
            }
            // all neighbours checked so node visited
            nodes[currentNode].setVisited(true);
            // next node must be with shortest distance
            currentNode = getNodeShortestDistanced();
        }
    }

    // display result
    public void printResult() {
        String output = "Number of nodes = " + this.noOfNodes;
        output += "\nNumber of edges = " + this.noOfEdges;
        for (int i = 0; i < this.nodes.length; i++) {
            output += ("\nThe shortest distance from node 0 to node " + i + " is " + nodes[i].getDistanceFromSource());
        }
        System.out.println(output);
    }
    public GraphNode[] getNodes() {
        return nodes;
    }
    public int getNoOfNodes() {
        return noOfNodes;
    }
    public GraphEdge[] getEdges() {
        return edges;
    }
    public int getNoOfEdges() {
        return noOfEdges;
    }
}
