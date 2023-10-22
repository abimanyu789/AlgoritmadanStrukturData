package Praktikum.Pertemuan6;
public class BukuPengurutan {
    public static void bubbleSortBySize(Buku[] bukuArr) {
        int n = bukuArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bukuArr[j].getTinggiBuku() > bukuArr[j + 1].getTinggiBuku()) {
                    Buku temp = bukuArr[j];
                    bukuArr[j] = bukuArr[j + 1];
                    bukuArr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSortByJmlHal(Buku[] bukuArr) {
        int n = bukuArr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (bukuArr[j].jmlhHal < bukuArr[min].jmlhHal) {
                    min = j;
                }
            }
            Buku temp = bukuArr[min];
            bukuArr[min] = bukuArr[i];
            bukuArr[i] = temp;
        }
    }
    public static void print(Buku[] bukuArr){
        System.out.println("----------------------------------------------------------\n"+
                           "|        Judul Buku       | Jumlah Halaman | Ukuran Buku |\n"+
                           "----------------------------------------------------------");
        for (Buku buku : bukuArr) {
            System.out.printf("| %-23s | %-14d | %-12s |%n", buku.judulBuku, buku.jmlhHal, buku.sizeBuku);
            System.out.println("------------------------------------------------------------");
        }
    }
}
