package Praktikum.Pertemuan2;

public class Balok {
    public int panjang,lebar,tinggi;

    public Balok(int p, int l, int t){
        panjang=p;
        lebar=l;
        tinggi=t;
    }

    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}
