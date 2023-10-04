package Praktikum.Pertemuan3;
import java.util.Scanner;
public class MainVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("\t\tVoting Pemilihan Ketua BEM");
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah suara: ");
        int jumlahSuara = sc.nextInt();

        System.out.print("Masukkan jumlah kandidat (maksimal 10): ");
        int maxKandidat = sc.nextInt();

        Vote[] voteArr = new Vote[maxKandidat];
        int jumlahKandidat = 0;
        int jumlahSuaraTotal = 0;
        System.out.println("============================================================");
        System.out.println("\t\tNama-Nama Kandidat");
        // Masukkan kandidat-kandidat
        for (int i = 1; i <= maxKandidat; i++) {
            System.out.print("Masukkan nama kandidat ke-" + i + ": ");
            String namaKandidat = sc.next();
            voteArr[jumlahKandidat] = new Vote(namaKandidat);
            jumlahKandidat++;
        }
        System.out.println("============================================================");
        // Masukkan suara-suaranya
        for (int i = 1; i <= jumlahSuara; i++) {
            System.out.print("Masukkan suara ke-" + i + ": ");
            String suara = sc.next();
            jumlahSuaraTotal++;
            // Cari kandidat yang cocok dengan suara dan tambahkan suara
            for (int j = 0; j < jumlahKandidat; j++) {
                if (voteArr[j].nama.equals(suara)) {
                    voteArr[j].tambahSuara();
                    break;
                }
            }
        }
        System.out.println("============================================================");
        // Cari kandidat dengan jumlah suara tertinggi
        int suaraTerbanyak = -1;
        boolean seri = false; // Menyimpan apakah ada kandidat yang seri
        for (int i = 0; i < jumlahKandidat; i++) {
            if (voteArr[i].jumlahSuara > suaraTerbanyak) {
                suaraTerbanyak = voteArr[i].jumlahSuara;
                seri = false; // Reset seri jika ada kandidat dengan suara lebih tinggi
            } else if (voteArr[i].jumlahSuara == suaraTerbanyak) {
                seri = true; // Set seri jika ada kandidat dengan suara yang sama
            }
        }
        
        // Tampilkan pemenang atau pesan seri
        System.out.println("\t\tHasil Pemilihan Ketua BEM:");
        if (seri) {
            System.out.println("Tidak ada pemenang. Karena terdapat kandidat yang SERI.");
        } else {
            System.out.println("Pemenang Pemilihan Ketua BEM:");
            for (int i = 0; i < jumlahKandidat; i++) {
                if (voteArr[i].jumlahSuara == suaraTerbanyak) {
                    System.out.println("Kandidat " + voteArr[i].nama + ": " + voteArr[i].jumlahSuara + " suara");
                }
            }
        }
        System.out.println("============================================================");
    }
}
