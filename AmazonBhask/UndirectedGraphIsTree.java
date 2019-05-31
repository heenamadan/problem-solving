package AmazonBhask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge{

    int source, destination;
    Edge(int source, int destination){
        this.destination= destination;
        this.source=source;

    }
}

 class GraphT{
    List<List<Integer>> adj=null;

     GraphT(int N, List<Edge> edgeList){

         adj= new ArrayList<>(N);
         for(int i=0;i<N;i++){
             adj.add(i, new ArrayList<>());
         }

         for(int i=0;i<edgeList.size();i++){
             int src= edgeList.get(i).source;
             int dest= edgeList.get(i).destination;

             adj.get(src).add(dest);
             adj.get(dest).add(src);
         }
     }
 }





public class UndirectedGraphIsTree {

    public static void main(String args[]) {
        UndirectedGraph g1 = new UndirectedGraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);

        List<Edge> edgeList= Arrays.asList(new Edge(0,1), new Edge(1,2), new Edge(2,3)
        ,new Edge(3,4), new Edge(4,5), new Edge(5,0));

        int N=6;

        GraphT graphT= new GraphT(N, edgeList);

        boolean[] visited = new boolean[N];



    }

    boolean isDFS(GraphT graph, int v, boolean[] visited, int parent){

        visited[v] =true;
        for(int e: graph.adj.get(v)){//pahli node
            if(!visited[e]) {// agr visited nai h

                if (!isDFS(graph, e, visited, v)) {
                    return false;
                }
            }

            //agr visited m hai and e parent nai h
            else if(e!=parent){
                //cycle
                return false;
            }

        }

        return true;
    }




}
