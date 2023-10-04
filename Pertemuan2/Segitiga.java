package Praktikum.Pertemuan2;

public class Segitiga {
    public int alas;
    public int tinggi;
    
    // Konstruktor dengan parameter alas dan tinggi
    Segitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }
    // Metode untuk menghitung luas segitiga
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    // Metode untuk menghitung sisi miring (hipotenusa)
    double hitungHipotenusa() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }
    // Metode untuk menghitung keliling segitiga
    double hitungKeliling() {
        double hipotenusa = hitungHipotenusa();
        double keliling = alas + tinggi + hipotenusa;
        return keliling;
    }
    
    public static void main(String[] args) {
        // Membuat array sgArray dengan 4 elemen
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
 
        // Looping untuk mencetak luas dan keliling setiap segitiga
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling()+"\n");
        }
    }       
}
