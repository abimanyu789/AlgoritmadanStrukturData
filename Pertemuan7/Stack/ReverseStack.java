package Praktikum.Pertemuan7.Stack;

public class ReverseStack {
    int size, top;
    char data[];
    
    public ReverseStack(int size){
        this.size = size;
        data = new char[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    } 
    public boolean IsFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public void Push(char c){
        if (!IsFull()){
            top++;
            data[top] = c;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public void Pop(){
        if (!IsEmpty()){
            char x = data[top];
            top--;
            System.out.println(""+x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void Peek(){
        System.out.println("Elemen teratas: "+data[top]);
    }
    public void Print(){
        for (int i = top; i >= 0; i--){
            System.out.print(data[i]+"");
        }
        System.out.println("");
    }
    public void Clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
