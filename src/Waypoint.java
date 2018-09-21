import java.util.ArrayList;
import java.util.List;


public class Waypoint implements Node {


    String name;
    boolean activated;
    int distanceFromStart;
    private boolean visited;

    public Waypoint(String name) {
        this.name = name;
        this.activated = false;
        this.distanceFromStart = Integer.MAX_VALUE;
        this.visited = false;
    }



    @Override
    public String getName() {
        return null;
    }

    @Override
    public Node getPredecessor() {
        return null;
    }

    @Override
    public void setPredecessor(Node node) {

    }

    @Override
    public int getCurrentDistance() {
        return 0;
    }

    @Override
    public void setAsUnvisited() {

    }

    @Override
    public void setVisited(boolean value) {

    }

    @Override
    public void setCurrentDistance(int distance) {

    }

    @Override
    public List<Node> getNeighbours() {
        return null;
    }

    @Override
    public boolean isVisited() {
        return false;
    }

    @Override
    public void addNeighbour(Node node) {

    }
}
