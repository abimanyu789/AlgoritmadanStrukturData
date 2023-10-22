package Praktikum.Pertemuan6;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for(int i=0; i<jumMhs; i++) {
            System.out.println("=============================");
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.println("-----------------------------");
            System.out.print ("Nama = ");
            String nama = s1.nextLine();
            System.out.print ("Tahun masuk = "); 
            int thn = s.nextInt();
            System.out.print("Umur = "); 
            int umur = s.nextInt();
            System.out.print("IPK = "); 
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa (nama, thn, umur, ipk); 
            data.tambah(m);
        }
        System.out.println("---------------------------------");
        System.out.println("Data mahasiswa sebelum sorting = ");
        System.out.println("---------------------------------");
        data.tampil();

        System.out.println("------------------------------------------------------");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
        System.out.println("------------------------------------------------------");
        data.bubbleSort();
        data.tampil();

        System.out.println("-----------------------------------------------------");
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
        System.out.println("-----------------------------------------------------");
        data.selectionSort();
        data.tampil();
    }
}
