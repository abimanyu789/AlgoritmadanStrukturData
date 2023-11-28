package Praktikum.Pertemuan14;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswaMain {
    public static void main(String[] args) {
        HashTableMhs table = new HashTableMhs();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=============== MENU ===============");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cari Mahasiswa berdasarkan NIM");
            System.out.println("3. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Seluruh NIM Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Membuang newline setelah nextInt()

            switch (choice) {
                case 1:
                    System.out.println("\nMasukkan data mahasiswa:");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama Lengkap: ");
                    String nama = sc.nextLine();
                    System.out.print("Jurusan: ");
                    String jurusan = sc.nextLine();
                    System.out.print("Program Studi: ");
                    String program = sc.nextLine();

                    Mahasiswa newMahasiswa = new Mahasiswa(nim, nama, jurusan, program);
                    table.setMahasiswa(newMahasiswa);
                    break;
                case 2:
                    System.out.print("\nMasukkan NIM yang ingin dicari: ");
                    String searchNIM = sc.nextLine();
                    Mahasiswa foundMahasiswa = table.findMahasiswa(searchNIM);
                    if (foundMahasiswa != null) {
                        System.out.println("\nMahasiswa dengan NIM " + searchNIM + " ditemukan:");
                        System.out.println("Nama Lengkap: " + foundMahasiswa.namaLengkap);
                        System.out.println("Jurusan: " + foundMahasiswa.jurusan);
                        System.out.println("Program Studi: " + foundMahasiswa.programStudi);
                    } else {
                        System.out.println("\nMahasiswa dengan NIM " + searchNIM + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("\nMasukkan NIM yang ingin dihapus: ");
                    String deleteNIM = sc.nextLine();
                    table.removeMahasiswa(deleteNIM);
                    System.out.println("Mahasiswa dengan NIM " + deleteNIM + " telah dihapus.");
                    break;
                case 4:
                    System.out.println("\nSeluruh NIM Mahasiswa:");
                    ArrayList<String> nimsList = table.getAllNIMs();
                    for (String n : nimsList) {
                        System.out.println(n);
                    }
                    break;

                case 5:
                    System.out.println("\nKeluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
