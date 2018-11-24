package Utils;

import java.util.ArrayList;

public class GraphNode {
    private int distanceFromSource = Integer.MAX_VALUE;
    private boolean visited;
    private ArrayList<GraphEdge> edges = new ArrayList<GraphEdge>(); // now we must create edges

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getDistanceFromSource(){
        return this.distanceFromSource;
    }


    public void setDistanceFromSource(int distance){
        this.distanceFromSource = distance;
    }

    public ArrayList<GraphEdge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<GraphEdge> edges) {
        this.edges = edges;
    }
}
