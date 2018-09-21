import java.util.ArrayList;
import java.util.List;


public class Waypoint implements Node {


    String name;
    boolean activated;
    int distanceFromStart;
    private boolean visited;



    ArrayList<MapData> mapdata = new ArrayList<MapData>();


    public int getDistanceFromStart(){
        return distanceFromStart;
    }

    public void setDistanceFromStart(int distanceFromStart){
        this.distanceFromStart = distanceFromStart;
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

    public void setVisited(boolean visited) {
        this.visited = visited;
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


    public ArrayList<MapData> getMapdata() {
        return mapdata;
    }

    public void setMapdata(ArrayList<MapData> mapdata) {
        this.mapdata = mapdata;
    }


}
