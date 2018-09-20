import java.util.ArrayList;

public class Waypoint {


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


    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    public ArrayList<MapData> getMapdata() {
        return mapdata;
    }

    public void setMapdata(ArrayList<MapData> mapdata) {
        this.mapdata = mapdata;
    }


}
