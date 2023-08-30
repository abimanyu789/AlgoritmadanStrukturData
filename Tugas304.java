package Praktikum.Pertemuan1;
import java.util.Scanner;
public class Tugas304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int hitung = 0;
        int angka = 2;

        while (hitung < n) {
            if (angka%4 !=0) {
                System.out.print(angka+" ");
                hitung++;
            }
            angka += 2;
        }
        System.out.println();
    }
}
