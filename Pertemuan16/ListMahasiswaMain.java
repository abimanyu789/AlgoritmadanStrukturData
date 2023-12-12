package Praktikum.Pertemuan16;

public class ListMahasiswaMain {
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa ("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa ("201235", "Akhleema","021xx2");
        Mahasiswa m2 = new Mahasiswa ("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        //ganti linearSearch ke binarySearch
        lm.update(lm.binarySearch("201235"), new Mahasiswa ("201235", "Akhleema Lela", "021xx2")); 
        System.out.println("");
        lm.tampil();
    }
}
