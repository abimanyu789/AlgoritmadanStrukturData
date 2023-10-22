package Praktikum.Pertemuan6;
public class Buku {
    String judulBuku,sizeBuku;
    int jmlhHal;
    
    public Buku(String judulBuku, int jmlhHal, String sizeBuku) {
        this.judulBuku = judulBuku;
        this.jmlhHal = jmlhHal;
        this.sizeBuku = sizeBuku;
    }
    public double getTinggiBuku() {
        double tinggi = 0.0;
        if (sizeBuku.equals("A4")) {
            tinggi = 29.7;
        } else if (sizeBuku.equals("B5")) {
            tinggi = 25.0;
        } else if (sizeBuku.equals("B3")) {
            tinggi = 50.0;
        } else if (sizeBuku.equals("B2")) {
            tinggi = 70.7;
        }
        return tinggi;
    }
}
