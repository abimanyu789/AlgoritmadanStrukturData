package Praktikum.Pertemuan7.Queue;

public class MahasiswaQueue {
    int front, rear, size, max;
    Mahasiswa[] antrian;
    
    public MahasiswaQueue (int n){
        max = n;
        Create();
    }
    public void Create(){
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }
    public void Enqueue (Mahasiswa data) {
        if (IsFull()) {
        System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = data;
            size++;
        }
    }
    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("","",0,0.0);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    public void Clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue behasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
            System.out.print(antrian[i].nim+" "+antrian[i].nama
                    +" "+antrian[i].absen+" "+antrian[i].ipk); 
            i = (i + 1) % max;
            System.out.println("");
        }
        System.out.println(antrian[i].nim +" "+antrian[i].nama
                    +" "+antrian[i].absen+" "+antrian[i].ipk);
        System.out.println("\nJumlah elemen = " + size);
        }
    }
    public void Peek() {
        if (!IsEmpty()) {
        System.out.println("Antrian terdepan: "+ antrian[front].nim+" "
        +antrian[front].nama+" "+antrian[front].absen+" "+antrian[front].ipk);
        } else {
        System.out.println("Queue masih kosong");
        }
    }
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang: "+antrian[rear].nim+" "
            +antrian[rear].nama+" "+antrian[rear].absen+" "+antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekPosition(String nim) {
        if (!IsEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (antrian[i].nim.equals(nim)) {
                    int position = (i - front + max) % max;
                    System.out.println("Mahasiswa dengan NIM "+ nim +" berada pada posisi(index): "+position);
                    return;
                }
            }
            // Cek elemen akhir
            if (antrian[rear].nim.equals(nim)) {
                int position = (rear - front + max) % max;
                System.out.println("Mahasiswa dengan NIM "+nim+" berada pada posisi: "+position);
            } else {
                System.out.println("Mahasiswa dengan NIM "+nim+" tidak ditemukan dalam antrian");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }    
    public void printMahasiswa(int position) {
        if (!IsEmpty() && position >= 0 && position < size) {
            int index = (front + position) % max;
            System.out.println("Data mahasiswa pada posisi " + position + " dalam queue:");
            System.out.println("NIM: " + antrian[index].nim);
            System.out.println("Nama: " + antrian[index].nama);
            System.out.println("Absen: " + antrian[index].absen);
            System.out.println("IPK: " + antrian[index].ipk);
        } else if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Posisi tidak valid");
        }
    }
    
}
