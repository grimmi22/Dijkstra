import java.util.ArrayList;

public class Waypoint {





    String name;
    boolean activated;
    int distanceFromStart;
    private boolean visited;
    ArrayList<MapData> mapdata = new ArrayList<MapData>();

    public void setVisited(boolean visited) {
        this.visited = visited;
    }







}
