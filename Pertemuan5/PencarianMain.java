import java.util.Scanner;
public class PencarianMain {
    public static void main(String[] args) {
        double[] data={2.7, 2.9, 3.04, 3.12, 3.54, 3.87, 3.9}; 
        OrderedSearch os = new OrderedSearch (data);
        System.out.println("Isi elemen array: ");
        os.tampilkan ();
        double key = 3.12;
        int index = os.cari (key);
        if (index!= -1) {
            System.out.println("Data "+key+" pada index "+ index);
        } else{
            System.out.println("Data "+key+" tidak ditemukan");
        }

        //modif no3
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Masukkan ukuran array: ");
        // int size = sc.nextInt();
        // double[] data = new double[size];
        // System.out.println("Masukkan elemen-elemen array:");
        // for (int i = 0; i < size; i++) {
        //     System.out.print("Elemen ke-" + (i + 1) + ": ");
        //     data[i] = sc.nextDouble();
        // }

        // OrderedSearch os = new OrderedSearch(data);        
        // System.out.println("Isi elemen array: ");
        // os.tampilkan();
        
        // System.out.print("Masukkan nilai yang akan dicari: ");
        // double kunci = sc.nextDouble();

        // int indeks = os.cari(kunci);
        // if (indeks != -1) {
        //     System.out.println("Data " + kunci + " ada pada indeks " + indeks);
        // } else {
        //     System.out.println("Data " + kunci + " tidak ditemukan");
        // }
        // sc.close();
    }
}