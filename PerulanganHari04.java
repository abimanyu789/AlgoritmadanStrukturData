package Praktikum.Pertemuan1;
import java.util.Scanner;
public class PerulanganHari04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long nim = sc.nextLong();
        System.out.println("=========================");

        
        long n = nim%100; //2digit dibelakang
        if(n<10){n+=10;}
        System.out.println("n : "+n);
        String[] Hari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        for(int i=0;i<=n;i++){
            System.out.print(Hari[i%7]+" "); //untuk mengulangi elemen yg dipanggil
        }
    }
}
