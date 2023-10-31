package Praktikum.Pertemuan10;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) {
        FilmDLL daftarFilm = new FilmDLL();
        Scanner sc = new Scanner(System.in);
        
        boolean con = true;
        while (con) {
            System.out.print("\n==================================\n"+
                             "|      DATA FILM LAYAR LEBAR     |\n"+
                             "==================================\n"+
                             "| 1. Tambah Data Awal            |\n"+
                             "| 2. Tambah Data Akhir           |\n"+
                             "| 3. Tambah Data Index Tertentu  |\n"+
                             "| 4. Hapus Data Pertama          |\n"+
                             "| 5. Hapus Data Terakhir         |\n"+
                             "| 6. Hapus Data Tertentu         |\n"+
                             "| 7. Cetak                       |\n"+
                             "| 8. Cari ID Film                |\n"+
                             "| 9. Urut Data Rating Film (Desc)|\n"+
                             "| 10. Keluar                     |\n"+
                             "==================================\n"+
                             "Pilih menu (1-10): ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("------------------------------\n"+
                                     "Masukkan Data Film Posisi Awal\n"+
                                     "------------------------------\n"+
                                     "ID Film \t: ");
                    int idAwal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String jdlAwal = sc.nextLine();
                    System.out.print("Rating Film\t: ");
                    double ratingAwal = sc.nextDouble();
                    daftarFilm.tambahDataAwal(idAwal, jdlAwal, ratingAwal);
                    System.out.println("Data telah ditambahkan ke awal daftar.");
                    break;
                case 2:
                    System.out.print("-------------------------------\n"+
                                     "Masukkan Data Film Posisi Akhir\n"+
                                     "-------------------------------\n"+
                                     "ID Film \t: ");
                    int idAkhir = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String jdlAkhir = sc.nextLine();
                    System.out.print("Rating Film\t: ");
                    double ratingAkhir = sc.nextDouble();
                    daftarFilm.tambahDataAkhir(idAkhir, jdlAkhir, ratingAkhir);
                    System.out.println("Data telah ditambahkan ke akhir daftar.");
                    break;
                case 3:
                System.out.print("-------------------------------\n"+
                                 " Masukkan Data Film Urutan Ke- \n"+
                                 "-------------------------------\n"+
                                 "ID Film \t: ");
                    int idIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String jdlIndex = sc.nextLine();
                    System.out.print("Rating Film\t: ");
                    double ratingIndex = sc.nextDouble();
                    System.out.print("Data Film ini akan dimasukkan di urutan(index) ke-");
                    int index = sc.nextInt();
                    daftarFilm.tambahDataIndex(idIndex, jdlIndex, ratingIndex, index);
                    break;

                case 4:
                    daftarFilm.hapusDataPertama();
                    System.out.println("Data pertama telah dihapus.");
                    break;

                case 5:
                    daftarFilm.hapusDataTerakhir();
                    System.out.println("Data terakhir telah dihapus.");
                    break;

                case 6:
                    System.out.print("Masukkan Index yang akan dihapus: ");
                    int indexHapus = sc.nextInt();
                    daftarFilm.hapusDataIndex(indexHapus);
                    System.out.println("Data pada index tertentu telah dihapus.");
                    break;

                case 7:
                    daftarFilm.cetak();
                    break;

                case 8:
                    System.out.print("Masukkan ID Film yang akan dicari: ");
                    int idCari = sc.nextInt();
                    Film filmDitemukan = daftarFilm.searchById(idCari);
                    if (filmDitemukan != null) {
                        System.out.println(""+filmDitemukan);
                    }
                    break;
                case 9:
                    daftarFilm.sortRatingDescending();
                    System.out.println("Data rating film telah diurutkan secara descending.");
                    break;
                case 10:
                    System.out.println("Terima kasih! Keluar dari program.");
                    con = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }    
    }
}
