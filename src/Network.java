import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Network {

    private List<Node> nodes;
    private Map<Node, Map<Node, Integer>> distances;

    public Network(String path) {
        nodes = new LinkedList<>();
        generateNetwork(readCSV(path));
    }

    private void generateNetwork(List<String[]> links) {
        distances = new HashMap<>();

        for(String link[]:links) {
            Node a = generateNode(link[0]);
            Node b = generateNode(link[1]);
            a.addNeighbour(b);
            b.addNeighbour(a);
            Integer distance = Integer.parseInt(link[2]);

            if(distances.get(a) != null) { // entry already exists
                distances.get(a).put(b,distance);
            } else {
                Map<Node, Integer> entry = new HashMap<>();
                entry.put(b, distance);
                distances.put(a, entry);
            }
        }
    }

    /**
     * Search for Node with given name, return if found, else generate a new node and add it to the nodes list
     *
     * @param name Name for the node
     * @return  Node with given name
     */
    private Node generateNode(String name) {

        Node node = getNodeByName(name);
        if (node != null) {
            return node;
        } else {
            node = new Waypoint(name);
            nodes.add(node);
            return node;              // else: create new node with given name
        }
    }

    /**
     * Get a node from the nodes list with given name
     * @param name
     * @return node or null if not found
     */
    public Node getNodeByName(String name) {
        for(Node node: nodes) {
            if(node.getName().equals(name)) {
                return node;                // return existing node if found
            }
        }
        return null;
    }

    /**
     * Get distance between two nodes
     * @param from
     * @param to
     * @return integer distance between node from and node to
     */
    public Integer getDistance(Node from, Node to) {
        if(from == to) {
            return 0;
        }

        if (distances.get(from) != null) {
            if(distances.get(from).get(to) != null) {
                return distances.get(from).get(to);
            }
        }
        if (distances.get(to) != null) {
            if(distances.get(to).get(from) != null) {
                return distances.get(to).get(from);
            }
        }


        return null;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * Read CSV File with network information
     * File has to be fomattet as: "<Nodename A> <Nodename B> <int>"
     *
     * @param path path to csv file
     * @return Array List with each entry beeing a size 3 array with the two nodenames and the distance between as entries
     */
    public ArrayList<String[]> readCSV(String path) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String[]> links = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] link = line.split(cvsSplitBy);
                links.add(link);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return links;
    }
}