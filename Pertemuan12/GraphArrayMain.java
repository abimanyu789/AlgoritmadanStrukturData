package Praktikum.Pertemuan12;
import java.util.Scanner;
public class GraphArrayMain {
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0; 
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try {
                System.out.println("Masukkan jumlah vertices: "); 
                v = sc.nextInt(); 
                System.out.println("Masukkan jumlah edges: ");
                e = sc.nextInt();
                
                graph = new GraphArray(v);

                System.out.println("Masukkan edges: <to> <from>");
                while (count <= e) {
                    to = sc.nextInt();  
                    from = sc.nextInt();
                    graph.makeEdge (to, from, 1); 
                    count++;
                }
                System.out.println("Array 2D sebagai representasi graph sbb: ");
                System.out.print("  ");
                for (int i=1; i <= v; i++) { 
                    System.out.print(i+" ");
                }
                System.out.println();
                
                for (int i = 1; i <= v; i++) {
                    System.out.print(i + " ");
                    for (int j=1; j <= v; j++) { 
                        System.out.print (graph.getEdge (i,j) + " ");
                    }
                    System.out.println();
                }
            } catch (Exception E) {
                System.out.println("Error. Silakan cek kembali\n" + E.getMessage());
            }
            sc.close();
    }
}
