package Graphs;

import Utils.GraphEdge;
import Utils.GraphNode;

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
        int nextNode = 0;
        // visit every node
        for (int i = 0; i < this.nodes.length; i++) {
            // loop around the edges of current node
            ArrayList<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();
            for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) {
                int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);
                // only if not visited
                if (!this.nodes[neighbourIndex].isVisited()) {
                    int tentative = this.nodes[nextNode].getDistanceFromSource() + currentNodeEdges.get(joinedEdge).getLength();
                    if (tentative < nodes[neighbourIndex].getDistanceFromSource()) {
                        nodes[neighbourIndex].setDistanceFromSource(tentative);
                    }
                }
            }
            // all neighbours checked so node visited
            nodes[nextNode].setVisited(true);
            // next node must be with shortest distance
            nextNode = getNodeShortestDistanced();
        }
    }
}
