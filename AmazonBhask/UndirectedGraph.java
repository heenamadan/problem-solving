package AmazonBhask;

import java.util.LinkedList;

public class UndirectedGraph {

    private LinkedList<Integer> adjacentList [];

    private int nodes;

    UndirectedGraph(int nodes){
        this.nodes=nodes;
        adjacentList= new LinkedList[nodes];
        for (int i=0; i<nodes; ++i)
            adjacentList[i] = new LinkedList();
    }

    public void addEdge(int u, int v){
// undirected
        adjacentList[u].add(v);
        adjacentList[v].add(u);

    }

    public static void main(String args[]) {
        UndirectedGraph g1 = new UndirectedGraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);

    }

    boolean isTree(){

        //1) Mark all vertex not visited

        Boolean visited[] = new Boolean[nodes];
        for(int i=0;i<nodes;i++){
            visited[i]= false;
        }
       // 2)

        return false;
    }




}
