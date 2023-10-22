package Praktikum.Pertemuan7.Stack;

public class StrukBelanja {
    String noTransaksi,tglBeli;
    int jmlBarang;
    double totalBayar;

    public StrukBelanja(String noTransaksi, String tglBeli, int jmlBarang, double totalBayar) {
        this.noTransaksi = noTransaksi;
        this.tglBeli = tglBeli;
        this.jmlBarang = jmlBarang;
        this.totalBayar = totalBayar;
    }
    public String toString() {
        return "================================================\n"+
                "\t Nomor Transaksi: "+noTransaksi+"\n"+
                "\t Tanggal Pembelian: "+tglBeli+"\n"+
                "\t Jumlah Barang Dibeli: "+jmlBarang+"\n"+
                "\t Total Harga Bayar: "+totalBayar+
                "\n================================================";
    }
}
