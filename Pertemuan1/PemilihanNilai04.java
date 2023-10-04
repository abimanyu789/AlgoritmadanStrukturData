package Praktikum.Pertemuan1;
import java.util.Scanner;
public class PemilihanNilai04 {
    public static void main(String[] args) {
        int nilaiTgs,nilaiUTS,nilaiUAS;
        String nilaiHuruf,predikat;
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================\nProgram Menghitung Nilai Akhir\n==========================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTgs = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextInt();
        System.out.println("==========================\n==========================");

        double nilaiAkhir = (nilaiTgs*0.2)+(nilaiUTS*0.35)+(nilaiUAS*0.45);
        
        if (nilaiAkhir >80 && nilaiAkhir <=100){
            nilaiHuruf = "A"; predikat="SELAMAT ANDA LULUS";}
        else if (nilaiAkhir >73 && nilaiAkhir <=80){
            nilaiHuruf = "B+"; predikat="SELAMAT ANDA LULUS";}
        else if (nilaiAkhir >65 && nilaiAkhir <=73){
            nilaiHuruf = "B"; predikat="SELAMAT ANDA LULUS";}
        else if (nilaiAkhir >60 && nilaiAkhir <=65){
                nilaiHuruf = "C+"; predikat="SELAMAT ANDA LULUS";}
        else if (nilaiAkhir >50 && nilaiAkhir <=60){
            nilaiHuruf = "C"; predikat="SELAMAT ANDA LULUS";}
        else if (nilaiAkhir >39 && nilaiAkhir <=50){
            nilaiHuruf = "D"; predikat="ANDA TIDAK LULUS";}
        else {nilaiHuruf = "E"; predikat="ANDA TIDAK LULUS";}
        
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+nilaiHuruf+"\n==========================");
        System.out.println(""+predikat);
    }
}


