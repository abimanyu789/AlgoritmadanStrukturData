package Praktikum.Pertemuan7.Queue;
import java.util.Scanner;
public class PenumpangMain {
    static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cetak Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Hapus Semua Antrian");
        System.out.println("6. Cek Antrian Paling Belakang"); //jwb modif soal no4
        System.out.println("0. Keluar");
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        PenumpangQueue antri = new PenumpangQueue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kota Asal: ");
                    String asal = sc.nextLine();
                    System.out.print("Kota Tujuan: ");
                    String tujuan = sc.nextLine();
                    System.out.print("Jumlah Tiket: ");
                    int jml = sc.nextInt();
                    System.out.print("Harga: ");
                    int hrg = sc.nextInt();
                    Penumpang p = new Penumpang(nama,asal,tujuan,jml,hrg);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan)
                            && data.jmlTiket !=0 && data.harga != 0) {
                        System.out.println("Antrian yang keluar: "+data.nama+" "+ data.kotaAsal+" "
                                +data.kotaTujuan+" "+data.jmlTiket+" "+data.harga);
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
                //jwb modif soal no4
                case 6:
                    antri.peekRear();
                    break;
            }
        } while (pilih > 0 && pilih < 7);
    }    
}
