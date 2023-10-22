package Praktikum.Pertemuan7.Stack;
import java.util.Scanner;
public class BukuMain {
    public static void main(String[] args) {
        BukuStack st = new BukuStack(8);
        Scanner sc = new Scanner(System.in);
        
        // char pilih;
        // do{
            // System.out.print ("Judul: ");
            // String judul = sc.nextLine();
            // System.out.print ("Nama Pengarang: ");
            // String nama = sc.nextLine();
            // System.out.print("Tahun Terbit: ");
            // int tahun = sc.nextInt();
            // System.out.print ("Jumlah Halaman: ");
            // int jml = sc.nextInt();
            // System.out.print ("Harga: ");
            // int hrg = sc.nextInt();
            
            // Buku bk = new Buku (judul, nama, tahun, jml, hrg);
            // System.out.print ("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
            // pilih = sc.next().charAt(0);
            // sc.nextLine();
            // st.Push(bk);

            // jwb modif no4
            char pilih;
            do{
                System.out.println("Menu:");
                System.out.println("1. Push (tambah data buku)");
                System.out.println("2. Pop (ambil data buku teratas)");
                System.out.println("3. Peek (lihat data buku teratas)");
                System.out.println("4. Print (cetak isi stack)");
                System.out.println("5. Keluar");
                System.out.print("Pilih operasi (1-5): ");
                int menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        System.out.print("Judul: ");
                        String judul = sc.nextLine();
                        System.out.print("Nama Pengarang: ");
                        String nama = sc.nextLine();
                        System.out.print("Tahun Terbit: ");
                        int tahun = sc.nextInt();
                        System.out.print("Jumlah Halaman: ");
                        int jml = sc.nextInt();
                        System.out.print("Harga: ");
                        int hrg = sc.nextInt();

                        Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                        st.Push(bk);
                        break;
                    case 2:
                        st.Pop();
                        break;
                    case 3:
                            st.Peek();
                        break;
                    case 4:
                        st.Print();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
                pilih = sc.next().charAt(0);
                sc.nextLine();
        } while (pilih == 'y');

        // st.Print();
        // st.Pop();
        // st.Peek();
        // st.Print();
    }
}
