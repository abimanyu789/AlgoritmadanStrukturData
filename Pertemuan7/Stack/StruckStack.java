package Praktikum.Pertemuan7.Stack;

public class StruckStack {
    int size, top;
    StrukBelanja data[];

    public StruckStack(int size) {
        this.size = size;
        data = new StrukBelanja[size];
        top = -1;
    }
    public boolean IsEmpty() {
        return top == -1;
    }
    public boolean IsFull() {
        return top == size - 1;
    }
    public void Push(StrukBelanja strukBelanja) {
        if (!IsFull()) {
            top++;
            data[top] = strukBelanja;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public StrukBelanja Pop() {
        if (!IsEmpty()) {
            StrukBelanja strukBelanja = data[top];
            top--;
            return strukBelanja;
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }
    public StrukBelanja Peek() {
        if (!IsEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }
    public void Print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
        System.out.println("");
    }
    public void Clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
