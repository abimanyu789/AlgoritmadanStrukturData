package Praktikum.Pertemuan3;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat [] png = new Pangkat[elemen];

        // for (int i=0; i<elemen; i++){
        //     png[i] = new Pangkat();
        //     System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
        //     png[i].nilai = sc.nextInt();
        //     System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
        //     png[i].pangkat = sc.nextInt();
        // }

        // System.out.println("==============================================");
        // System.out.println("Hasil Pangkat dengan Brute Force");
        // for (int i=0; i < elemen; i++) {
        //     System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        // }
        // System.out.println("==============================================");
        // System.out.println("Hasil Pangkat dengan Divide and Conquer");
        // for (int i = 0; i < elemen; i++) {
        // System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        // }
        // System.out.println("==============================================");

        // modifikasi no4
        // for (int i=0; i<elemen; i++){
        //     System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
        //     int nilai = sc.nextInt();
        //     System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
        //     int pangkat = sc.nextInt();
        //     png[i] = new Pangkat(nilai,pangkat);
        // }

        // System.out.println("==============================================");
        // System.out.println("Hasil Pangkat dengan Brute Force");
        // for (int i = 0; i < elemen; i++) {
        //     System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF());
        // }
        // System.out.println("==============================================");
        // System.out.println("Hasil Pangkat dengan Divide and Conquer");
        // for (int i = 0; i < elemen; i++) {
        //     System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        // }
        // System.out.println("==============================================");

        // modifikasi no5 tambah menu
        for (int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai,pangkat);
        }

        System.out.println("=============================");
        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan Anda: ");
        int metode = sc.nextInt();

        System.out.println("=============================");
        System.out.println("Hasil Perhitungan Pangkat");
        for (int i = 0; i < elemen; i++) {
            int hasil = 0;
            if (metode == 1) { // Brute Force
                hasil = png[i].pangkatBF();
            } else if (metode == 2) { // Divide and Conquer
                hasil = png[i].pangkatDC(png[i].nilai,png[i].pangkat);
            } else {
                System.out.println("Metode yang dipilih tidak valid.");
                break;
            }
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + hasil);
        }
        System.out.println("=============================");
    }
}
