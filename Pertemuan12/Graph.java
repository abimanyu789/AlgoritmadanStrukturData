package Praktikum.Pertemuan12;

public class Graph<T> {     //4
    int vertex;
    LinkedList<T> list[];   //4
    boolean isDirected; //2

    public Graph(int vertex, boolean isDirected){   //2
        this.vertex = vertex;
        list = new LinkedList[vertex];
        this.isDirected = isDirected;   //2
        for (int i = 0; i < vertex; i++){
            list[i] = new LinkedList();
        }
    }
    public void addEdge(T source, T destination){
        //add edge
        list[(int)source].addFirst(destination);
        //add back edge (for undirected)
        if (!isDirected) {  //2
            list[(int)destination].addFirst(source);
        }
    }
    public boolean graphType() {    //2
        return isDirected;
    }
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source+" : "+list[source].size());
        
        //degree directed graph
            //indegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size(); j++){
                if (list[i].get(j) == source)
                ++totalIn;
            }
            for (k = 0; k < list[i].size(); k++){
                list[i].get(k);
                totalOut=k;
            }
            
        }
        System.out.println("Indegree dari vertex "+source+" : "+totalIn);
        System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
        System.out.println("degree vertex "+source+" : "+(totalIn+totalOut));
        System.out.println("");
    }
    // public void removeEdge(int source, int destination) throws Exception{
    //     for(int i = 0; i < vertex; i++){
    //         if(i==destination){
    //             list[source].remove(destination);
    //         }
    //     }
    // }
    public void removeEdge(T source, T destination) throws Exception {  //3
        if (list[(int)source].isEmpty()) {
            // Tidak ada edge yang dapat dihapus karena list[source] kosong
            return;
        }
        // Cek apakah edge yang akan dihapus adalah edge pertama kali pada list[source]
        if (list[(int)source].getFirst() == destination) {
            list[(int)source].removeFirst();  // Hapus edge pertama kali
        } else {
            System.out.println("Edge (" + source + ", " + destination + ") bukan merupakan path pertama kali dan tidak dapat dihapus.");
        }
    }
    
    public void removeAllEdges(){
        for (int i = 0; i<vertex;i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
        for (int i=0; i <vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex "+i+" terhubung dengan: ");
                for (int j=0; j<list[i].size(); j++) {
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("\nGraph Type: " + (isDirected ? "Directed" : "Undirected"));  //2
    }
}
