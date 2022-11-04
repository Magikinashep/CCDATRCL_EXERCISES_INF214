public class App {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    App(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 11;
        int noEdges = 18;
        App myGraph = new App(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Jethro";
        myGraph.edge[0].dest = "Lalo";

        // Edge 2
        myGraph.edge[1].src = "Jethro";
        myGraph.edge[1].dest = "Dapitillo";

        // Edge 3
        myGraph.edge[2].src = "Jethro";
        myGraph.edge[2].dest = "Pagarigan";

        // Edge 4
        myGraph.edge[3].src = "Jethro";
        myGraph.edge[3].dest = "Dagurayan";

        // Edge 5
        myGraph.edge[4].src = "Jethro";
        myGraph.edge[4].dest = "Cabales";
        
        // Edge 6
        myGraph.edge[5].src = "Jethro";
        myGraph.edge[5].dest = "berja";
        
        // Edge 7
        myGraph.edge[6].src = "Lalo";
        myGraph.edge[6].dest = "Pagirigan";
        
        // Edge 8
        myGraph.edge[7].src = "Lalo";
        myGraph.edge[7].dest = "Dagurayan";
        
        // Edge 9
        myGraph.edge[8].src = "Dapitillo";
        myGraph.edge[8].dest = "Cheska";
        
        // Edge 10
        myGraph.edge[9].src = "Dapitillo";
        myGraph.edge[9].dest = "Berja";
        
        // Edge 11
        myGraph.edge[10].src = "Pagarigan";
        myGraph.edge[10].dest = "Cabales";
        
        // Edge 12
        myGraph.edge[11].src = "Pagarigan";
        myGraph.edge[11].dest = "Vladimir";
        
        // Edge 13
        myGraph.edge[12].src = "Dagurayan";
        myGraph.edge[12].dest = "Cheska";
        
        // Edge 14
        myGraph.edge[13].src = "Dagurayan";
        myGraph.edge[13].dest = "Conanan";
        
        // Edge 15
        myGraph.edge[14].src = "Cabales";
        myGraph.edge[14].dest = "Magno";
        
        // Edge 16
        myGraph.edge[15].src = "Cabales";
        myGraph.edge[15].dest = "Valdimir";
        
        // Edge 17
        myGraph.edge[16].src = "Valdimir";
        myGraph.edge[16].dest = "Berja";
        
        // Edge 18
        myGraph.edge[17].src = "Magno";
        myGraph.edge[17].dest = "Pagarigan";
        
        
        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
