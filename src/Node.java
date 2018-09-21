import java.util.List;

public interface Node {
    public String getName();
    public Node getPredecessor();
    public void setPredecessor(Node node);
    public int getCurrentDistance();
    public void setAsUnvisited();
    public void setVisited(boolean value);
    public void setCurrentDistance(int distance);
    public List<Node> getNeighbours();
    public boolean isVisited();
    public void addNeighbour(Node node);
}
