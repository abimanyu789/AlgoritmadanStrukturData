package Praktikum.Pertemuan6;
public class Paskibraka {
    String nama,kelas;
    int tinggi;

    public Paskibraka(String nm, String kls, int tng){
        nama = nm;
        kelas = kls;
        tinggi = tng;
    }
    public void tampil(){
        System.out.println("-------------------\n"+
                            " Nama : "+nama+"\n"+
                            " Kelas : "+kelas+"\n"+
                            " Tinggi : "+tinggi+"\n"+
                            "-------------------");
    }
}
