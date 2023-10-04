package Praktikum.Pertemuan1;
public class ArrayToko04 {
    public static void main(String[] args) {
        int stockBunga[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        int[] hargaBunga = {75000,50000,60000,10000};
        int[] totStock = new int[4];

        //Total stock dari masing2 bunga
        for (int i=0;i<stockBunga.length;i++){
            for(int j=0;j<stockBunga[i].length;j++){
                totStock[j]+=stockBunga[i][j];
            }
        }
        System.out.println("==============================\nJumlah Stock berdasarkan jenis bunganya di seluruh Cabang");
        String[] Bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < Bunga.length; i++) {
            System.out.println(Bunga[i] + " : " + totStock[i]);
        }
        int totPendapatan = 0;
        int[] minusStok = {-1,-2,0,-5}; 
        for (int i = 0; i < minusStok.length; i++) {
            totPendapatan+=hargaBunga[i]*(stockBunga[0][i]+minusStok[i]);
        }
        System.out.println("==============================");
        System.out.println("Total Pendapatan dari RoyalGarden 1 jika semua bunga terjual habis: Rp " + totPendapatan);
    }
}
