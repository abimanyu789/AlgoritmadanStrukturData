package Praktikum.Pertemuan2;
import java.util.Scanner;
public class NasabahMain {
    public static void main(String[] args) {
    
        /* Program untuk no1&2
        Scanner sc = new Scanner(System.in);
        final int MAX_NASABAH = 5;

        Nasabah[] nasabahArray = new Nasabah[MAX_NASABAH];
        int jumlahNasabah = 0;
        boolean keluar = false;

        while (!keluar) {
            System.out.println("=========== \tMENU\t ===========");
            System.out.println("1. Buka Rekening");
            System.out.println("2. Lihat Saldo");
            System.out.println("3. Menabung");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Berhutang");
            System.out.println("6. Tutup Rekening");
            System.out.println("7. Keluar");
            System.out.print("Pilih tindakan (1-7): ");
            int pilih = sc.nextInt();
            System.out.println("=======================================");

            switch (pilih) {
                case 1:
                    if (jumlahNasabah < MAX_NASABAH) {
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.next();
                        System.out.print("Masukkan Alamat: ");
                        String alamat = sc.next();
                        System.out.print("Masukkan Nomor HP: ");
                        int noHP = sc.nextInt();

                        Nasabah nasabahBaru = new Nasabah(nama, alamat, noHP);
                        nasabahArray[jumlahNasabah] = nasabahBaru;

                        System.out.println("Rekening berhasil dibuka. Nomor rekening Anda: " + nasabahBaru.getNoRek()+"\n");
                        jumlahNasabah++;
                    } else {
                        System.out.println("Kapasitas maksimum nasabah telah tercapai.\n");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekLihatSaldo = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        if (nasabahArray[i].getNoRek() == noRekLihatSaldo) {
                            System.out.println("Saldo Anda: " + nasabahArray[i].lihatSaldo());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Nomor rekening tidak ditemukan.\n");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRektabung = sc.nextInt();
                    boolean foundSave = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        if (nasabahArray[i].getNoRek() == noRektabung) {
                            System.out.print("Masukkan jumlah yang ingin ditabung: ");
                            int deposit = sc.nextInt();
                            nasabahArray[i].menabung(deposit);
                            foundSave = true;
                            break;
                        }
                    }
                    if (!foundSave) {
                        System.out.println("Nomor rekening tidak ditemukan.\n");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTarikTunai = sc.nextInt();
                    boolean foundTarikTunai = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        if (nasabahArray[i].getNoRek() == noRekTarikTunai) {
                            System.out.print("Masukkan jumlah yang ingin ditarik: ");
                            int penarikan = sc.nextInt();
                            int saldoBaru = nasabahArray[i].tarikTunai(penarikan);
                            if (saldoBaru >= 0) {
                                System.out.println("PENARIKAN BERHASIL.\nSaldo Anda sekarang: " + saldoBaru);
                            }
                            foundTarikTunai = true;
                            break;
                        }
                    }
                    
                    if (!foundTarikTunai) {
                        System.out.println("Nomor rekening tidak ditemukan.\n");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekBerhutang = sc.nextInt();
                    boolean foundBerhutang = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        if (nasabahArray[i].getNoRek() == noRekBerhutang) {
                            System.out.print("Masukkan jumlah hutang: ");
                            float hutang = sc.nextFloat();
                            nasabahArray[i].berhutang(hutang);
                            foundBerhutang = true;
                            break;
                        }
                    }
                    
                    if (!foundBerhutang) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTutup = sc.nextInt();
                    boolean foundClose = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        if (nasabahArray[i].getNoRek() == noRekTutup) {
                            nasabahArray[i].tutupRekening();
                            foundClose = true;
                            break;
                        }
                    }
                    if (!foundClose) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;

                case 7:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        }
        */

        //modifikasi program untuk no3
        Scanner sc = new Scanner(System.in);
        final int MAX_NASABAH = 5;

        Nasabah[] nasabahArray = new Nasabah[MAX_NASABAH];

        int jumlahNasabah = 0;

        boolean keluar = false;

        while (!keluar) {
            System.out.println("=========== \tMENU\t ===========");
            System.out.println("1. Buka Rekening");
            System.out.println("2. Lihat Saldo");
            System.out.println("3. Menabung");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Berhutang");
            System.out.println("6. Tutup Rekening");
            System.out.println("7. Keluar");
            System.out.print("Pilih tindakan (1-7): ");
            int pilih = sc.nextInt();
            System.out.println("=======================================");

            switch (pilih) {
                case 1:
                    if (jumlahNasabah < MAX_NASABAH) {
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.next();
                        System.out.print("Masukkan Alamat: ");
                        String alamat = sc.next();
                        System.out.print("Masukkan Nomor HP: ");
                        int noHP = sc.nextInt();

                        Nasabah nasabahBaru = new Nasabah(nama, alamat, noHP);
                        nasabahBaru.bukaRekening();
                        nasabahArray[jumlahNasabah] = nasabahBaru;

                        jumlahNasabah++;
                    } else {
                        System.out.println("Kapasitas maksimum nasabah telah tercapai.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan Nomor Rekening: ");
                    int noRekLihatSaldo = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].lihatSaldo(noRekLihatSaldo);
                        if (saldo >= 0) {
                            System.out.println("Saldo Anda: " + saldo);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekMenabung = sc.nextInt();
                    boolean foundMenabung = false;
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].menabung(noRekMenabung, 0);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah yang ingin ditabung: ");
                            int deposit = sc.nextInt();
                            int saldoBaru = nasabahArray[i].menabung(noRekMenabung, deposit);
                            if (saldoBaru >= 0) {
                                System.out.println("Penabungan berhasil. Saldo Anda sekarang: " + saldoBaru);
                            }
                            foundMenabung = true;
                            break;
                        }
                    }
                    if (!foundMenabung) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTarikTunai = sc.nextInt();
                    boolean foundTarikTunai = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].tarikTunai(noRekTarikTunai, 0);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah yang ingin ditarik: ");
                            int withdrawal = sc.nextInt();
                            int saldoBaru = nasabahArray[i].tarikTunai(noRekTarikTunai, withdrawal);
                            if (saldoBaru >= 0) {
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + saldoBaru);
                            }
                            foundTarikTunai = true;
                            break;
                        }
                    }
                    
                    if (!foundTarikTunai) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekBerhutang = sc.nextInt();
                    boolean foundBerhutang = false;
                    
                    for (int i = 0; i < jumlahNasabah; i++) {
                        int saldo = nasabahArray[i].lihatSaldo(noRekBerhutang);
                        if (saldo >= 0) {
                            System.out.print("Masukkan jumlah hutang: ");
                            float hutang = sc.nextFloat();
                            nasabahArray[i].berhutang(hutang);
                            foundBerhutang = true;
                            break;
                        }
                    }
                    
                    if (!foundBerhutang) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan nomor rekening: ");
                    int noRekTutup = sc.nextInt();
                    boolean foundClose = false;

                    for (int i = 0; i < jumlahNasabah; i++) {
                        nasabahArray[i].tutupRekening(noRekTutup);
                        foundClose = true;
                        break; 
                    }

                    if (!foundClose) {
                        System.out.println("Nomor rekening tidak ditemukan.");
                    }
                break;
                case 7:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        }
    }
}
        
