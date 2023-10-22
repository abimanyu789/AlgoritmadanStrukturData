package Praktikum.Pertemuan7.Queue;
import java.util.Scanner;
public class MahasiswaMain {
    static void menu() {
        System.out.println("\nPilih menu: ");
        System.out.println("1. Antrian Baru (Mahasiswa meminta tanda tangan KRS)");
        System.out.println("2. Antrian Keluar (Mahasiswa selesai mendapatkan tanda tangan KRS)");
        System.out.println("3. Cetak Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Hapus Semua Antrian");
        System.out.println("6. Cek Antrian Paling Belakang");
        System.out.println("7. Cek Posisi Mahasiswa Berdasarkan NIM");
        System.out.println("8. Cetak Data Mahasiswa pada Posisi Tertentu");
        System.out.println("0. Keluar");
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        MahasiswaQueue antri = new MahasiswaQueue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("NAMA: ");
                    String nama = sc.nextLine();
                    System.out.print("ABSEN: ");
                    int abs = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim,nama,abs,ipk);
                    sc.nextLine();
                    antri.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) &&
                            data.absen != 0 && data.ipk != 0) {
                        System.out.println("Mahasiswa yang mendapatkan tanda tangan KRS: "+
                                data.nim +" "+data.nama+" "+data.absen+" "+data.ipk);
                        break;
                    }
                case 3:
                    antri.Peek();
                    break;
                case 4:
                    antri.Print();
                    break;
                case 5:
                    antri.Clear();
                    break;
                case 6:
                    antri.peekRear();
                    break;
                case 7:
                    System.out.print("Masukkan NIM mahasiswa untuk melihat posisinya: ");
                    String searchNIM = sc.nextLine();
                    antri.peekPosition(searchNIM);
                    break;
                case 8:
                    System.out.print("Masukkan posisi (indeks) data mahasiswa yang ingin dilihat: ");
                    int position = sc.nextInt();
                    antri.printMahasiswa(position);
                    break;
            }
        } while (pilih > 0 && pilih < 9);
    }
}
