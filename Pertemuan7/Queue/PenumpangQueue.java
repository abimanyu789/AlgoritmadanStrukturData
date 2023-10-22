package Praktikum.Pertemuan7.Queue;

public class PenumpangQueue {
    int front, rear, size, max;
    Penumpang[] Q;

    public PenumpangQueue (int n){
        max = n;
        Create();
    }
    public void Create(){
        Q = new Penumpang[max];
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
    public void Enqueue (Penumpang data) {
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
            Q[rear] = data;
            size++;
        }
    }
    public Penumpang Dequeue() {
        Penumpang data = new Penumpang ("", "", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
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
    public void Peek() {
        if (!IsEmpty()) {
        System.out.println("Elemen terdepan: "+ Q[front].nama+" "+Q[front].kotaAsal
                +" "+Q[front].kotaTujuan+" "+Q[front].jmlTiket+" "+Q[front].harga);
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
            System.out.print(Q[i].nama+" "+Q[i].kotaAsal
                    +" "+Q[i].kotaTujuan+" "+Q[i].jmlTiket+" "+Q[i].harga); 
            i = (i + 1) % max;
            System.out.println("");
        }
        System.out.println(Q[i].nama +" "+Q[i].kotaAsal
                    +" "+Q[i].kotaTujuan+" "+Q[i].jmlTiket+" "+Q[i].harga);
        System.out.println("\nJumlah elemen = " + size);
        }
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
    //jwb modif soal no4
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang: "+Q[rear].nama+" "+Q[rear].kotaAsal
                    +" "+Q[rear].kotaTujuan+" "+Q[rear].jmlTiket+" "+Q[rear].harga);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
