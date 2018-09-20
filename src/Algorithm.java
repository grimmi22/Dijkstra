import java.awt.*;
import java.util.Map;

public class Algorithm {


    List map;
    int temporaryDistance;
    int startPoint;
    boolean destinationPoint;
    private MapData[] mapData;
    private int numbWaypoints;


public Algorithm(MapData[] mapData){
    this.mapData = mapData;
    this.numbWaypoints = numberOfWaypoints();


}








    public static void numberOfWaypoints(MapData[] mapDatas){
        int numbWaypoints = 0;

        for (MapData w : mapDatas) {
            if (w.getToWaypoint() > numbWaypoints)
        }


    }

    public static void markAllAsUnvisited(boolean visited){

        visited = false;


    }



    public static void setAllInitialDiscance(int discanceFromStart){

        discanceFromStart = Integer.MAX_VALUE;



    }


    public static void setStartpoint(int startPoint){

        startPoint = 0;


    }


    public static void compareAndSetShortestWaypointActivated(boolean activated){

        activated = false;

    }


    public static void setVisited(boolean visited){

        visited = true;

    }

    public static void ifShortestToDestinyStop(){




    }


    public static void chooseShortestPath(){




    }


}
