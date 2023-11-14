package Praktikum.Pertemuan12;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        
        // Graph graph = new Graph(6);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);
        // graph.addEdge(3, 0);
        // graph.printGraph();
        // graph.degree(2);
        // graph.removeEdge(1, 2);
        // graph.printGraph();
        // graph.degree(2);
        
        //Tugas no 1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Masukkan jumlah vertices(titik): "); 
        // int v = sc.nextInt();
        // System.out.print("Masukkan jumlah edges(garis): ");
        // int e = sc.nextInt();
        // Graph graph = new Graph(v);
        // System.out.println("Masukkan edges: <to> <from>");
        // int count = 1;
        // while (count <= e) {
        //     int to = sc.nextInt();  
        //     int from = sc.nextInt();
        //     graph.addEdge(to, from);
        //     count++;
        // }
        // System.out.println("");
        // graph.printGraph();
        // graph.degree(2);

        //Tugas no 2
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Masukkan jenis graph:\n"+
        //                  "1. Directed\n"+
        //                  "2. Undirected\n"+
        //                  "Pilihan (1/2): "); 
        // int pilih = sc.nextInt();
        // boolean type = true;
        // if (pilih == 1) {
        //     type = true;
        // } else if (pilih == 2){
        //     type = false;
        // }
        // System.out.println("--------------------------------");
        // System.out.print("Masukkan jumlah vertices(titik): "); 
        // int v = sc.nextInt();
        // System.out.print("Masukkan jumlah edges(garis): ");
        // int e = sc.nextInt();
        // Graph graph = new Graph(v,type);
        // System.out.println("Masukkan edges: <to> <from>");
        // int count = 1;
        // while (count <= e) {
        //     int to = sc.nextInt();  
        //     int from = sc.nextInt();
        //     graph.addEdge(to, from);
        //     count++;
        // }
        // System.out.println("--------------------------------");
        // graph.printGraph();
        // System.out.println("--------------------------------");
        // System.out.println("Masukkan edge yang ingin dihapus: <to> <from>");
        //     int to = sc.nextInt();  
        //     int from = sc.nextInt();
        //     graph.removeEdge(to, from);
        // graph.printGraph();
        
        //Tugas no 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jenis graph:\n"+
                         "1. Directed\n"+
                         "2. Undirected\n"+
                         "Pilihan (1/2): "); 
        int pilih = sc.nextInt();
        boolean type = true;
        if (pilih == 1) {
            type = true;
        } else if (pilih == 2){
            type = false;
        }
        System.out.println("--------------------------------");
        System.out.print("Masukkan jumlah vertices(titik): "); 
        int v = sc.nextInt();
        System.out.print("Masukkan jumlah edges(garis): ");
        int e = sc.nextInt();
        Graph<String> graph = new Graph<>(v,type);
        System.out.println("Masukkan edges: <to> <from>");
        int count = 1;
        while (count <= e) {
            String to = sc.nextLine();
            String from = sc.nextLine();
            graph.addEdge(to, from);
            count++;
        }
        System.out.println("--------------------------------");
        graph.printGraph();
        System.out.println("--------------------------------");
        
    }
}
