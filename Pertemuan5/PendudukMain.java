import java.util.Scanner;
public class PendudukMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah penduduk: ");
        int jumlah = sc.nextInt();
        Penduduk data[] = new Penduduk[jumlah];
        
        for(int i=0; i<jumlah; i++){
            System.out.println("Penduduk ke-"+(i+1));
            System.out.print("NIK\t: ");
            int nik = sc.nextInt();
            sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine(); 
            System.out.print("Alamat\t: ");
            String alamat = sc.nextLine();
            System.out.print("Jenis Kelamin\t: ");
            String jk = sc.nextLine();
            System.out.println();

            data[i] = new Penduduk(nik,nama,alamat,jk);
        }

        System.out.println("--- DATA PENDUDUK ---");
        System.out.println("NO\t\tNIK\t\tNAMA\t\tALAMAT\t\tJENIS KELAMIN\t");
        for(int i=0; i<data.length; i++){
            System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%n", i+1,data[i].nik,data[i].nama,data[i].alamat,data[i].jk);
        }

        System.out.println("\n--- CARI DATA PENDUDUK ---");
        System.out.print("Masukkan data nik yang dicari: ");
        int kunci=sc.nextInt();
        sc.nextLine();
        int search = CariNik(kunci,data);
        System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%n", search+1,data[search].nik,data[search].nama,data[search].alamat,data[search].jk);
    }

    static int CariNik (int search, Penduduk data[]){ 
        int index = -1;
        for (int i = 0; i<data.length; i++) {
            if (search==data[i].nik) {
                index=i;
                break;
            }
        }
        return index;
    }
}
