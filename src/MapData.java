public class MapData {


    private String startWaypoint;
    private String toWaypoint;
    private int distance;



    public MapData(String startWaypoint, String toWaypoint, int distance) {
        this.startWaypoint = startWaypoint;
        this.toWaypoint = toWaypoint;
        this.distance = distance;


    }
    public String getStartWaypoint() {
        return startWaypoint;

    }
    public String getToWaypoint() {
        return toWaypoint;

    }    public int getDistance() {
        return distance;

    }

}

