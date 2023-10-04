import java.util.Scanner;
public class MainTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tugas No1
        System.out.println("==========\tJawaban Tugas NO1\t==========");
        int arr1[] = {17,20,26,33,37,41,53,65,73,83};
        int x[] = {41,50};
        
        System.out.println("Isi elemen Array :");
        for (int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i]+" | ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");

        System.out.println("----------\tSearching\t----------");
        for (int i=0;i<x.length;i++){
            System.out.print("# Nilai yang akan dicari: "+x[i]);
            for (int j = 0; j<arr1.length; j++) {
                if (x[i]==arr1[j]) {
                    System.out.println("\nData " + x[i] + " ada pada indeks " + j);
                    break;
                } else {
                    if (x[i]<arr1[j]){
                        System.out.println("\nData " + x[i] + " tidak ditemukan");
                        break;
                    }
                }
            }
        }
        
        //Tugas No2
        System.out.println("\n==========\tJawaban Tugas NO2\t==========");
        String arr2[][] = {
                            {"Alfi","Safira","Tiara","Arif","Erdi"},
                            {"Yudha","Nisa","Yulia","Fauzan","Dwi"},
                            {"Dewa","Ana","Abdul","Dani","Ammar"}
                        };
        System.out.println("==========  Daftar Kelompok Mahasiswa  ===========");
        for (int i=0;i<arr2.length;i++){
            System.out.print("Kelompok "+(i+1)+" : ");
            for (int j=0;j<arr2[i].length;j++){
                System.out.print("\t"+arr2[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan nama mahasiswa yang akan dicari : ");
        String cari = sc.nextLine();
        boolean found = false;
        for (int i=0;i<arr2.length;i++){
            for (int j=0; j<arr2[i].length; j++) {
                if (cari.equalsIgnoreCase (arr2[i][j])) {
                    System.out.println("Mahasiswa bernama "+cari+" berada pada kelompok ke-"+(i+1)+" dan urutan ke-"+(j+1)+" dalam kelompok.");
                    found = true;
                    break;
                }
            }
            if (found) { break; }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan nama " + cari + " tidak ditemukan.");
        }

        //Tugas NO3
        System.out.println("\n==========\tJawaban Tugas NO3\t==========");
        int arr3[] = {12,15,6,3,70,51,83,15,3,83};
        int max = 0, count = 0;
        
        System.out.println("Isi elemen Array :");
        for (int i=0; i<arr3.length; i++) {
            System.out.print(arr1[i]+" | ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max) {
                max = arr3[i];
                    count = 1;
            } else if (arr3[i] == max) {
                    count++;
            }
        }
        
        System.out.println("Nilai terbesar dalam array adalah: " + max);
        System.out.print("Posisi index dengan nilai terbesar dalam array: ");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
