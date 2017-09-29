import java.util.List;
import java.util.ArrayList;

class Node{

    public int x;
    public int y;
    public int gScore;
    public Node up_child;
    public Node down_child;
    public Node left_child;
    public Node right_child;
    public Node parent;

    //has visited;
    public Boolean isVisited;
    //three way blocked
    public Boolean isBlocked;

    public char value;//store for curr node's value;

    //distance from goal state
    public int curr_distance;

    public List<Node> neighbor;



    public int manhattanDistance(Node dest) {
        int dist = Math.abs(this.x - dest.x) + Math.abs(this.y - dest.y);
        return dist;
    }

    public boolean equals (Node other){
        return ((this.x == other.x) && (this.y == other.y));
    }

    //for A Star algorithm
    public int gScore(){
        if (this.parent == null){
            return 0;
        }
        return 1+this.parent.gScore();
    }
    
    public Node(int x, int y, char value){
        this.x = x;
        this.y = y;

        this.value = value;

        up_child = null;
        down_child = null;
        left_child = null;
        right_child = null;

        isVisited = false;

        isBlocked = false;
        neighbor = new ArrayList<Node>();
    }

    public boolean hasChild(){
      return !neighbor.isEmpty();
    }


}
