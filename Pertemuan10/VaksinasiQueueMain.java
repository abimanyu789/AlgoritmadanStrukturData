package Praktikum.Pertemuan10;

import java.util.Scanner;

public class VaksinasiQueueMain {
    public static void main(String[] args) {
        DoublyLinkedList vaksinasiQueue = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        boolean a = false;
        while (!a) {
            System.out.println("++++++++++++++++++++++++++++++++++\n"+
                               "MENU PENGANTRI VAKSIN EXTRAVAGANZA\n"+
                               "++++++++++++++++++++++++++++++++++\n"+
                               "1. Tambah Data Penerima Vaksin\n"+
                               "2. Hapus Data Pengantri Vaksin\n"+
                               "3. Daftar Penerima Vaksin\n"+
                               "4. Keluar\n"+
                               "++++++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("----------------------------------\n"+
                                     "   Masukkan Data Penerima Vaksin  \n"+
                                     "----------------------------------\n"+
                                     "Nama Penerima : ");
                    String nama = sc.nextLine();
                    vaksinasiQueue.enqueue(nama);
                    System.out.println("Nomor Antrian : "+(vaksinasiQueue.queueNumber - 1));
                    System.out.println(nama+" telah ditambahkan ke antrian vaksinasi.\n");
                    break;
                case 2:
                    String removedData = vaksinasiQueue.dequeue();
                    if (removedData != null) {
                        System.out.println(removedData+" telah divaksinasi dan dihapus dari antrian.");
                        vaksinasiQueue.printQueue();
                    } else {
                        System.out.println("Antrian kosong, tidak ada yang bisa dihapus.");
                    }
                    break;
                case 3:
                    vaksinasiQueue.printQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih! Keluar dari program.");
                    a = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}
