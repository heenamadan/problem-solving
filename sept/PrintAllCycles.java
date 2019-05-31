package sept;

import java.util.ArrayList;

public class PrintAllCycles {

    private int v;


    // adjacency list
    private ArrayList<Integer>[] adjList;

    private ArrayList<Integer>[] cycles;

    //Constructor
    public PrintAllCycles(int vertices){

        //initialise vertex count
        this.v = vertices;

        // initialise adjacency list
        initAdjList();
    }

    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private void initAdjList()
    {
        adjList = new ArrayList[v];

        for(int i = 0; i < v; i++)
        {
            adjList[i] = new ArrayList<>();
        }
    }


    void dfs_cycle(int u, int p, int color[],
                   int mark[], int par[], int cyclenumber)
    {

        // already (completely) visited vertex.
        if (color[u] == 2) {
            return;
        }

        // seen vertex, but was not completely visited -> cycle detected.
        // backtrack based on parents to find the complete cycle.
        if (color[u] == 1) {

            cyclenumber++;
            int cur = p;
            mark[cur] = cyclenumber;

            // backtrack the vertex which are
            // in the current cycle thats found
            while (cur != u) {
                cur = par[cur];
                mark[cur] = cyclenumber;
            }
            return;
        }
        par[u] = p;

        // partially visited.
        color[u] = 1;

        // simple dfs on graph
        for (int v : cycles[u]) {

            // if it has not been visited previously
            if (v == par[u]) {
                continue;
            }
            dfs_cycle(v, u, color, mark, par, cyclenumber);
        }

        // completely visited.
        color[u] = 2;
    }

    void printCycles(int edges, int mark[], int cyclenumber)
    {

        // push the edges that into the
        // cycle adjacency list
        for (int i = 1; i <= edges; i++) {
            if (mark[i] != 0)
                cycles[mark[i]].add(i);
        }

        // print all the vertex with same cycle
        for (int i = 1; i <= cyclenumber; i++) {
            // Print the i-th cycle
            System.out.println( "Cycle Number " + i) ;
            for (int x : cycles[i])
                System.out.println();
        }
    }

    // add edge from u to v
    public void addEdge(int u, int v)
    {
        // Add v to u's list.
        adjList[u].add(v);
    }

    public static void main(String[] args)
    {
        // Create a sample graph
        PrintAllCycles g = new PrintAllCycles(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(1,3);

        int cyclenumber = 0;
        int edges = 13;
    int N=100000;
        // arrays required to color the
        // graph, store the parent of node
        int[] color = new int[N];
        int[] par = new int[N];
        int[] mark = new int[N];


        g.dfs_cycle(1, 0, color, mark, par, cyclenumber);
        g.printCycles(edges, mark, cyclenumber);

    }
}
