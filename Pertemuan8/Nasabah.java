public class Nasabah {
    String nama,alamat,nomorRekening;
    Nasabah next;

    public Nasabah(String nama, String alamat, String nomorRekening, Nasabah next) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorRekening = nomorRekening;
        this.next = next;
    }
}
