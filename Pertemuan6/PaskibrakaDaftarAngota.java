package Praktikum.Pertemuan6;
public class PaskibrakaDaftarAngota {
    Paskibraka list[] = new Paskibraka[5];
    int id ;
    
    public void tambah(Paskibraka n){
        if (id < list.length){
            list[id] = n;
            id++;
        } else {
            System.out.println("Data sudah Penuh");
        }
    }
    public void tampil(){
        for(Paskibraka n : list){
            if (n != null) {
                n.tampil();
            }
        }
    }
    public void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] != null && list[max] != null && list[j].tinggi > list[max].tinggi) {
                    max = j;
                }
            }
            if (list[max] != null) {
                Paskibraka tmp = list[max];
                list[max] = list[i];
                list[i] = tmp;
            }
        }
    }    
    //modifikasi Tugas no2
    public void seleksiTinggi(){
        boolean status = false;
        for (int i = 0; i < list.length; i++){
            if (list[i] != null && list[i].tinggi >= 170){
                System.out.println("-------------------\n"+
                                    " Nama : "+list[i].nama+"\n"+
                                    " Kelas : "+list[i].kelas+"\n"+
                                    " Tinggi : "+list[i].tinggi+"\n"+
                                    "-------------------");
                status = true;
            } else if (status = false) {
                System.out.println("Tidak ada Yang lolos pada seleksi");
            }
        }
    }
}
