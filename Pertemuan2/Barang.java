package Praktikum.Pertemuan2;

public class Barang {

        private String nama;
        private int jumlah;
    
        // Konstruktor pertama tanpa parameter
        Barang() {
            this.nama = "Unknown";
            this.jumlah = 0;
        }
        // Konstruktor kedua dengan parameter nama
        Barang(String nama) {
            this.nama = nama;
            this.jumlah = 0;
        }
        // Konstruktor ketiga dengan parameter nama dan jumlah
        Barang(String nama, int jumlah) {
            this.nama = nama;
            this.jumlah = jumlah;
        }
        // Metode untuk menampilkan informasi Barang
        void displayInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Jumlah: " + jumlah);
        }
        public static void main(String[] args) {
            Barang Barang1 = new Barang();
            Barang Barang2 = new Barang("Susu");
            Barang Barang3 = new Barang("Roti", 25);
    
            Barang1.displayInfo();
            Barang2.displayInfo();
            Barang3.displayInfo();
        }
    }

