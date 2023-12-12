package Praktikum.Pertemuan16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa...mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    // int linearSearch(String nim){
    //     for(int i = 0; i < mahasiswas.size(); i++){
    //         if(nim.equals(mahasiswas.get(i).nim)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }   
    int binarySearch(String nim) {
        // Mengurutkan list berdasarkan nim sebelum melakukan binary search
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));

        // Melakukan binary search pada list yang telah diurutkan
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), 
                                             (m1, m2) -> m1.nim.compareTo(m2.nim));

        return index >= 0 ? index : -1;
    }
    void sortAscendingByNIM() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }
    void sortDescendingByNIM() {
        Comparator<Mahasiswa> descendingComparator = (m1, m2) -> m2.nim.compareTo(m1.nim);
        mahasiswas.sort(descendingComparator);
    }
}
