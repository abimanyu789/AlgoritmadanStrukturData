package Praktikum.Pertemuan3;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }

        // System.out.println("==============================================");
        // System.out.println("Hasil Faktorial dengan Brute Force");
        // for (int i=0; i < elemen; i++) {
        //     System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].FaktorialBF(fk[i].nilai));
        // }
        // System.out.println("==============================================");
        // System.out.println("Hasil Faktorial dengan Divide and Conquer");
        // for (int i = 0; i < elemen; i++) {
        // System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].FaktorialDC(fk[i].nilai));
        // }
        // System.out.println("==============================================");

        //modifikasi no4 pengecekan waktu
        long totTimeBF = 0;
        long totTimeDC = 0;

        System.out.println("=============================================="); 
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.nanoTime();
            int resultBF = fk[i].FaktorialBF(fk[i].nilai);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + resultBF);
            System.out.println("Waktu eksekusi (ns): " + duration);
            totTimeBF += duration; //total waktu eksekusi
            if(i==elemen-1){
                System.out.println("Total waktu eksekusi BF (ns): "+totTimeBF);
            }
        }
            // ns = nano second
        System.out.println("==============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.nanoTime();
            int resultDC = fk[i].FaktorialDC(fk[i].nilai);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + resultDC);
            System.out.println("Waktu eksekusi (ns): " + duration);
            totTimeDC += duration; //total waktu eksekusi
            if(i == elemen-1){
                System.out.println("Total waktu eksekusi DC (ns): "+totTimeDC);
            }
        }
        System.out.println("==============================================");
    }
}

