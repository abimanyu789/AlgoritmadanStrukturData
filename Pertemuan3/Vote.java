package Praktikum.Pertemuan3;

public class Vote {
    public String nama;
    public int jumlahSuara;

    public Vote(String nama) {
        this.nama = nama;
        this.jumlahSuara = 0;
    }

    public void tambahSuara() {
        jumlahSuara++;
    }
}

