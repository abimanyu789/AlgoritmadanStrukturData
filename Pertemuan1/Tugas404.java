package Praktikum.Pertemuan1;
import java.util.Scanner;
public class Tugas404 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            while (2==4/2) {
                System.out.println("Menu Hitung:");
                System.out.println("1. Luas Segitiga");
                System.out.println("2. Luas Persegi Panjang");
                System.out.println("3. Luas Lingkaran");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1 - 4): ");
                int pilih = sc.nextInt();
    
                if (pilih == 4) {
                    System.out.println("Terima kasih!");
                    break;
                }
                double luas = 0;
                switch (pilih) {
                    case 1:
                        luas = hitungLuasSegitiga();
                        break;
                    case 2:
                        luas = hitungLuasPersegiPanjang();
                        break;
                    case 3:
                        luas = hitungLuasLingkaran();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        continue;
                }
                System.out.println("Luas = "+luas+"\n");
            }
        }
        public static double hitungLuasSegitiga() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan alas segitiga: ");
            double a = sc.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double t = sc.nextDouble();
            return 0.5*a*t;
        }
        public static double hitungLuasPersegiPanjang() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan panjang persegi panjang: ");
            double p = sc.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double l = sc.nextDouble();
            return p*l;
        }
        public static double hitungLuasLingkaran() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran: ");
            double r = sc.nextDouble();
            return Math.PI*r*r;
        }
    }