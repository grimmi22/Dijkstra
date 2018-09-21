import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Waypoint implements Node {


    String name;
    boolean activated;
    int distanceFromStart;
    private boolean visited;
    private Node predecessor;
    private List<Node> neighbours = new LinkedList<>();

    public Waypoint(String name) {
        this.name = name;
        this.activated = false;
        this.distanceFromStart = Integer.MAX_VALUE;
        this.visited = false;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public Node getPredecessor() {
        return predecessor;
    }

    @Override
    public void setPredecessor(Node node) {
        if(node != null) {
            predecessor = node;
        }

    }

    @Override
    public int getCurrentDistance() {
        return distanceFromStart;
    }

    @Override
    public void setCurrentDistance(int distance) {
        distanceFromStart = distance;
    }


    @Override
    public void setAsUnvisited() {
        visited = false;
    }

    @Override
    public void setVisited(boolean value) {
        visited = true;
    }


    @Override
    public List<Node> getNeighbours() {
        return neighbours;
    }

    @Override
    public boolean isVisited() {
        return visited;
    }

    @Override
    public void addNeighbour(Node node) {
        neighbours.add(node);
    }
}
