package Praktikum.Pertemuan6;
import java.util.Scanner;
public class PaskibrakaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaskibrakaDaftarAngota data = new PaskibrakaDaftarAngota();
        System.out.print("Masukkan jumlah calon anggota: ");
        int jum = sc.nextInt();

        for (int i = 0; i < jum ; i++){
            System.out.println("-------------------------");
            sc.nextLine();
            System.out.println("Calon ke - "+(i+1));
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Tinggi Badan (cm): ");
            int tinggi = sc.nextInt();
            Paskibraka n = new Paskibraka(nama,kelas,tinggi);
            data.tambah(n);
        }
        System.out.println("==================================");
        System.out.println("Data Calon Paskibraka: ");
        data.tampil();
        System.out.println("===================================");
        System.out.println("Data dari Tertinggi ke terendah");
        data.selectionSort();
        data.tampil();
        //modifikasi Tugas no2
        System.out.println("===================================");
        System.out.println("Calon Anggota Paskibraka yang Lolos: ");
        data.seleksiTinggi();
        System.out.println("");
    }
}
