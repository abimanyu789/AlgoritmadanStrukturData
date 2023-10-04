import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa [10];
        mhs[0] = new Mahasiswa ("19970506001", "Alfatih", 3.9);
        mhs[1] = new Mahasiswa ("19910421002", "Gitta", 3.8);
        mhs[2] = new Mahasiswa ("19950322002", "Amanda", 3.75);
        mhs[3] = new Mahasiswa ("19980129001", "Kevin", 3.5);
        mhs[4] = new Mahasiswa ("19990208002", "Windy", 3.92);
        mhs[5] = new Mahasiswa ("19970710001", "Belva", 3.6);
        mhs[6] = new Mahasiswa ("19920602001", "James", 3.7);
        mhs[7] = new Mahasiswa ("19901106002", "Aruna", 3.3);
        mhs[8] = new Mahasiswa ("19981005002", "Sabrina", 3.55);
        mhs[9] = new Mahasiswa ("19991201001", "Agus", 3.65);
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String cari = sc.nextLine();
        for (int i=0; i<mhs.length; i++) {
            if (cari.equalsIgnoreCase (mhs [i].namaMahasiswa)) {
                System.out.println("Nama \t: "+ mhs[i].namaMahasiswa);
                System.out.println("NIM \t: "+ mhs [i].nim);
                System.out.println("IPK \t: "+ mhs[i].ipk);
                return;
            }
        }

        //modifikasi no2
        // System.out.print("Masukkan nama mahasiswa yang dicari: ");
        // String cari = sc.nextLine();
        // for (int i=0; i<mhs.length; i++) {
        //     if (cari.equalsIgnoreCase (mhs[i].namaMahasiswa)) {
        //         System.out.println("Nama \t: "+ mhs[i].namaMahasiswa);
        //         System.out.println("NIM \t: "+ mhs[i].nim);
        //         System.out.println("IPK \t: "+ mhs[i].ipk);
        //         return;
        //     }
        // }
        // System.out.println("Data tidak ditemukan");

        //modifikasi no3
        // System.out.print("Masukkan nim mahasiswa yang dicari: ");
        // String cari = sc.nextLine();
        // for (int i=0; i<mhs.length; i++) {
        //     if (cari.equalsIgnoreCase (mhs [i].nim)) {
        //         System.out.println("Nama \t: "+ mhs[i].namaMahasiswa);
        //         System.out.println("NIM \t: "+ mhs [i].nim);
        //         System.out.println("IPK \t: "+ mhs[i].ipk);
        //         return;
        //     }
        // }
        // System.out.println("Data tidak ditemukan");
    }
}
