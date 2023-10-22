package Praktikum.Pertemuan7.Queue;

import java.util.Scanner;

public class QueueMain {
    public static void menu(){
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Peek Position"); //Jwb Tugas no1
            System.out.println("7. Peek At");       //Jwb Tugas no1
            System.out.println("----------------");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print ("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue (dataMasuk);
                    break;
            case 2:
                int dataKeluar = Q.Dequeue();
                if (dataKeluar != 0) {
                    System.out.println("Data yang dikeluarkan: "+dataKeluar);
                    break;
                }
            case 3:
                Q.Print();
                break;
            case 4:
                Q.Peek();
                break;
            case 5:
                Q.Clear();
                break;
            //Jwb Tugas no1
            case 6:
                System.out.print("Masukkan data yang ingin dicari posisinya: ");
                int searchData = sc.nextInt();
                Q.peekPosition(searchData);
                break;
            case 7:
                System.out.print("Masukkan posisi (indeks) data yang ingin dilihat: ");
                int position = sc.nextInt();
                Q.peekAt(position);
                break;
            } 
        } while (pilih >= 1 && pilih <=7);
    }
}
