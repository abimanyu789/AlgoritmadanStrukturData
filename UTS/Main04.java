package Praktikum.UTS;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner abimanyu = new Scanner(System.in);
        //tampilan paling atas program
        System.out.println("\tUTS PRAKTIKUM ASD SIB - 2C\n"+
                           "Dibuat oleh\t:\tAnanda Abimanyu Saputra\n"+
                           "NIM\t\t:\t2241760093\n"+
                           "Absen\t\t:\t04\n"+
                           "==================================================\n"+
                           "Sistem Antrian Resto Royal Delish");
        //sistem menu
        boolean a = false;
        int maxSize = 99;
        Pembeli04[] antrian = new Pembeli04[maxSize];
        Pesanan04[] pesanan = new Pesanan04[maxSize];
        
        int antriSize = 0, pesanSize = 0;
        do {
            System.out.println("\n ===============================\n"+
                               "|              MENU             |\n"+
                               " ===============================");
            System.out.println("1. Tambah Antrian\n"+
                               "2. Cetak Antrian\n"+
                               "3. Hapus Antrian\n"+
                               "4. Laporan Pengurutan Pesanan by nama\n"+
                               "5. Hitung total Pendapatan\n"+
                               "6. Keluar");
            System.out.print("Pilih (1-5) : ");
            int pilih = abimanyu.nextInt();
            abimanyu.nextLine();
                switch (pilih){
                    case 1:
                    if (antriSize < maxSize) {
                        System.out.println("-----------------------------------\n"+
                                           "|       Masukkan Data Pembeli     |\n"+
                                           "-----------------------------------");
                        System.out.print("Nama Customer: ");
                        String nama = abimanyu.nextLine();
                        System.out.print("Nomor HP: ");
                        String noHp = abimanyu.nextLine();
                        antrian[antriSize] = new Pembeli04(nama,noHp);
                        antriSize++;
                    } else {
                        System.out.println("Antrian penuh.");
                    }
                    break;
                    case 2:
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
                                           "|Daftar Antrian Resto Royal Delish|\n"+
                                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.printf("| %-3s| %-25s| %-14s|\n","NO","Nama Customer","NO HP");
                        for (int i = 0; i < antriSize; i++) {
                            System.out.printf("| %-3d| %-25s| %-14s|\n",(i+1),antrian[i].namaPembeli,antrian[i].NoHp);
                        }
                        System.out.println("Total Antrian : " + antriSize);
                        break;
                    case 3:
                        if (antriSize > 0) {
                            Pembeli04 p = antrian[0];
                            for (int i = 0; i < antriSize - 1; i++) {
                                antrian[i] = antrian[i + 1];
                            }
                            antriSize--;
                            System.out.println(p.namaPembeli + " telah memesan Menu");
                            System.out.println("--------------------------------------\n"+
                                               "|       Transaksi Input Pesanan       |\n"+
                                               "--------------------------------------");
                            System.out.print("Nomor Pesanan: ");
                            int noPesan = abimanyu.nextInt();
                            abimanyu.nextLine();
                            System.out.print("Pesanan: ");
                            String namaPesanan = abimanyu.nextLine();
                            System.out.print("Harga: ");
                            int harga = abimanyu.nextInt();
                            abimanyu.nextLine();
                            pesanan[pesanSize] = new Pesanan04(noPesan,namaPesanan,harga);
                            pesanSize++;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
                                               "| Daftar Pesanan Masuk Resto Royal Delish |\n"+
                                               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.printf("| %-3s| %-25s| %-14s|\n","NO","Nama Pesanan","Harga");
                            for (int i = 0; i < pesanSize; i++) {
                                System.out.printf("| %-3d| %-25s| %-14d|\n",pesanan[i].kodePesanan,pesanan[i].namaPesanan,pesanan[i].harga);
                            }
                            System.out.println("\nSemua pesanan berhasil dicetak");
                        } else {
                            System.out.println("Antrian kosong.");
                        }
                        break;
                    case 4:
                        if (pesanSize > 1) {
                            // Melakukan sorting nama pesanan dengan metode Bubble Sort
                            for (int i = 0; i < pesanSize - 1; i++) {
                                for (int j = 0; j < pesanSize - 1 - i; j++) {
                                    if (pesanan[j].namaPesanan.compareTo(pesanan[j + 1].namaPesanan) > 0) {
                                        Pesanan04 temp = pesanan[j];
                                        pesanan[j] = pesanan[j + 1];
                                        pesanan[j + 1] = temp;
                                    }
                                }
                            }
                        }
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
                                           "| Daftar Pesanan Masuk Resto Royal Delish |\n"+
                                           "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.printf("| %-3s| %-25s| %-14s|\n","NO","Nama Pesanan","NO HP");
                            for (int i = 0; i < pesanSize; i++) {
                                System.out.printf("| %-3d| %-25s| %-14d|\n",pesanan[i].kodePesanan,pesanan[i].namaPesanan,pesanan[i].harga);
                            }
                            System.out.println("Semua pesanan berhasil dicetak");
                        break;
                    case 5:
                        int totalPendapatan = 0;
                        for (int i = 0; i < pesanSize; i++) {
                            totalPendapatan += pesanan[i].harga;
                        }
                        System.out.println("++++++++++++++++++\n"+
                                           " Total Pendapatan \n"+
                                           "++++++++++++++++++");
                        System.out.println("Pendapatan hari ini : " + totalPendapatan);
                        break;
                    case 6:
                        a = true;
                        System.out.println("Terima Kasih >_<");
                }
        } while (!a);
    }
}
