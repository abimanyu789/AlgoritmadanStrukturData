package Praktikum.Pertemuan7.Queue;

public class Queue {
    int max,size,front,rear;
    int Q[];
    
    public Queue (int n){
        max = n;
        Create();
    }
    public void Create(){
        Q = new int[max];
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
    public void Peek() {
        if (!IsEmpty()) {
        System.out.println("Elemen terdepan: "+ Q[front]);
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
            System.out.print(Q[i]+" "); 
            i = (i + 1) % max;
        }
        System.out.println(Q[i]+" ");
        System.out.println("Jumlah elemen = " + size);
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
    public void Enqueue (int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    //Jwb Tugas no1
    public void peekPosition(int data) {
        if (!IsEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (Q[i] == data) {
                    System.out.println("Posisi data " + data + " dalam queue: " + i);
                    return;
                }
            }
            // Check elemen akhir
            if (Q[rear] == data) {
                System.out.println("Posisi data " + data + " dalam queue: " + rear);
            } else {
                System.out.println("Data " + data + " tidak ditemukan dalam queue");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekAt(int position) {
        if (!IsEmpty() && position >= 0 && position < size) {
            int index = (front + position) % max;
            System.out.println("Data pada posisi " + position + " dalam queue: " + Q[index]);
        } else if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Posisi tidak valid");
        }
    }

}
