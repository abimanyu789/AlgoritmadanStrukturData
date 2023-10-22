package Praktikum.Pertemuan6;
public class BukuMain {
    public static void main(String[] args) {
        Buku[] bukuArr = new Buku[]{
            new Buku("Algoritma Pemrograman", 1292, "B5"),
            new Buku("Basis Data", 400, "A4"),
            new Buku("Dasar Pemrograman", 294, "B3"),
            new Buku("Rekayasa Perangkat Lunak", 824, "B2")
        };

        System.out.println("Daftar Buku sebelum diurutkan:");
        BukuPengurutan.print(bukuArr);

        //Pengurutan Buku
        BukuPengurutan.bubbleSortBySize(bukuArr);
        System.out.println("\nDaftar Buku Berdasarkan Tinggi (asc):");
        BukuPengurutan.print(bukuArr);
        
        BukuPengurutan.selectionSortByJmlHal(bukuArr);
        System.out.println("\nDaftar Buku Berdasarkan Jumlah Halaman (asc):");
        BukuPengurutan.print(bukuArr);
    }
}
