package Praktikum.Pertemuan1;
public class Tugas204 {
    public static void main(String[] args) {
        double tabung = 1000000; 
        double targetSaldo = 1500000; 
        double bunga = 0.02; 
        int bulan = 0;
        double currentSaldo=tabung;

        while (currentSaldo < targetSaldo) {
            currentSaldo += currentSaldo*bunga;
            bulan++;
        }
        System.out.println("Saldo nasabah mencapai "+targetSaldo+" setelah "+bulan+" bulan");
    }
}