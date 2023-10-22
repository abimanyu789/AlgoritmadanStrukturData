package Praktikum.Pertemuan6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    public void tambah(Mahasiswa m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    public void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }
    public void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            for (int j = 1; j < listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    //proses swap/penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    public void selectionSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int idxMin = i; 
            for(int j = i+1; j < listMhs.length; j++){ 
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin]; 
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
