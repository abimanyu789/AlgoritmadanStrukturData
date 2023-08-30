package Praktikum.Pertemuan1;
public class Tugas104 {
    public static void main(String[] args) {
    String[] pelanggan = {"Ani","Budi","Bina","Cita"};
    int[] berat = {4,15,6,11};
    int tarif = 4500;
    double diskon = 0.05;
    int totPendapatan = 0;

    System.out.println("===================================");
    for (int i=0;i<pelanggan.length;i++) {
        int tagihan=berat[i]*tarif;
        if (berat[i]>10){
            tagihan-=tagihan*diskon;
        }
        totPendapatan += tagihan;
        System.out.println("Tagihan "+pelanggan[i]+" : Rp. "+tagihan);
    }
    System.out.println("===================================");
    System.out.println("Total Pendapatan Smile Laundry Untuk Hari Ini : Rp. "+totPendapatan);   
    System.out.println("===================================");
    }
}
